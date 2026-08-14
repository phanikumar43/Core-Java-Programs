package com.javafiles;

public class TestDemo {
	native void display();
void hello() {
	System.out.println(Thread.currentThread());
	int a=10;
	int b=20;
	System.out.println(a+b);
	System.out.println("Hello");
	System.out.println("Hello");
	System.out.println("Hello");
}
	public static void main(String[] args) {
		TestDemo t=new TestDemo();
		t.hello();
		t.display();
		System.out.println(Thread.currentThread());
	}

}
