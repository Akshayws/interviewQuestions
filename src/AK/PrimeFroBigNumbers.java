package AK;

public class PrimeFroBigNumbers {
	public static boolean check(int y) {
	  
		if(y<=1)return false;
		if(y<=3)return true;
		if(y%3==0||y%2==0) {
			return false;
		}
		for(int i=5;i*i<=y;i+=6) {
			if(y%i==0||y%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		int y=73;
		System.out.println(y+" is prime? "+ check(y));
	}


}
