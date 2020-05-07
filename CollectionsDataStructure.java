import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsDataStructure {

    public static void main(String... s){
    
        List<String> list=new ArrayList<>(Arrays.asList("msg1","msg2","msg3"));
        //copying data with CopyOnWriteArrayList to LinkedList 
        System.out.print("CopyOnWriteArrayList example "+"\n");
        processCopyOnWriteArrayList(list);   
    }
    
    public static void processCopyOnWriteArrayList(List<String> list){

    List<String> result = new LinkedList<>();
   
    CopyOnWriteArrayList<String> values= new CopyOnWriteArrayList<>(list);
    Iterator<String> iterator = values.iterator();
    iterator.forEachRemaining(result::add);
    result.forEach(System.out::println);
   
    }

    
}