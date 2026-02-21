package linked_lists;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class DeleteAtEnd {

    static Node deleteAtEnd(Node head) {

        if(head == null){
            return null;
        }

        // if only one node
        if(head.next == null){
            return null;
        }

        Node secLast = head;

        while(secLast.next.next != null){
            secLast = secLast.next;
        }

        secLast.next = null;

        return head;
    }

    static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteAtEnd(head);

        printList(head);
    }
}