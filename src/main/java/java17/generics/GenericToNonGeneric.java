package java17.generics;

import java.util.ArrayList;

public class GenericToNonGeneric {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
		l.add("durga");
		//l.add(10); 			// Error
		m1(l);
		System.out.println(l);
		//l.add(20.5)			// Error
	}

	public static void m1(ArrayList l) {

		l.add(10);            // works
		l.add(10.5);
	}
}
