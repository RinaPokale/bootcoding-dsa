package linkedList;

public class LinkedListProOne {
    public NodeWithoutConstructor createLinkedList(){
        NodeWithoutConstructor n1 = new NodeWithoutConstructor();
        NodeWithoutConstructor n2 = new NodeWithoutConstructor();
        NodeWithoutConstructor n3 = new NodeWithoutConstructor();

        n1.data = 10; // n1 --> | 10 | ref |
        n2.data = 20; // n2 --> | 20 | ref |
        n3.data = 30; // n3 --> | 30 | ref |

        NodeWithoutConstructor head = n1;
        n1.next = n2;
        n2.next = n3;

        return head;
    }

    public static void printLinkedList(NodeWithoutConstructor head){
        NodeWithoutConstructor temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListProOne linkedListPro = new LinkedListProOne();

        NodeWithoutConstructor head = linkedListPro.createLinkedList();
        printLinkedList(head);
    }

}
