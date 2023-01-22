package linkedList;

public class ReturnSecondLastEleInLinList {

    public static void main(String[] args) {
        Node head = createLinkedList();
        Node secondLast = returnSecondLast(head);
        System.out.println(secondLast.data);
    }

    private static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(20);
        Node n4 = new Node(30);
        Node n5 = new Node(40);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return head;
    }

    public static Node returnSecondLast(Node head){
        Node temp = head;
        Node prev = head;

        while (temp!=null){
            if(prev.next.next == null)
                return prev;
            else
                prev = temp;

            temp = temp.next;
        }
        return prev;

    }


}
