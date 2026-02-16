package linked_lists;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class search_in_LL {
    static int searchKey(Node head, int key){
        int pos =1;
        Node curr = head;
        while(curr != null){
            if(curr.data == key)
                return pos;
            curr = curr.next;
            pos++;
        }
        return 0;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int key = 3;
        int result = searchKey(head,key);
        if(result == 0){
            System.out.println("element not present");
        } else {
            System.out.println("element present at pos: " + result);
        }
    }
}
