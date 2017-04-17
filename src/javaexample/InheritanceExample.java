package javaexample;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.name);
		p.print();

	}

}

class Parent{
	String name = "parent";
	final void print() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	String name = "Child";
	void print1() {
		System.out.println("Child");
	}
}
class Kid extends Child{
	String name = "Child";
	void print1() {
		System.out.println("Child");
	}
}
