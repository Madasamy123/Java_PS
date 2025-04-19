
//Remove Duplicates from a List
//List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

import java.util.*;




public class duplicates {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> set = new TreeSet<>();

        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }

        System.out.println(set);

    }
}



//public class duplicates {
//    public static void main(String [] args){
//        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//
//        List<Integer> newList= new ArrayList<>();
//
//         for(int i=0;i<list.size();i++){
//             if(!newList.contains(list.get(i))){
//                 newList.add(list.get(i));
//             }
//         }
//
//         System.out.print(newList);
//
//    }
//}


