package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Coordinates coordinates = new Coordinates();
        System.out.println(Arrays.toString(coordinates.move("UUU")));
        System.out.println(Arrays.toString(coordinates.move("URDL")));
    }

}