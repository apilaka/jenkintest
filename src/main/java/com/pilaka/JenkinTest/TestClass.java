package com.pilaka.JenkinTest;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		 String[] input=new String[3];
		    String[] output=new String[3];
		    Scanner in = new Scanner(System.in);
		   // s="Hello World";
		    String s = in.nextLine();
		    String [] sArray= s.split(" ");
		    int len= sArray.length;
		    String [] sArrayReversed;
		    StringBuffer sb = new StringBuffer();
		    for(int i=len-1; i>=0; i--)
		    {
		    	sb.append(sArray[i]);
		    	sb.append(" ");
		    	
		    }
		    
		   System.out.println(sb.toString());
	}
}


 




