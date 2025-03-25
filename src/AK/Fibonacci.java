package AK;

public class Fibonacci {
	private static int fibonacci(int a) {
	    
		if(a<=1)return a;
		
		return fibonacci(a-1)+fibonacci(a-2);
//		10=fib(9)+fib(8)
//		9=f(8)+f(7)
//		8=f(7)+f(6)
//		7=f(6)+f(5)
//		6=f(5)+f(4)
//		5=f(3)+f(2)	
	}
	public static void main(String[] args) {
        int a=10;
     System.out.println("Series->");
        for(int i=0;i<=a;i++) {
        	   System.out.print(fibonacci(i)+",");
        }     

	}

}
