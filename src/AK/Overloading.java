package AK;

class A{
	int a=10;
	void method1() {
		System.out.println("A class method1 "+a);
	}
}
public class Overloading extends A{
	int a=20;
	void method1() {
		System.out.println("B class method1 "+a);
	}
	public static void main(String[] args) {
		A obj1 = new Overloading();
		A obj2= new A();
		System.out.println("obj1.a->"+obj1.a);
		System.out.println("obj2.a->"+obj2.a);
		obj1.method1();
		
		obj2.method1();
	}
}
//Polymorphism applies to methods, not instance variables. 
//obj1 is declared as type , so it uses the member variable "a" from the  class "A", which is 10
//Even though the underlying object is of type Overloading , the reference type (A) determines which  "a" is accessed.
//If you were to call obj1.method1() , the method in overloading would be executed,
//and it would print 20 , demonstrating polymorphism for methods.