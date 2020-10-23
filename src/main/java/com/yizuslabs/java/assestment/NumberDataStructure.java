package com.yizuslabs.java.assestment;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class NumberDataStructure {
    
    public static void main(){

                // first duplicate en array
                final int[] arrD = { 2, 4, 5, 6, 7, 2, 5 };
                System.out.print("first duplicate en array ");
                System.out.println(firstDuplicate(arrD));

                // Manipulate Digits
                final int number = 123456;
                System.out.print("Manipulate Arithmetic Number\n");
                System.out.println(digitsManipulations(number));
                // Count Pairs With Diff K
                System.out.println("Count Pairs With Diff K: " + countTinyPairs(arrD, number));

            }

            static int firstDuplicate(final int[] arr) {
                final Set<Integer> allItems = new HashSet<>();
                return Arrays.stream(arr).filter(i -> !allItems.add(i)).findFirst().orElse(-1);

            }
            static int total = 0;

            static int countTinyPairs(final int[] arr, final int k) {

                IntStream.range(0, arr.length).forEach(d -> {
                    total = IntStream.range(d + 1, arr.length).filter(e -> (d - e) == k || (e - d) == k).sum();
                });
                return total;
            }
            static int sum = 0;
            static int prod = 0;
            static int digitsManipulations( int n) {

                String num = String.valueOf(n);

                num.chars().mapToObj(Character::getNumericValue).filter(x->x>0).forEach(x->{
                    sum+=x;
                    prod*=x;                    
                });

      return sum+prod;

     }

}