package practice;

// Write a Java program to remove duplicates from an ArrayList.

import java.util.*;

//public class removeDuplicates {
//
//    public static void main(String [] args){
//
//        List<Integer> arr= Arrays.asList(1,2,1,3,2,5,3,7,3,4,1,6);
//        List<Integer>result=new ArrayList<>();
//
//        for(int i=0;i<arr.size();i++){
//            if(!result.contains(arr.get(i))){
//                result.add(arr.get(i));
//            }
//        }
//
//        System.out.print(result);
//
//
//
//    }
//}


public class removeDuplicates {

    public static void main(String [] args){

        List<Integer> arr= Arrays.asList(1,2,1,3,2,5,3,7,3,4,1,6);
        Set<Integer> result=new TreeSet<>();

        for(int i=0;i<arr.size();i++){
            result.add(arr.get(i));
        }

        System.out.print(result);


    }
}
