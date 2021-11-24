package com.company.Question2;

class Printer {
    private static Printer single_printer = null;

    private Printer() {

    }

    public static Printer getInstance() {
        if ( single_printer == null) {
            single_printer = new Printer();
        }
        return single_printer;
    }

    public void getConnection(){
        String info = "Your Printer is working!";
        System.out.println(info);
    }
}

