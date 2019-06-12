package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String NAME = "Jon";
        Person alex = new Person();
        System.out.println(alex.height + " height");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height for Alex: ");
        alex.height = input.nextInt();
        System.out.println(alex.height + " new height");
        alex.say(NAME);
    }

}

