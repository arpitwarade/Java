package Sla1;
import java.util.*;

public class Que13 {

	public static void main(String[] args) {
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str1 =sc.nextLine();
		String ostr;
		System.out.println("Enter the old string you want to replace");
		ostr =sc.nextLine();
		String nstr;
		System.out.println("Enter the new string for replace");
		nstr =sc.nextLine();
		
		String newStr = str1.replace(ostr,nstr);
		System.out.println(newStr);

	}

}
