package com.program1;

import java.util.Scanner;
/*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first Input:");
		double a = scan.nextInt();
		System.out.println("Enter Second Input:");
	double b = scan.nextInt();
		
		while(true) {
			System.out.println("1 Addition");
			System.out.println("2 Subtraction");
			System.out.println("3 Multiplication");
			System.out.println("4 Division");
			System.out.println("My choice:");
			
			int n = scan.nextInt();
			
			
			switch (n) {
			
			case 1:
				double sum = a+b;
				System.out.println("Addition is:"+ sum);
				
				break;
			case 2:System.out.println("Subtraction is:"+ (a-b));
			
			break;
			case 3:System.out.println("Multiplication is:"+ (a*b));
			
			break;
			case 4:System.out.println("Division is:"+ (a/b));
			
			break;
			
			}
		}
	}

}
