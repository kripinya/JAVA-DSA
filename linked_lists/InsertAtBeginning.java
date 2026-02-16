package linked_lists;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertAtBeginning {

    static Node insertAtStart(Node head, int x) {

        Node newNode = new Node(x);
        newNode.next = head;

        return newNode;
    }

    public void printList(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null)
                System.out.print(" -> ");

            curr = curr.next;   // IMPORTANT FIX
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = insertAtStart(head, 5);

        InsertAtBeginning obj = new InsertAtBeginning();
        obj.printList(head);
    }
}