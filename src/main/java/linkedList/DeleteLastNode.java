package linkedList;

public class DeleteLastNode {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
        System.out.println("\nAfter deletion of last node:- ");
        head = deleteLastNode(head);
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

    private static Node deleteLastNode(Node head){
        Node temp = head;

        while (temp != null){
            if(temp.next.next == null)
                temp.next = null;
            return head;
        }
        return head;
    }
}
