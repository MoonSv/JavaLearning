package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.run();
        cat.eat();
        System.out.println(cat.age);
        System.out.println(cat.name);
        System.out.println("----------------------------");
        Cat cat2 = (Cat) cat;
        cat2.run();
        cat2.eat();
        cat2.seizeMouse();
        System.out.println(cat2.age);
        System.out.println(cat2.name);
    }
}
