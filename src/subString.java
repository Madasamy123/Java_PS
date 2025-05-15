
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class subString {

    public static String firstAndLastSubString(String str,int k){

        List<String> subString=new ArrayList<>();

        for(int i=0;i<=str.length()-k;i++){
            subString.add(str.substring(i,i+k));


        }

        Collections.sort(subString);

        return subString.get(0)+"\n"+subString.get(subString.size()-1);


    }

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        String str= input.nextLine();
        int num=input.nextInt();


        String result= firstAndLastSubString(str,num);
        System.out.println(result);



    }


}
