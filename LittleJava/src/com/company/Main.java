package com.company;

import com.company.Human;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Human jeff = new Human("jeff", 16);
        System.out.println(jeff.getName());
        System.out.println(jeff.getWeight());
        jeff.workout();
        System.out.println(jeff.getWeight());
        System.out.println(Human.number);
        Human.number = 10;
        System.out.println(Human.number);
    }
}
