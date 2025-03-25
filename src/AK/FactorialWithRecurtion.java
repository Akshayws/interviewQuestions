package AK;

public class FactorialWithRecurtion {
	public static int  factors(int a) {
		
		if(a==0||a==1) {
			return  1;
			
		}
		return a*factors(a-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=10;
       System.out.println("Factorial:"+factors(a));
	}



}
