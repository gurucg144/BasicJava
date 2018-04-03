package com.basic.inner;

//First change in dev branch
public class AnonymousInner1 {
	public static void main (String args []) {
		Car honda = new Car () {			
			@Override
			public void drive () {
				//Test comment for source tree test
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
