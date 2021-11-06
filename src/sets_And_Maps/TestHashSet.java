
package sets_And_Maps;
import java.util.*;
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        for(String s:set){
            System.out.print(s.toUpperCase()+ " ");
        }
        System.out.println("");
    }
          
}
