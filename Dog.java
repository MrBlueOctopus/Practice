package com.company;

public class Dog {
    private String name;
    private int age;
    private String description;

    public Dog(String name, int age) {
        name = name;
        age = age;
    };
    public void Set_age(int age){
        age=age;
    };
    public void Set_name(String name){
        name=name;
    };
    public int Human_age (int age){ //если возраст еще не введен
        this.Set_age(age);
        return 7*age;
    };
    public int Human_age(){ //если возраст уже указан
        return 7*age;
    };
    public String toString(){
        return description;
    };
}