package com.question1;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static int getNameValue(String name){
        int res = 0;
        for (int i = 0; i < name.length(); i++){
            res += Integer.valueOf(name.charAt(i));
        }
        return res;
    }

    public static void printStudentArray(ArrayList<Student> list){
        for (Student student : list){
            System.out.print("id = " + student.id + "name = " + student.name + "gpa = " + student.gpa + "birthday = " + student.dateOfBirth.toString());
        }
    }

    public static void main(String[] args) throws ParseException {
	// write your code here
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Amanda", 4.0, new
                    SimpleDateFormat("yyyy-MM-dd").parse("1989-03-20")));
        list.add(new Student(2, "YaokunRen", 2.5, new
                SimpleDateFormat("yyyy-MM-dd").parse("1997-09-18")));
        list.add(new Student(3, "Jason", 3.0, new
                SimpleDateFormat("yyyy-MM-dd").parse("1997-09-20")));
        list.add(new Student(4, "Justin", 1.0, new
                SimpleDateFormat("yyyy-MM-dd").parse("2000-03-20")));
        list.add(new Student(5, "JingzhouTao", 3.5, new
                SimpleDateFormat("yyyy-MM-dd").parse("1979-03-20")));
        list.add(new Student(6, "JiandongZhang", 4.2, new
                SimpleDateFormat("yyyy-MM-dd").parse("1998-02-20")));

        // Sort by name
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int a = getNameValue(o1.name);
                int b = getNameValue(o2.name);

                return a < b ? -1 : a == b ? 0 : 1;
            }
        });
        System.out.println("Sort by name:");
        printStudentArray(list);

        // Sort by gpa
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                double a = o1.gpa;
                double b = o2.gpa;

                return a > b ? -1 : a == b ? 0 : 1;
            }
        });
        System.out.println("Sort by gpa:");
        printStudentArray(list);

        // Sort by date of birth
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                long a = o1.dateOfBirth.getTime();
                long b = o2.dateOfBirth.getTime();
                return a < b ? -1 : a == b ? 0 : 1;
            }
        });
        System.out.println("Sort by date of birth:");
        printStudentArray(list);
    }
}


class Student{

    public int id;
    public String name;
    public double gpa;
    public Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

}