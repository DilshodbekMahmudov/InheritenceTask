package com.lesson.InheritanceTask;

public class Doctor implements Surgeon,Lor{

    @Override
    public void see() {
        System.out.println("Lor -> seeing");
    }

    @Override
    public void cut() {

        System.out.println("Surgeon -> cutting");

    }

    @Override
    public void treat() {
        System.out.println("Doctor -> treating");

    }

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        Surgeon surgeon = new Doctor();
        Lor lor = new Doctor();

        doctor.treat();
        surgeon.cut();
        lor.see();




    }
}
