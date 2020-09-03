package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите имя собаки:");
	Scanner in= new Scanner((System.in));
	String name = in.nextLine();
	System.out.println("Введите возраст собаки:");
	int age = in.nextInt();
	Dog dog = new Dog(name, age);
    }
}
