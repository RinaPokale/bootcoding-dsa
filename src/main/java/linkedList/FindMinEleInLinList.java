package linkedList;

public class FindMinEleInLinList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        System.out.println(returnMinEle(head));
    }
    private static Node createLinkedList(){
        Node n1 = new Node(20);
        Node n2 = new Node(10);
        Node n3 = new Node(50);
        Node n4 = new Node(40);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return head;
    }

    private static int returnMinEle(Node head){
        int min = head.data;
        Node temp = head.next;

        while (temp!= null){
            if(temp.data < min)
                min = temp.data;

            temp = temp.next;
        }
        return min;
    }
}
