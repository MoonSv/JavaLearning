package com.company;

public class Cat extends Animal{
    public int age = 5;
    static String name = "Cat";
    public void run(){
        System.out.println("Cat is runing");
    }
    public static void eat(){
        System.out.println("Cat is eating");
    }
    public void seizeMouse(){
        System.out.println("Cat is seizing mouse");
    }
}
