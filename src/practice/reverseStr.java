package practice;

public class reverseStr {
    public static void main(String [] args){

        String word="Madasamy";
        String str="";

        for(int i=word.length()-1;i>=0;i--){
            str+=word.charAt(i);

        }

        System.out.print(str);
    }
}
