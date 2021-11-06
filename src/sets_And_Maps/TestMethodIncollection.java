package sets_And_Maps;

import java.util.*;

public class TestMethodIncollection {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.add("New York");
        System.out.println("Set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        //Delete a string from set1
        set1.remove("London");
        System.out.println("Set1 is " + set1);
        System.out.println(set1.size() + " elements in set1");

        //Create set2
        Set<String> set2 = new HashSet<>();
        set2.add("Shanghai");
        set2.add("Paris");
        set2.add("London");
        System.out.println("Set2 is " + set2);
        System.out.println(set2.size() + " elements in set2");

        System.out.println("Is Taipei in set2?" + set2.contains("Taipei"));

        set1.addAll(set2);
        System.out.println("After adding set2 to set1, set1 is " + set1);
        
        set1.removeAll(set2);
        System.out.println("After removing common elements in set2 from set1, set1 is " + set1);
        
        set1.retainAll(set2);
        System.out.println("After retaing common elements in set2 from set1, set1 is " + set1);
    }
}
