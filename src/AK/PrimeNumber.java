package AK;

public class PrimeNumber {
	public static Boolean PrimeNum(int x) {
		
		if(x<=1) {
			return false;
			
		}
		for(int i=2;i<=x;i++) {
			if(x%i==0)
				return false;
		}
		return true ;
	}
	public static void main(String[] args) {
		
       int x=22;
       System.out.println(x+" is prime ? "+PrimeNum(x));
	}

	

}
