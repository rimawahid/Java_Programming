package collection;

import java.util.*;

public class TestArrayAndLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(0, 10);
        arrayList.add(3, 30);
        System.out.println("A list of linked in the array list :");
        System.out.println(arrayList);

        LinkedList< Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "Red");
        linkedList.removeLast();
        linkedList.addFirst("Green");

        System.out.println("Display the linked list forward :");
        //System.out.println(linkedList);
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Display the linked list backward :");
        System.out.println(linkedList.size());
        //listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
    }
}
