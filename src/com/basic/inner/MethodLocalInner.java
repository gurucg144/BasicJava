package com.basic.inner;

public class MethodLocalInner {

	public static void main (String [] args) {
		Outer2 outer = new Outer2 ();
		outer.createMethodLocalClass();
		
	}
}
class Outer2 {
	private int outervariable = 100;
			
	public void createMethodLocalClass () {
		class MethodInnerClass {
			public void accessOuter () {
				System.out.println ("I can see outervariable " + outervariable);
			}
		}
		MethodInnerClass mclass = new MethodInnerClass ();
		mclass.accessOuter();
	}
}

