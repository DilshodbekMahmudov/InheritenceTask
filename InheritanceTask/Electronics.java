package com.lesson.InheritanceTask;

public class Electronics{

    public static void main(String[] args) {
        Computers computers = new Computers();
        Pc pc = new Computers();
        Laptop laptop = new Computers();

        pc.burn();
        laptop.write();

        Sounds sounds = new Sounds();
        Subwoofer subwoofer =new Sounds();
        LoudSpeaker loudSpeaker = new Sounds();
        subwoofer.say();
        loudSpeaker.play();
    }

}
