package com.company.Question1;

public class Fiction extends Book implements iBorrowable{
    public int borrowDate = 0;
    public int returnDate = 0;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return super.getTitle() + " all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        return day < borrowDate && day > returnDate;
    }
}
