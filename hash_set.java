import java.util.*;
public class hash_set{
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("A");
        queue.add("V");
        queue.add("J");
        queue.add("R");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator<String> itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        queue.remove();
        System.out.println();
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.poll());

//        Iterator<String> itr2=queue.iterator();
//        while(itr2.hasNext()){
//            System.out.println(itr2.next());
//        }
    }
}