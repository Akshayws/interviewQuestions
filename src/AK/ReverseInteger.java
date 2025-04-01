package AK;

public class ReverseInteger {

	public static void main(String[] args) {
		int arr=5005;
		System.out.println(ReverseInt(arr));
		//ReverseInt(arr);
	}

	private static boolean ReverseInt(int number) {
		// TODO Auto-generated method stub
		int reverse=0;
		int original=number;
		while(number>0) {
		    int digit =number%10;
			reverse=reverse*10 + digit;
			//System.out.println(reverse);
			number/=10;
			//System.out.println("divide:"+number);
		}
		return original==reverse;
		
	}
}
