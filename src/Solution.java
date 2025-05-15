//import java.io.*;
//import java.util.*;
//import java.util.Scanner;
//public class Solution {
//
//    public static String removeDuplicateWords(String words){
//
//        String [] arr = words.split(" ");
//
//        StringBuilder result = new StringBuilder();
//
//        result.append(arr[0]);
//
//        for(int i=1;i<arr.length;i++){
//            if(!arr[i].equals(arr[i-1])){
//                result.append(" ").append(arr[i]);
//            }
//        }
//
//        return result.toString();
//
//
//    }
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//
//        Scanner input = new Scanner(System.in);
//
//        int num=input.nextInt();
//        input.nextLine();
//
//        for(int i=0;i<num;i++){
//            String words=input.nextLine();
//
//            String result=removeDuplicateWords(words);
//
//            System.out.println(result);
//        }
//
//    }
//}