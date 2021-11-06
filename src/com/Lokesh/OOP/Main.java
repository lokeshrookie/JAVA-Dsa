package com.Lokesh.OOP;

import javax.xml.stream.util.StreamReaderDelegate;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Student Default = new Student();
        System.out.println("" +
                "This is default constructor");
        System.out.println(Default.name);
        System.out.println(Default.number);
        System.out.println();
        Student aparna = new Student("Aparna");
        System.out.println("Single parameter constructor");
        System.out.println(aparna.name);
        System.out.println(aparna.number);
        System.out.println();

        Student Lokesh = new Student("lokesh", 32);
        System.out.println("This is two parameter constructor");
        System.out.println(Lokesh.name);
        System.out.println(Lokesh.number);
        System.out.println();
    }
}

class Student {
    String name;
    int number;

    Student(){
//            this("lokesh",29);
        this.name = "lokesh";
        this.number = 29;
    }


    Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //constructor overloading
    Student(String name){
        this.name = "single";
    }

}

