package com.org.gen.day7Handson;
import java.io.*;
public class ques2 {

	public static void main(String[] args)throws IOException {
        String file = "/Users/Pavan/Documents/hosts.txt";
        File myObj = new File(file);
        myObj.createNewFile();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String curLine;
        while ((curLine = bufferedReader.readLine()) != null) {
            System.out.println(curLine);
        }
        bufferedReader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(myObj));
        writer.write("Hello Everyone");
        writer.close();

    }

}
