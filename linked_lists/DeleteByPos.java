package linked_lists;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class DeleteByPos {
    static Node deleteNode(Node head, int position){
        if(head == null){
            return null;
        }
        Node temp = head;
        if(position == 1){
            head = temp.next;
            return head;
        }
        Node prev = null;
        for(int i = 1; i < position; i++){
            prev = temp;
            temp = temp.next;
            
        }
        if(temp == null){
            return head;
        }
        prev.next = temp.next;
        return head;
    }
    static void printList(Node head){
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("nullptr");
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int position = 3;
        head = deleteNode(head, position);

        printList(head);

    }
}
