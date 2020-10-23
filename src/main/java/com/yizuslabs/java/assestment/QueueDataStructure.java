package com.yizuslabs.java.assestment;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

public class QueueDataStructure {

    Queue<Integer> que=null;
    int size=0;
    int cont=0;
    int como=0;


    public QueueDataStructure( int k,  int[] arr,  int mock) {

        if(mock==0)this.getKthLargest(arr,k);
        else if(mock==1)    System.out.println("result "+Arrays.toString(this.getTopKFrequent(arr,k)));
        

   }


    private int[] getTopKFrequent( int[] nums, int s) {        
        
     Map<Integer,Integer> mapa=new HashMap<>();

cont=0;

   //agrupar por repeat values
    IntStream.range(0, nums.length).forEach(x->{

          if(0==x) cont=1;
          else{
            if(nums[x]==nums[x-1]) cont++;
            else
                cont=1;                 
          }
          mapa.put(nums[x],cont);
    });

    
      //the lest element frequence first
      que=new PriorityQueue<>((n1, n2) -> mapa.get(n1) - mapa.get(n2));

    for(int n:mapa.keySet()){     
      que.add(n);
      if(que.size()>s) que.poll();      
    }

    //add top element and then remove this.
    int[] top = new int[s];  
    for(int i =s-1; i >=0; i--)  top[i]=que.poll();

   return top;

    }

   private void getKthLargest( int[] arr,  int k) {
    size=k;
    que=new PriorityQueue<Integer>();

    IntStream.range(0, arr.length).forEach(e->System.out.println("KthLargest element when add "+arr[e]+" is "+add(arr[e])));
    
    
   }


   private int add( int val) {
        que.offer(val);
        if(que.size()>size) que.poll();
        
        return que.peek();
    }

    public static void main( String... args) {

        int k = 3;
         int[] arr={4,5,8,2,3,5,10,9,4};
        int mock=0;

        QueueDataStructure qds=new QueueDataStructure(k, arr, mock);
  
        mock=1;
        k=3;
         int[] arr2={1,1,1,2,2,2,3,3,4,5,5,5,5};
         qds=new QueueDataStructure(k, arr2, mock);

    }

    
    
}


/*abstract
Welcome to Facebook!

This is just a simple shared plaintext pad, with no execution capabilities.

When you know what language you would like to use for your interview,
simply choose it from the dropdown in the top bar.

Enjoy your interview!
  
  
// setup(list words)
//   [cat, cab, hello, chat]
// isMatch(string pattern)
//   cat  -> T
//   c.t  -> T
//   c.   -> F
//   .... -> T
//   c.r  -> F

Solution solution = new Solution({"cat", "cab", "hello", "chat"});
assert(solution.isMatch("cat") == True);
assert(solution.isMatch("ca") == False);
assert(solution.isMatch("hello") == True);
////
assert(solution.isMatch("c.t") == True);
assert(solution.isMatch("c.") == False);
assert(solution.isMatch("....") == True);
assert(solution.isMatch("c.r") == False);

  
  public class Solution{
    
  String[] words=null;
    
    
   public  Solution(){
          words={"cat", "cab", "hello", "chat"});

      setup(words);
   
   }
    
    
    public boolean setup(String[] words){

      boolean exist=false;
    
      
      
      for(String word:words){
      
          exist=isMatch(word);        
        
        
      }
      
      return exist;
   
    }
    
    public boolean isMatch(String word){
    
      
 
      return word.matches(word);
    }
    
        
    
    public static void main(final String... s) {
      
      //create 
      //loop String[]
      //for each char i
      

      //Solution sol=new Solution();
      
      assert(solution.isMatch("cat") == true);
      assert(solution.isMatch("ca") == false);
      assert(solution.isMatch("hello") == true);
        
    }
  
  
  }




*/