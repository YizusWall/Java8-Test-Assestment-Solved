import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDataStructure {

    public static void main(String... s){
    
        List<String> list=new ArrayList<>(Arrays.asList("msg1","msg2","msg3"));
        List<Integer> list=Arrays.asList(6,6,6,2,7,7,8);

        //copying data with CopyOnWriteArrayList to LinkedList 
        System.out.print("CopyOnWriteArrayList example "+"\n");
        processCopyOnWriteArrayList(list); 
        //longest duplicate integer
        int maxRep=getMaxValueDuplicated(list);  
        System.out.print("Maximum longest duplicate integer: "+maxRep);

    }
    
    public static void processCopyOnWriteArrayList(List<String> list){

    List<String> result = new LinkedList<>();
   
    CopyOnWriteArrayList<String> values= new CopyOnWriteArrayList<>(list);
    Iterator<String> iterator = values.iterator();
    iterator.forEachRemaining(result::add);
    result.forEach(System.out::println);
   
    }

    //
    public static int getMaxValueDuplicated(List<Integer> list){

        int max=Integer.MIN_VALUE;
        int count=0;
        int lastMax=0;
        //max=Collections.frequency(list, x);
        list.forEach(x->{
            if(x>max) {
                max =x;
                if(max!=lastMax) count=0;
                lastMax=max;
             };
             if(x==max) cont++;
        });
        return cont;
    }

    

    
}