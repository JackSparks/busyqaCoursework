package com.busyqa.course;

public class HelloWorld {

	public static void main(String[] args) {

		//defined a type, created a variable, and assigned a value to the variable
		int a = 4;
		long b = 8;
		char c = 'A';
		double d = 4.8;
		
		byte e = 127; //can only go from -127 to 127, Can't go higher or lower or java will complain
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();

		Integer a1 = 4; //This is only possible from java 1.5 onwards. Otherwise you needed to do something like:
		//Integer a1 = new Integer(4);
		//However this only works for the standard class types. If you make a custom class, then you still need to use the long way.
		
		Long b1 = 8L; //java will complain unless you specify that its a Long
		Character c1 = 'A';
		Double d1 = 4.8;
		String s = "busyQA";
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println();
		
		int f = 1;
		int i = 1;
		int j = 1;
		
		i = ++f;
		System.out.println(i);
		
		f = 1;
		j = f++; //assigns and then incrememnts after assigning 
		System.out.println(j);
		
		System.out.println();
		
		boolean x = true;
		boolean y = false;
		boolean z = x && y;
		System.out.println(z); //note that its false
		
		boolean w = !x;
		System.out.println(w);

	}
}
