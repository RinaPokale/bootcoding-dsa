package linkedList;

public class MaxNumInLinList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printMaxInLinkedList(head);
    }
    public static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;

        return head;
    }

    public static void printMaxInLinkedList(Node head){
        Node temp = head;
        int max = temp.data;

        while (temp!=null){
            if(temp.data > max)
                max = temp.data;
            temp = temp.next;
        }
        System.out.println(max);
    }

}
