package com.weeklyTests;
/*
class A {
	A(){
		System.out.println("Parent Constructor");
	}
}
class B extends A{
	B(){
		System.out.println("Child Constructor");
	}
}
public class Test31_08_2026 {
	public static void main(String[] args) {
		new B();
	}
}
*/

/*
public class Test31_08_2026{
	int id=100;
	Test31_08_2026(int id){
		id=id;
	}
	void display() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		Test31_08_2026 t=new Test31_08_2026();
		t.display();
	}
}
*/

/*
public class Test31_08_2026 {
    class E {
        E() {
            this.display();
        }
        void display() {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Test31_08_2026 obj = new Test31_08_2026();
        E e = obj.new E();
    }
}
*/

/*
public class Test31_08_2026 {
    static class A {
        A() {
            System.out.println("A");
        }
    }
    static class B extends A {
        B() {
            this(10);
            System.out.println("B0");
        }
        B(int x) {
            super();
            System.out.println("B1");
        }
    }
   public static void main(String[] args) {
        new B();
    }
}
*/

/*
public class Test31_08_2026{
	static class A{
		A(){
			System.out.println("Welcome");
		}
		public static void main(String[] args) {
			A a=null;
		}
	}
}
*/