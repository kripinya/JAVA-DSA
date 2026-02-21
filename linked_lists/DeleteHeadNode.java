package linked_lists;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteHeadNode {
    static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }
    static void printList(Node head){
        while(head != null){
            System.out.print(head.data);
            if(head.next != null){
                System.out.print("->");
            }
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Node head = new Node(8);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(7);
        printList(head);
        head = deleteHead(head); 
        printList(head);
    }
}
