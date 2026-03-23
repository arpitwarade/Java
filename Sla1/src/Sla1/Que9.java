package Sla1;
import java.util.*;
public class Que9 {

	public static void main(String[] args) {
	String str;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Any String");
	str = sc.nextLine();
	int index;
	System.out.println("Enter index");
    index = sc.nextInt();
    System.out.println("The character at position " +index+" is "+str.charAt(index)); 
    sc.close();
	}
}
