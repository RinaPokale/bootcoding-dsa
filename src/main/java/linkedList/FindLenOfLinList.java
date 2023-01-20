package linkedList;

public class FindLenOfLinList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        System.out.println(printLengthOfLinList(head));
    }

    private static Node createLinkedList(){
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

    private static int printLengthOfLinList(Node head) {
        int length = 0;
        Node temp = head;

        while (temp != null){
            length++;
            temp = temp.next;
        }

        return length;

    }


}
