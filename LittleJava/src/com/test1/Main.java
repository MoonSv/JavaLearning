package com.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        testHuiwen();
    }

    public static void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ScannerTest, Please a string:");
        String str = sc.nextLine(); //读取整型输入
        String revStr = "";
        for (int i = 0; i < str.length(); i++){
            revStr = str.charAt(i) + revStr;
        }
        System.out.println(revStr);
    }
    public static void testHuiwen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ScannerTest, Please the number:");
        String textStr = sc.nextLine();  //读取整型输入
        if (textStr == null || textStr.equals("")){
            System.out.println("False");
            return;
        }
        for(int i = 0; i < textStr.length()/2; i++){
            int j = textStr.length() - 1 - i;
            if(textStr.charAt(i) != textStr.charAt(j)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
    public static void scannerTest1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ScannerTest, Please the number:");
        int number = sc.nextInt();  //读取整型输入
        if (number < 2 || number > 20){
            System.out.println("Please enter the number between 2 and 20");
            return;
        }
        for (int i = 1; i < 10; i++){
            System.out.println(number + " x " + i + " = " + number * i);
            //2 x 1 = 2
        }
    }
}
