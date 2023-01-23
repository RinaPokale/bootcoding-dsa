package linkedList;

public class DetectCycleInLinList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        System.out.println(detectCycle(head));
    }

    private static Node createLinkedList(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(0);
        Node n4 = new Node(-4);

        Node head = n1;
        n1.next = n2;
        n2.next = n1;
        n3.next = n4;
        n4.next = n2;

        return head;
    }

    private static boolean detectCycle(Node head){
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(fastPointer == slowPointer)
                return true;

        }
        return false;
    }
}
