//Sort a List of Strings by Length
//
//List<String> list = Arrays.asList("cat", "elephant", "dog", "tiger");


import java.util.*;

public class sortLength {
    public static void main(String [] args){
        List<String> list = Arrays.asList("cat", "elephant", "dog", "tiger");

        Collections.sort(list,(s1,s2)->s1.length() - s2.length());

        for(String items:list){
            System.out.println(items);
        }



    }
}

