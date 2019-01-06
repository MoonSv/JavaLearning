package com.java.io;

import java.io.*;

public class FIleHelper {
    public static void copy(File file1, File file2) throws IOException {
        InputStream inputStream = System.in;
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        // 读file1
        String content = "";
        String line = bufferedReader.readLine();
        while(line != null){
            content += line + "/n";
            line = bufferedReader.readLine();
        }
        // 关闭input系列流
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();
        // 写入file2
        bufferedWriter.write(content);
        // // 关闭output系列流
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
    }
}
