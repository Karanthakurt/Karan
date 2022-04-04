package com.program2;

import java.util.Scanner;
/*Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

Output: (examples)
1) input a = 1, then output : 1
2) input a = 2, then output : 1, 3
3) input a = 3, then output : 1, 3, 5
4) input a = 4, then output : 1, 3, 5, 7 */

public class program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Input");
		int a  = scan.nextInt();
		
		
			
			int b = 1;
			int c;
			for(int j =0; j<a; j++) {
				
					c = j+b++;
					System.out.print(c+ " ");
				}
				
				
			
			
		}

	}

