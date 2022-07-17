package llist;

import org.w3c.dom.ls.LSOutput;

public class SinglyList {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display(){
        Node curr = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of Singly Linked List are: ");
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        SinglyList l1 = new SinglyList();

        l1.addNode(5);
        l1.addNode(7);
        l1.addNode(4);
        l1.addNode(7);
        l1.addNode(55);
        l1.display();
    }
}
