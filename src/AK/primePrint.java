package AK;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class primePrint {

    public static boolean isPrime(int arr) {
        if(arr<2)return false;
        for(int i=2;i<=Math.sqrt(arr);i++){
            if(arr%i==0)return false;
        }
       
        return true;
                
               
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,23};

        List<Integer>  list = new ArrayList<>();
        for(int i:arr){
            if(isPrime(i)){
                list.add(i);
            }
        }
        Collections.sort(list);
        System.out.println(list);
       
        
                
    }
        
           
    
}
