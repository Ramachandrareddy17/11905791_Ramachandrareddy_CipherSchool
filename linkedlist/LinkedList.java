package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
        }
    }
    static LinkedList insert(LinkedList list, int value){
        Node new_node = new Node(value);
        if(list.head==null){
            list.head = new_node;
        }else {
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    static LinkedList insertAtBegin(LinkedList list,int value){
        Node curr = new Node(value);
//        if(list.head == null){
//            list.head = curr;
//        }else{
//            curr.next = list.head;
//        }
        curr.next = list.head;
        return list;
    }
    static void print(LinkedList list){
        Node curr = list.head;
        while(curr!=null){
            System.out.println(curr.data+" ");
             curr = curr.next;
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(bfr.readLine());
//        String str = bfr.readLine();
//        System.out.println(str+5);
//        int n = Integer.parseInt(str);
//        System.out.println(n+5);
        LinkedList linkedList = new LinkedList();
        linkedList.insert(linkedList,5);
        linkedList.insert(linkedList,25);
        linkedList.insert(linkedList,35);
        linkedList.insert(linkedList,45);
        linkedList.insert(linkedList,55);

        linkedList.insertAtBegin(linkedList,10);

        linkedList.print(linkedList);

    }
}
