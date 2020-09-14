import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ArraysDataStructure{

    int count=0;
    public static void main(final String... s) {

        // change Century From year
        System.out.print("change Century From year ");
        MathOperation res = (
                year) -> (year >= 1 && year <= 2005) ? (year % 10 == 0) ? (year / 100) : (year / 100) + 1 : 0;
        System.out.println(res.operation(2019));

        // Sorting Banking Account
         String[] dataS = { "6", "03 10103538 2222 1233 6160 0142", "03 10103538 2222 1233 6160 0141",
                "30 10103538 2222 1233 6160 0141", "30 10103538 2222 1233 6160 0142", "30 10103538 2222 1233 6160 0141",
                "30 10103538 2222 1233 6160 0142", "5", "30 10103538 2222 1233 6160 0144",
                "30 10103538 2222 1233 6160 0142", "30 10103538 2222 1233 6160 0145", "30 10103538 2222 1233 6160 0146",
                "30 10103538 2222 1233 6160 0143" };
        System.out.print("Sorting Banking Account\n");
        getSortedBankingAccount(dataS);

        // Mutate the array Input
        final int[] dataN = { 4, 0, 1, -2, 3 };
        System.out.print("mutateTheArrayOptimize ");
        System.out.println(Arrays.toString(mutateTheArray(dataN)));

    }

    // mutate the Input Array
    static int[] mutateTheArray(final int[] arr)

    {
        final int[] arrN = new int[arr.length];
        IntStream.range(0,arr.length-1).filter(x->arr.length>1).forEach(x->{
              if(0==x) arrN[x]=arr[x] + arr[x + 1]; 
              else if(arr.length==x) arrN[x] = arr[arr.length-1] + arr[arr.length-2];
              else if(x!=0 || arr.length==x) arrN[x] = arr[x-1] + arr[x] + arr[x +1];              
        });
        return arrN;
    }
    // Sorting Banking Account inputArrayString:ias
    static void getSortedBankingAccount(final String[] ias) {

        final Map<String, Integer> mapa = new TreeMap<String, Integer>();

        IntStream.range(0, ias.length).filter(s->String.valueOf(ias[s]).length()>=26).forEach(s->{
            // each element of stream not exist in Map as key no repeatable
            if(!mapa.containsKey(ias[s])) mapa.put(ias[s],0);
            // each Stream element as Key and value increment plus 1
            mapa.put(ias[s],mapa.get(ias[s])+1);
        });
        //finally, for each key and value of TreeMap i show the ouput result.
        mapa.forEach((key,value)->System.out.println(key+" "+value));
    }

    boolean compare(int[] a, int[] b){
        if(a.length==b.length){ //first condition
            count=0;
			IntStream.range(0,a.length).forEach(x->{
               IntStream.range(0,b.length).filter(y->a[x]==b[y]).forEach(y->count++);
            });
    
            if(count==a.length) return true;
        } 
    
        return false;
    }
    
    

}


interface MathOperation {
   public int operation(int a);

 }