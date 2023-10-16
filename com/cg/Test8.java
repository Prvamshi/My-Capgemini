package com.cg;

import java.util.Scanner;

public class Test8 {
	
	
	public static void main(String[] args) {
		
		  
		int fact=1;
		
		int i=1;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		
		do {
			
			
			  fact=fact*i;
			  
			  i++;
			  
			
			
		}while(i<=num);
		
		  System.out.println(fact);
		  
		
	}

}
