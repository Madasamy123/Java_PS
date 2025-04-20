//Find the Intersection and Union of Two Sets

import java.util.HashSet;
import java.util.*;

public class intersection {
    public static void main(String [] args){
        Set<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);


        Set<Integer>set2=new HashSet<>();
        set2.add(1);
        set2.add(7);
        set2.add(11);
        set2.add(4);
        set2.add(15);

        // union

        Set<Integer>union=new HashSet<>(set1);


        union.addAll(set2);

        System.out.println(union);


        //  intersection

        Set<Integer> intersection=new HashSet<>(set1);

        intersection.retainAll(set2);

        System.out.println(intersection);



    }
}
