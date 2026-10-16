package com.weeklyTests;

/*public class Test15_08_2026 {
	static int x=20;
	static {
		x=20;
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		System.out.println(x);
	}
}*/

/*public class Test15_08_2026 {
	public static void main(String[] args) {
		int x = 100;
		double y = x;
		System.out.println(x + " " + y);
		System.out.println(x + y + " " + x + y);
	}
}*/

/*public class Test15_08_2026{
	public static void main(String[] args) {
		int x=10;
		int y=3;
		double result=x/y;
		System.out.println(result);
	}
}*/

public class Test15_08_2026 {
	static int x = 10;

	void change() {
		x = x + 10;
	}

	public static void main(String[] args) {
		Test15_08_2026 t = new Test15_08_2026();
		Test15_08_2026 t1 = new Test15_08_2026();
		t.change();
		t1.change();
		System.out.println(t.x);
		System.out.println(t1.x);
	}
}