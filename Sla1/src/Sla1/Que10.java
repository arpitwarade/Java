
package Sla1;

import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter str1 and str2");
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		
		if(str1.compareTo(str2)==0)
			System.out.println('"'+str1+" is Equal To "+'"'+str2+'"');
		else if(str1.compareTo(str2)<0)
			System.out.println('"'+str1+'"'+" is Less Then "+'"'+str2+'"');
		else
			System.out.println('"'+str1+'"'+" is Greater then "+'"'+str2+'"');
	}

}
