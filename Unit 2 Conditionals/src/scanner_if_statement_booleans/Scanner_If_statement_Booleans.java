package scanner_if_statement_booleans;

import java.util.Scanner;

public class Scanner_If_statement_Booleans {

	
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			for(int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
				
			Scanner input = new Scanner(System.in);
			System.out.println("enter a number");
			double m = input.nextDouble();
			System.out.println("enter one of the kes 's,e,d or w' ");
			  String k = input.next();
			
			if(k.equals("s")) {
				System.out.println(Math.sqrt(m));
			}
			
			else if(k.equals("e")) {
				if(m%2 == 0) {
					System.out.println("even");
				}
				else if(m%2 == 1) {
					System.out.println("odd");
				}
				else {
					System.out.println("not a whole number");
				}
			}
			
			else if(k.equals("d")) {
				System.out.println("enter a number");
				double n = input.nextDouble();
				if (m%n == 0) {
					System.out.println("Yes, it is a factor");
				}
				else {
					System.out.println("No, it is not a factor");
				}
			}
			
			else if(k.equals("w")){
				System.out.println("enter a number");
				double u = input.nextDouble();
				if( u<m+3 && u>m-3) {
					System.out.println("It is within 3 of the first input");
				}
				else {
					System.out.println("It is not within 3 of the first input");
				}
			}
			
			else {
				System.out.println("You gave an incorrect input");
			}
			
			}
			
			
			}
	}

