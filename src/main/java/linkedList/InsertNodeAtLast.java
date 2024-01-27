package linkedList;

public class InsertNodeAtLast {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
        insertAtLastInLinList(head);
        printLinkedList(head);
    }
    private static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);

        Node head = n1;
        n1.next = n2;

        return head;
    }

    private static void printLinkedList(Node head){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void insertAtLastInLinList(Node head){
        Node temp = head;
        Node newNode = new Node(40);

        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
