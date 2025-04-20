//Check if Two Sets are Equal
//
//Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
//Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

import java.util.*;


public class equal {
    public static void main (String [] args){

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        if(set1.equals(set2)){
            System.out.println("Two sets are equal");
        }
        else{
            System.out.println("NOt equal");
        }

    }
}
