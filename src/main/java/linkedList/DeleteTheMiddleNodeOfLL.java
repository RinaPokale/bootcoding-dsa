package linkedList;

import java.util.List;

//2095. Delete the Middle Node of a Linked List
public class DeleteTheMiddleNodeOfLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){ // corner case for size 1
//            head = null;
//            return head;
            return null;
        }

        ListNode slowPt = head;
        ListNode fastpt = head;
        ListNode prev = head;

        while(fastpt!=null && fastpt.next!=null){
            prev = slowPt;
            slowPt = slowPt.next;
            fastpt = fastpt.next.next;
        }
        prev.next =  prev.next.next; //  slowpt.next
        return head;
    }

    public void print(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        DeleteTheMiddleNodeOfLL dlt = new DeleteTheMiddleNodeOfLL();
        ListNode newHead = dlt.deleteMiddle(head);
        dlt.print(newHead);

    }
}
