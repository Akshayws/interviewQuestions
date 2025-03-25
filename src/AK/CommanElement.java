package AK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CommanElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,4,7,9};
		int arr2[]= {1,7,8,2};
		CommanElement.Chick(arr1,arr2);

	}

	private static void Chick(int[] arr1,int[] arr2) {
		 
		Set<Integer> set= new HashSet<>();
		Set<Integer> comman= new HashSet<>();
		
		for(int i:arr1) {
			set.add(i);
		}
		for(int i:arr2) {
			if(set.contains(i)) {
				comman.add(i);
			}
		}
		System.out.println("Comman Elements : "+ Arrays.toString(comman.toArray()));//The toArray() method is used to convert a collection (like a List or Set) into an array.
		
	}

}

