package com.program3;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Problem-3: With a single integer as the input, generate the following until a = x 
	 * [series of numbers as shown in below examples]

				Output: (examples)
				1) input a = 1, then output : 1
				2) input a = 2, then output : 1
				3) input a = 3, then output : 1, 3, 5
				4) input a = 4, then output : 1, 3, 5
				5) input a = 5, then output : 1, 3, 5, 7, 9
				6) input a = 6, then output : 1, 3, 5, 7, 9
				.
				.
				X) input a = x, then output : 1, 3, 5, 7, .......*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Input");
		int a  = scan.nextInt();
		
		
			if(a%2!=0) {
			int b = 1;
			int c;
			for(int j =0; j<a; j++) {
				
					c = j+b++;
					System.out.print(c+ " ");
				}
			}
			
			if(a%2==0) {
				int z= a-1;
				int b = 1;
				int c;
				for(int j =0; j<z; j++) {
					
						c = j+b++;
						System.out.print(c+ " ");
					}
				}
	}

}
