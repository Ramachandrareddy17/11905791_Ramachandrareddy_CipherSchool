package collection;

import java.util.Comparator;
import java.util.LinkedList;

public class ExploringLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(55);
        linkedList.add(35);
        linkedList.add(65);
        linkedList.add(25);
        int n = linkedList.size()/2;
        System.out.println(linkedList.get(n));
        linkedList.sort(Comparator.naturalOrder());
        System.out.println(linkedList);
        linkedList.remove(2);
//        linkedList.remove(2);

    }
}
