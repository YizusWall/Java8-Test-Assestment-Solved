import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;


public class NumberDataStructures {
;

    public static void main(){

                // first duplicate en array
                int[] arrD = { 2, 4, 5, 6, 7, 2, 5 };
                System.out.print("first duplicate en array ");
                System.out.println(firstDuplicate(arrD));
        
                //Manipulate Digits
                int number=123456;
                System.out.print("Manipulate Arithmetic Number\n");
                System.out.println(digitsManipulations(number));
                //Count Pairs With Diff K
                System.out.println("Count Pairs With Diff K: "+countTinyPairs(arrD));
 
    }

    
 


    static int firstDuplicate(int[] arr) {
        Set<Integer> allItems = new HashSet<>();
       return Arrays.stream(arr).filter(i -> !allItems.add(i)).findFirst().orElse(-1);
 
     }

     static int countTinyPairs(int[] arr, int k) {
        int total=0;
        IntPredicate isDiff= e-> d-e=k || e-d=k;

        IntStream.range(0,arr.length).forEach(d->{
        total= IntStream.range(d+1,arr.length).filter(isDiff).mapToInt(d->count).sum();
        });
        return total;
     }

     static int digitsManipulations(int n){
        int sum=0;
        int prod=0;
        Stream.generate(() -> n!=0).forEach(n->{
            sum=sum+(n%10);
            n=n/10;
            prod+=prod*n;
      });
      return sum+prod;

     }

}