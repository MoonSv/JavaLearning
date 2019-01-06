package com.company;

public class Human {
    static int number;
    private String name;
    private int weight;

    public Human(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.number += 1;
    }

    public void rename(String name){
        this.name = name;
    }
    public int workout(){
        this.weight -= 5;
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void setNumber(int number) {
        Human.number = number;
    }
}
