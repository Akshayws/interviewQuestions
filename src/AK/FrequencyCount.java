package AK;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
		
       Map<Integer,Integer> fre= new HashMap<>();
       int arr[]= {1,2,3,5,7,9,8,1,8};
       
       for(int i:arr) {
    	   fre.put(i,fre.getOrDefault(i,0)+1);//fre.put(i, count) → Updates the count in the map.
       }
          
       System.out.println(fre);
		
		
		
	}

}
