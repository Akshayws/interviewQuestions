package AK;

public class Factorial {

	public static int Factor(int a) {
		int fact= 1;
		for(int i=1;i<a;i++) {
		    fact*=i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		int a=10;
		System.out.println(Factor(a));
		
     
	}

}
