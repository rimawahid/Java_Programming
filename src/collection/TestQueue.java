
package collection;
import java.util.*;
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        for (String string : queue) {
            System.out.println(string);
        }
        //queue.remove();
        System.out.println("\n"+queue.size());
        while(queue.size()>0){
            System.out.println(queue.remove()+ " ");
            
        }
    }
}
