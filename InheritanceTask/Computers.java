package com.lesson.InheritanceTask;

public class Computers  implements Pc,Laptop{
    @Override
    public void write() {
        System.out.println("Laptop -> writing");

    }

    @Override
    public void burn() {
        System.out.println("Pc -> burning");

    }

    public static void main(String[] args) {

        Computers computers =new Computers();

        Pc pc =new Computers();
        Laptop laptop = new Computers();

        pc.burn();
        laptop.write();
    }
}
