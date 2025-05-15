package Map;
import java.util.*;

//Count Frequency of Words in a String
//
//String input = "this is a test this is only a test";


public class frequencyStr {
    public static void main(String [] args){


        String input = "this is a test this is only a test";

        String [] first=input.split(" ");


        Map<String,Integer> frequency=new HashMap<>();

        for(String words:first){

            frequency.put(words,frequency.getOrDefault(words,0)+1);
        }
//        System.out.println(frequency);


        for(Map.Entry<String,Integer> entry:frequency.entrySet()){
            System.out.println(entry.getKey()+" ; "+ entry.getValue());
        }

    }
}
