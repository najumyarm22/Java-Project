package assignment3;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {


//			Ask the USER for a string (it should print “Please enter a String:”)
//			assume the user enters “hello”
//			Convert that string to all uppercase and print it (it should print “HELLO”)
//			Print the length of that string (it should print 5)
//			Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
//			Give the last char of the string (it should print “Z”)
//			Concatenate the string from step 1 with string "Test" (it should print “hello Test”)

		
		System.out.println("Please enter a String:");
		
		Scanner ui = new Scanner(System.in);
		String a=ui.next();
		
		System.out.println(a.toUpperCase());
		a=a.toUpperCase();
		System.out.println(a.length());
		
		String b = a.charAt(a.length()-1)+"";
		System.out.println(a.replace(b, "Z"));
		//System.out.println(a.replace('O', 'Z'));
		//System.out.println(a.replace('O', 'Z').charAt(a.length()-1));
		a=a.toLowerCase();
		System.out.println(a.concat(" Test"));
		
	
	}

}
