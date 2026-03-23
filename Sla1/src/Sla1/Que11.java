package Sla1;

import java.util.Scanner;

public class Que11 {

	public static void main(String[] args) {
		String str1,endstr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter str1 and endstr2");
		str1 = sc.nextLine();
		endstr = sc.nextLine();
		for(int i=0;i<2;i++) {
			if(endstr.charAt(i)!=str1.charAt(str1.length()-2+i)) {
				System.out.println(str1+" End with "+endstr+" ?"+"False");
				return;
			}
		}
		System.out.println(str1+" End with "+endstr+" ?"+"True");
	}
}

