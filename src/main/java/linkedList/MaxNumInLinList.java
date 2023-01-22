package linkedList;

public class MaxNumInLinList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        System.out.println("Max Element in linked list is " +returnMaxEleInLinkedList(head));
    }
    public static Node createLinkedList(){
        Node n1 = new Node(10);
        Node n2 = new Node(30);
        Node n3 = new Node(20);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;

        return head;
    }

    public static int returnMaxEleInLinkedList(Node head){
        int max = head.data;
        Node temp = head.next;

        while (temp!=null){
            if(temp.data > max)
                max = temp.data;
            temp = temp.next;
        }
        return max;
    }

}
