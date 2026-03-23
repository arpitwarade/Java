package Sla1;

import java.util.Scanner;

public class Que15 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		str =sc.nextLine();
		String reverseStr="";
		for(int i =str.length()-1;i>=0;i--) {
			reverseStr += str.charAt(i);
		}
		System.out.println("New String: "+reverseStr);

	}

}
