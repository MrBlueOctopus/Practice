package com.company;
public class Dog {
    private String name;
    private int age;
    private String description;
    private int human_age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.human_age=7*this.age;
    };
    public String toString(){
        description="name: "+this.name+"; age: "+this.age+"; human age: "+this.human_age;
        return description;
    };
}