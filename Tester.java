package com.company;
import java.util.Scanner;

public class Tester {
    private String name;
    private int age;
    private Dog dog;
    public Tester(){
        Set_name();
        Set_age();
        dog=new Dog(name, age);
    }
    public void Set_name(){
        System.out.println("Введите имя собаки:");
        Scanner in= new Scanner((System.in));
        name = in.nextLine();
    }
    public void Set_age(){
        System.out.println("Введите возраст собаки:");
        Scanner in= new Scanner((System.in));
        age = in.nextInt();
    }
    public void Test(){
        System.out.println(dog.toString());
    }
}
