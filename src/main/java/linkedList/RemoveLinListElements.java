package linkedList;

public class RemoveLinListElements {

    private static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(20);
        Node n4 = new Node(30);
//        Node n5 = new Node(30);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;

        return head;
    }

    public static Node removeElements(Node head, int val) {
        Node temp = head;
        Node prev = head;
        while(temp!=null){
            if(head.data == val)
                head = head.next;
            else if(temp.data == val)
                prev.next = temp.next;
            else
                prev = temp;

            temp = temp.next;

        }

        return head;
    }


    private static void printLinkedList(Node head){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = createLinkedList();
        head = removeElements(head, 30);
        printLinkedList(head);
    }
}
