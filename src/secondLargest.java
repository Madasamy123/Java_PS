//Find the Second Highest Number in a List
//
//
//List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

import java.util.*;

// Find the second largest element in an array.

import java.util.*;

//class Main {
//    public static void main(String[] args) {
//
//
//        int [] arr = {1,2,3,4,5,6,7};
//
//        int largest=arr[0];
//        int secondLargest=arr[0];
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
//
//        }
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=largest &&  arr[i]>secondLargest){
//                secondLargest=arr[i];
//            }
//        }
//
//        System.out.print(secondLargest);
//
//
//
//    }
//}

















//public class secondLargest {
//    public static void main(String [] args){
//
//        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
//
//        int max=0;
//        int secondmax=0;
//
//        for(int i=0;i<list.size();i++){
//            if(max<list.get(i)){
//                max=list.get(i);
//            }
//        }
//        for(int i=0;i<list.size();i++){
//            if(secondmax<list.get(i) & max!=list.get(i)){
//                secondmax=list.get(i);
//            }
//        }
//
//        System.out.println(secondmax);
//    }
//}


public class secondLargest {
    public static void main(String [] args){

        List<Integer> list = Arrays.asList(10, 20, 30, 40,80, 50);

        Collections.sort(list,Collections.reverseOrder());

        int secondLargest=list.get(1);

        System.out.println(secondLargest);

    }
}
