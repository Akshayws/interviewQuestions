package AK;
//In your code, the finally block always executes, regardless of whether an exception is thrown or not. 
//If there is a return statement inside the finally block,
//it overrides any return statement from the try or catch block.
public class ExceptionExample {

	private static int test() {
		// TODO Auto-generated method stub
		
		try {
		   int a=10/0;
			System.out.println("try block");
			throw null;
			
		}
		catch(ArithmeticException e) {
			System.out.println("catch block");
		
			return 100;
			
		}
		finally {
			System.out .println("Finall block");
			return 200;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ExceptionExample.test());

	}

	

}
