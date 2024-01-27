package linkedList;

import java.util.HashSet;

//160. Intersection of Two Linked Lists
public class IntersectionOfTwoLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode getIntersectionNodeOne(ListNode headA, ListNode headB) { //Tc & Sc --> O(n)
        ListNode temp = headA;
        HashSet<ListNode> set = new HashSet<>();

        while (temp!=null){
            set.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while (temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }

    public static ListNode getIntersectionNodeTwo(ListNode headA, ListNode headB) { //TC -> O(n+m) & Sc -> O(1)
        ListNode temp = headA;

        int lenA = 0; //len of listA
        while(temp!=null){
           temp = temp.next;
           lenA++;
        }

        temp = headB;
        int lenB = 0; //len of ListB
        while (temp != null){
            temp = temp.next;
            lenB++;
        }

        int diff = Math.abs(lenA - lenB);

        if(lenA < lenB){ //len of listB is greater
            while (diff-- != 0){
                headB = headB.next;
            }
        }
        else { //len of listA is greater
            while (diff-- != 0){
                headA = headA.next;
            }
        }

        while (headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(8);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(5);

        //LL-A
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = n1;

        //LL-B
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = n1;

        ListNode intersection = getIntersectionNodeTwo(headA, headB);
        System.out.println(intersection.val);

        System.out.println(getIntersectionNodeOne(headA, headB).val);
    }
}

