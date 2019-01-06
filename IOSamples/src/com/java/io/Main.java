package com.java.io;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        SFile sFile = new SFile("res/output.txt");
//        String content = sFile.readToString();
//        System.out.println(content);
        sFile.writeToString("hello, world!");
        File file1 = new File("res/input.txt");
        File file2 = new File("res/output.txt");
        FIleHelper.copy(file1, file2);
    }
}
