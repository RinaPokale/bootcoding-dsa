package linkedList;

public class PrintEvnInLinList {
    public static Node createLinkedList(){
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(3);
        Node n4 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node head = n1;

        return head;
    }

    public static void printEvenNum(Node head){
        Node temp = head;
        while (temp!= null){
            if(temp.data % 2 == 0)
                System.out.println(temp.data);

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = createLinkedList();
        printEvenNum(head);
    }
}
