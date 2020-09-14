import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDataStructure {

    static int count;
    static int lastMax;
    static int max;

    public CollectionsDataStructure(){
        count = 0;
        lastMax = 0;
        max=0;
    }

    public static void main(final String... s) {

        final List<String> listS = new ArrayList<>(Arrays.asList("msg1", "msg2", "msg3"));
        final List<Integer> listI = Arrays.asList(6, 6, 6, 2, 7, 7, 8);

        // copying data with CopyOnWriteArrayList to LinkedList
        System.out.print("CopyOnWriteArrayList example " + "\n");
        processCopyOnWriteArrayList(listS);
        // longest duplicate integer
        System.out.print("Maximum longest duplicate integer: " + getMaxValueDuplicated(listI));

    }

    public static void processCopyOnWriteArrayList(final List<String> list) {

        final List<String> result = new LinkedList<>();

        final CopyOnWriteArrayList<String> values = new CopyOnWriteArrayList<>(list);
        final Iterator<String> iterator = values.iterator();
        iterator.forEachRemaining(result::add);
        result.forEach(System.out::println);

    }

    //
    public static int getMaxValueDuplicated(final List<Integer> list) {

        max = Integer.MIN_VALUE;
        count = 0;
        lastMax = 0;
        //max=Collections.frequency(list, x);
        list.forEach(x->{
            if(x>max) {
                max =x;
                if(max!=lastMax) count=0;
                lastMax=max;
             }
             if(x==max) count++;
        });
        return count;
    }

    

    
}