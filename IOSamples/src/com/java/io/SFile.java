package com.java.io;

import java.io.*;

public class SFile {
    private String dir;
    public SFile(String dir){
        this.dir = dir;
    }
    public String readToString() throws Exception{

        System.out.println(this.dir);
        FileInputStream fileInputStream = new FileInputStream(this.dir);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String content = "";
        String line = bufferedReader.readLine();
        while(line != null){
            content += line + "/n";
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
        return content;
    }
    public void writeToString(String content) throws  IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(this.dir);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(content);
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
    }
}
