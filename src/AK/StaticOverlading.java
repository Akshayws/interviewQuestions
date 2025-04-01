package AK;
class X{
	static void method() {
		System.out.println("Akshay");
	}
}
public class StaticOverlading extends X {
	static void method() {
		System.out.println("Preeti");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//X.method();
		StaticOverlading obj= new StaticOverlading();
		obj.method();

	}

}
