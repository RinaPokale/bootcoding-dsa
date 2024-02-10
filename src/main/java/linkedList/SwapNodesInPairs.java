package linkedList;

//24. Swap Nodes in Pairs

public class SwapNodesInPairs {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode fast = head; //+3
        ListNode slow = head; //+1
        ListNode prev = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next;

            if(prev.next!=fast){
                prev.next = fast;
                prev = slow;
            }

            slow.next = slow.next.next;
            fast.next = slow;

            if(slow == head)
                head = fast;

            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);


        ListNode newHead = swapPairs(head);
        ListNode temp = newHead;

        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
