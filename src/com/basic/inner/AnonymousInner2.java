package com.basic.inner;

public class AnonymousInner2 {

	public static void main (String [] args) {
		AnonymousInner2 inner2 = new AnonymousInner2 ();
		inner2.anonymousMethod(new Animal () {
			@Override
			public void run () {
				System.out.println ("Dog is running");
			}
		});		
	}
	public void anonymousMethod (Animal animal) {
		animal.run();
	}
	
}

class Animal {
	public void run () {
		System.out.println ("Animal is running");
	}
}
