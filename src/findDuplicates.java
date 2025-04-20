
//Detect Duplicates in a List using Set

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;




public class findDuplicates {
    public static void main(String [] args){

        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,2,4,1,5,2,6,4,8));

        Set<Integer>seen=new HashSet<>();
        Set<Integer>duplicates=new HashSet<>();

        for(Integer num:numbers){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
//        System.out.println(seen);
        System.out.println(duplicates);

    }

}















//public class findDuplicates {
//    public static void main(String [] args){
//
//        List<Integer> numbers= new ArrayList<>(Arrays.asList(1,2,3,2,4,1,5,2,6,4,8));
//        Set<Integer> duplicates=new HashSet<>();
//
//        for(int i=0;i<numbers.size();i++){
//            for(int j=i+1;j<numbers.size();j++){
//                if(numbers.get(i).equals(numbers.get(j))){
//                    duplicates.add(numbers.get(i));
//                }
//            }
//        }
//
//        System.out.println(duplicates);
//
//    }
//
//}
