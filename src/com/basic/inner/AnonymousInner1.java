package com.basic.inner;

//commit to master after dev commit.
public class AnonymousInner1 {
	public static void main (String args []) {
		Car honda = new Car () {			
			@Override
			public void drive () {
				//Test comment for source tree test from eclipse2
				//Test commit from IDEA
				System.out.println ("Driving Honda");
			}
		};
		honda.drive();
	}
}
class Car {
	public void drive () {
		System.out.println ("Driving Car");
	}
}
