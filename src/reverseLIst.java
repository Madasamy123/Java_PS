import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseLIst {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> newList=new ArrayList<>();

        for(int i=list.size()-1;i>=0;i--){
            newList.add(list.get(i));

        }
        System.out.println(newList);

    }
}

//public class reverseLIst {
//    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        Collections.reverse(list);
//        System.out.println(list);
//    }
//}
