package AK;

public class SecondLargestNumber {

	private static int SecondLargest(int[] arr) {
		// TODO Auto-generated method stub
		
		
		int first=Integer.MIN_VALUE;
		int second= Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second && num!= first) {
				second=num;
				
			}
		}
		return (second==Integer.MIN_VALUE)?-1  :second;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,3};
		System.out.println(SecondLargest(arr));
		

	}

}
