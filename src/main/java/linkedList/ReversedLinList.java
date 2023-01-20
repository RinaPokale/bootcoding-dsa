package linkedList;

public class ReversedLinList {

    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
        head = reversedLinList(head);
        System.out.println();
        printLinkedList(head);
    }

    public static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return head;
    }

    public static void printLinkedList(Node head){
        Node temp = head;

        while (temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node reversedLinList(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
