
package com.yizuslabs.java.assestment;

import java.util.List;
import java.util.stream.IntStream;

public class StringDataStructure {

    public StringDataStructure() {

    }
    
    static String res =""; 

    public static void main(){

        String bin1="101101";
        String bin2="111101";
        String result=getSumBinary(bin1,bin2);
        System.out.println("Sum of binary: "+bin1+" + "+bin2+" = "+result);


     }

     private static String getSumBinary(String bin1, String bin2){

        bin1.chars().forEach(x->System.out.println(x));

        return null;

     }

     public static void commonSubstring(List<String> a, List<String> b) {
      // Write your code here
      IntStream.range(0,a.size()).forEach(x->{
           String result = existCharInString(a.get(x), b.get(x));
          System.out.println(result);
      });
      
      }
  
  public static String existCharInString(String a, String b){
      res = "NO";
  
      a.chars().mapToObj(c->(char)c).filter(c->b.contains(String.valueOf(c))).forEach(c->res="YES");
      return res;
  }


}