package com.lesson.InheritanceTask;

public class Sounds implements Subwoofer,LoudSpeaker{
    @Override
    public void play() {
        System.out.println("LoudSpeaker -> playing");

    }

    @Override
    public void say() {
        System.out.println("Subwoofer -> saying");

    }
//
//    public static void main(String[] args) {
//
//        Sounds sounds = new Sounds();
//
//        Subwoofer subwoofer =new Sounds();
//        LoudSpeaker loudSpeaker =new Sounds();
//
//
//        subwoofer.say();
//        loudSpeaker.play();
//
//    }
}
