package linkedList;

public class PrintOddInLinList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printOddInLinkedList(head);
    }

    private static Node createLinkedList(){
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(13);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return head;
    }

    private static void printOddInLinkedList(Node head){
        Node temp = head;

        System.out.println("Odd Numbers:-");
        while (temp != null){
            if(temp.data % 2 == 1)
                System.out.println(temp.data);

            temp = temp.next;
        }
    }



}
