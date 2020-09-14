import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

public class QueueDataStructure {

    Queue<Integer> que=null;
    int size=0;

    public QueueDataStructure(int k, int[] arr) {
        size=k;
        que=new PriorityQueue<Integer>();
  
        IntStream.range(0, arr.length).forEach(e->System.out.println("KthLargest element when add "+arr[e]+" is "+add(arr[e])));

   }

    private int add(int val) {
        que.offer(val);
        if(que.size()>size) que.poll();
        
        return que.peek();
    }

    public static void main(String... args) {

        int k = 3;
        int[] arr={4,5,8,2,3,5,10,9,4};

        QueueDataStructure qds=new QueueDataStructure(k, arr);

    }

    
    
}