package com.basic.inner;

public class AnonymousInner1 {
	public static void main (String args []) {
		Car honda = new Car () {			
			@Override
			public void drive () {
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
