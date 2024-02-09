package linkedList;

import javax.swing.plaf.basic.BasicListUI;
import java.util.List;

//83. Remove Duplicates from Sorted List

public class RemoveDuplicateFromSortedLL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

//    public ListNode deleteDuplicates(ListNode head) { // 1st-approach
//        if(head == null || head.next == null){//corner case
//            return head;
//        }
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast.next != null){
//            fast = fast.next; //+1
//
//            if(slow.val == fast.val){
//                slow.next = fast.next;
//            }else{
//                slow = fast;
//            }
//        }
//        return head;
//    }

    public ListNode deleteDuplicates(ListNode head) { //2nd - approach
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;

        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

    public ListNode removeDuplicates(ListNode head) { //3rd-approach
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr;
            while (temp!=null && temp.val == curr.val){
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
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
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(3);

        RemoveDuplicateFromSortedLL removeDuplicateFromSortedLL = new RemoveDuplicateFromSortedLL();
//        ListNode newHead = removeDuplicateFromSortedLL.deleteDuplicates(head);
//        removeDuplicateFromSortedLL.print(newHead);
        ListNode nHead = removeDuplicateFromSortedLL.removeDuplicates(head);
        removeDuplicateFromSortedLL.print(nHead);
    }

}
