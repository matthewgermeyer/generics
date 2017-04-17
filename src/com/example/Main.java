package com.example;

import java.awt.*;

/*
Write a simple Wrapper class with the following methods

No empty constructor
Only one constructor that takes E
Getter and setter
getType method that returns the String name of the class of E
hashCode, equals and toString
 */
public class Main {

    public static void main(String[] args) {
        Wrapper<String> words = new Wrapper<>("THese are words");
        System.out.println(words.getType());

        Wrapper<Integer> count = new Wrapper<>(13);
        System.out.println(count.getType());

        Point point = new Point(0, 0);
        Wrapper<Point> origin = new Wrapper<>(point);
        System.out.println(origin.getType());

    }
}
