package AK;

public class Largest_Smallest {

	public static void main(String[] args) {
	
		
		int arr[]= {22,4,1,5,6,8,0};
		Largest_Smallest.Find(arr);
		
	}

	private static void Find(int[] arr) {
	int largest=arr[0];
	int smallest=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			//largest
			if(arr[i]>=largest) {
				 largest=arr[i];
				
			}
			//snallest
			if(arr[i]<=smallest) {
				smallest=arr[i];
			}
			
		}
		System.out.println("largest :"+largest+ " , smallest :"+smallest);
		
		
		
	}

}
