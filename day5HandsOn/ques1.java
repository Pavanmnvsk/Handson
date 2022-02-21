package com.org.gen.day5HandsOn;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] batchId = {"ACD22XD", "ACD21DD", "ACD21FD", "ACD22RD", "KCC22WD", "MCD22UD", "KCD22ND"};
        int i = 0;
        for (String id : batchId) {
            if (id.contains("22")) {
                i++;
                System.out.println(id);
            }
        }
        System.out.println("Total Year-22 Batch: " + i +" out of "+batchId.length);


	}

}
