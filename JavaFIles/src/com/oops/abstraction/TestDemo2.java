package com.oops.abstraction;

// Interview Questions:-
// 1.method 1 refers from in1 and method 3 refers from in2 then method-2 implements which interface?

interface In1 {
	void method1();

	void method2();

	default void method4() {
		System.out.println("Default method called from In1");
	}
}

interface In2 {
	void method2();

	void method3();

	default void method4() {
		System.out.println("Default method called from In2");
	}
}

//interface In3 extends In1, In2 {
interface In3 extends In2, In1 {

	@Override
	default void method4() {
		In2.super.method4();
	}

}

// Duplicate default methods named method4 with the parameters () and () are inherited from the types In1 and In2
class TestIn3Imp1 implements In3 {

	@Override
	public void method1() {
		System.out.println("Method-1 Called");
	}

	@Override
	public void method2() {
		System.out.println("Method-2 Called");
	}

	@Override
	public void method3() {
		System.out.println("Method-3 Called");
	}

}

public class TestDemo2 {

	public static void main(String[] args) {
		TestIn3Imp1 t = new TestIn3Imp1();
		t.method1();
		t.method2();
		t.method3();
		t.method4();
	}

}
