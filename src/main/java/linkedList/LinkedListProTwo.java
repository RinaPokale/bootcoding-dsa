package linkedList;

public class LinkedListProTwo {
    public static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;

        return head;
    }

    public static void printLinkedList(Node head){
        Node temp = head;

        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
    }
}
