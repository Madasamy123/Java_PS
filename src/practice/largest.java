package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//public class largest {
//    public static void main(String [] args){
//
//        List<Integer>arr= Arrays.asList(8,15,12,98);
//        int num=0;
//
//        for(int i=0;i<arr.size();i++){
//            if(num<arr.get(i)){
//                num=arr.get(i);
//            }
//        }
//
//        System.out.println(num);
//    }
//}


public class largest {
    public static void main(String [] args){

        List<Integer>arr= Arrays.asList(8,15,12,98);

        Collections.sort(arr,Collections.reverseOrder());
        int num=arr.get(0);

        System.out.println(num);
    }
}


