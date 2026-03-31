package Assingments;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Codes {

	public static void main(String[] args) {
		
//		ArrayList<String> arraylist = new ArrayList<>();
//		
//		arraylist.add("white");
//		arraylist.add("red");
//		arraylist.add("black");
//		arraylist.add("green");
//		arraylist.add("yellow");
//		
//		Iterator<String> iter = arraylist.iterator();
//		
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
//		
//		arraylist.add(0,"pink");
		
//		Iterator<String> ite = arraylist.iterator();
//		
//		while(ite.hasNext())
//		{
//		
//			System.out.println(ite.next());
//		}
		
//		System.out.println(arraylist.get(3));
//		
//		
//		arraylist.set(3, "cyan");
//		
//		Iterator<String> ite = arraylist.iterator();
//		while(ite.hasNext())
//			{
//			
//				System.out.println(ite.next());
//			}
		
//		arraylist.remove(3);
//		
//		Iterator<String> ite = arraylist.iterator();
//		
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
//		System.out.println(arraylist.contains("black"));
		
//		Collections.sort(arraylist);
//
//		Iterator<String> ite = arraylist.iterator();
//		
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
//		ArrayList<String> a = new ArrayList<>();
//		
//		a.addAll(arraylist);
		
//		Iterator<String> ite = arraylist.iterator();
//		
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
//		Collections.copy(arraylist, a);
//		
//		Iterator<String> ite = a.iterator();
//		
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
//		Collections.shuffle(arraylist);
//		
//		Iterator<String> ite = arraylist.iterator();
//		
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
//		Collections.reverse(arraylist);
//		
//		Iterator<String> ite = arraylist.iterator();
//		
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
//		Set<String> treeset = new TreeSet<>(Collections.reverseOrder());
//		
//		treeset.add("white");
//		treeset.add("red");
//		treeset.add("black");
//		treeset.add("green");
//		treeset.add("yellow");
//		
//		Iterator<String> iter = treeset.iterator();
//		
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
//		
//		Set<String> ts = new TreeSet<>();
//		
//		ts.addAll(treeset);
//		
//		Iterator<String> ite = ts.iterator();
//		
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		
		TreeSet<String> treeset = new TreeSet<>();
		
		treeset.add("white");
		treeset.add("red");
		treeset.add("black");
		treeset.add("green");
		treeset.add("yellow");
		
		Iterator<String> iter = treeset.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
//		System.out.println(treeset.first());
//		System.out.println(treeset.last());
		
		System.out.println(treeset.ceiling("black"));
		
	
		
	}

}
