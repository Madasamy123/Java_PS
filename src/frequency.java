//Find the Frequency of Each Element in a List
//
//List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

import java.util.*;

public class frequency {
    public static void main(String [] args){

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String,Integer> frequencymap=new TreeMap<>();

        for(String items: list){
            if(frequencymap.containsKey(items)){
//                frequencymap.put(items,frequencymap.getOrDefault(items,0)+1);

                frequencymap.put(items, frequencymap.get(items)+1);
           }
            else{
                frequencymap.put(items,1);
            }

        }

       for(Map.Entry<String,Integer> entry : frequencymap.entrySet()){
           System.out.println(entry.getKey()+ " : " + entry.getValue());
       }


    }
}
