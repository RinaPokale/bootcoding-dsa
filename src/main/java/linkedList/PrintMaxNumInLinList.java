package linkedList;

public class PrintMaxNumInLinList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        System.out.println(printMinInLinkedList(head));
    }
    public static Node createLinkedList(){
        Node n1 = new Node(20);
        Node n2 = new Node(10);
        Node n3 = new Node(30);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;

        return head;
    }

    public static int printMinInLinkedList(Node head){
        Node temp = head;
        int min = temp.data;

        while (temp!=null){
            if (temp.data < min)
                min = temp.data;

            temp = temp.next;
        }

        return min;
    }

}
