package com.basic.inner;

//Another change to master
public class RegularInnerClass {
	
	public static void main (String args []) {
		
		System.out.println ("Calling main method");
		Outer outer = new Outer ();	
		outer.innerCanaccessOuter();
	}
}

class Outer {
	private int outerint = 100;
	Inner inner;
	
	public Outer () {
		inner = new Inner ();
	}
	public void innerCanaccessOuter () {
		inner.accessOuter ();
	}
	
	class Inner {
		public void accessOuter () {
			System.out.println ("My outer int is " + outerint);
		}
 	}
}
