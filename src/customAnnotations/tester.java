package customAnnotations;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class tester {
	
	public static void main(String[] args) {
		
		LinkedList<String> letters=new LinkedList<String>();
		letters.add("A");
		letters.add("D");
		letters.add("S");
		letters.add("H");
		
		System.out.println(letters);
		
		ListIterator<String> iterator=letters.listIterator();
		
		iterator.add("E");
		
		System.out.println(letters);
		
		iterator.next();
		iterator.next();
		
		iterator.add("M");
		
		System.out.println(letters);
		
		iterator.next();
		iterator.remove();
		System.out.println(letters);
		
	}

}
