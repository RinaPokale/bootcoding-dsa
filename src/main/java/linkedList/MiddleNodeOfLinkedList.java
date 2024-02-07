package linkedList;

//876. Middle of the Linked List

public class MiddleNodeOfLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slowpt = head;
        ListNode fastpt = head;

        while(fastpt != null && fastpt.next != null){
            slowpt = slowpt.next;
            fastpt = fastpt.next.next;
        }
        return slowpt; // slowpt --> middle node
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleNodeOfLinkedList md = new MiddleNodeOfLinkedList();
        ListNode mid = md.middleNode(head);
        System.out.println(mid.val);
    }
}
