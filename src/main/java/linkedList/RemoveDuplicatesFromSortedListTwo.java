package linkedList;

//82. Remove Duplicates from Sorted List II
/*Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list. Return the linked list sorted as well. */

public class RemoveDuplicatesFromSortedListTwo {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

//    public ListNode deleteDuplicates(ListNode head) {
//
//    }

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
        head.next.next.next = new ListNode(3);

        RemoveDuplicatesFromSortedListTwo removeDuplicatesFromSortedListTwo = new RemoveDuplicatesFromSortedListTwo();
//        ListNode newHead = removeDuplicatesFromSortedListTwo.deleteDuplicates(head);
//        removeDuplicatesFromSortedListTwo.print(newHead);
    }
}
