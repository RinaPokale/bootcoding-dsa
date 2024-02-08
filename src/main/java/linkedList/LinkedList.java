package linkedList;

//operations:-
//addFirst(int data)
//addLast(int data)
//addMiddle(int index, int data)
//removeFirst()
//removeLast()
//treverse() --> print()
//size()

public class LinkedList {
    //defination of data
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    //declared static 'cuz value should be common for all the object
    public static Node head;
    public static Node tail;
    public static int size; // for size of the linked list

    public void addFirst(int data){
        Node n = new Node(data); // step-1:- create new node

        //if linkedList is empty
        if(head == null){
            head = tail = n;
            size++;
            return;
        }
        //if exist atleast 1-node
        n.next = head; // link //step-2
        head = n; // step-3
        size++;
    }

    public void addLast(int data){
        Node n = new Node(data); // step-1:- create new node

        //if LinkedList is empty
        if(head == null){
            head = tail = n;
            size++;
            return;
        }

        //if exist atleast 1-node
        tail.next = n; //link // step-2
        tail = n; // step-3
        size++;
    }

    public void addMiddle(int index, int data){
        // i <= index-2 'cuz we are 1-step forward, when we enter in loop, value of prev-pt get changed to next node
        Node prev = head;
        for(int i = 0; i < index-1; i++){
            prev = prev.next;
        }

        Node n = new Node(data);
        n.next = prev.next;
        prev.next = n;
        size++;
    }

    public int removeFirst(){
        int val;
        //if linked is empty
        if(head == null){ // size = 0
            System.out.println("Linked is Empty");
            return Integer.MIN_VALUE;
        }
        //if exist only one node in LL
        else if(head == tail){ // head.next == null // size = 1
            val = head.data; // val = tail.data
            head = tail = null; // head = tail = head.next
            size--; // size = 0
            return val;
        }
        //if exist more than 1-node in LL
        val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        int val;
        //if linked is empty
        if(head == null){
            System.out.println("Linked is Empty");
            return Integer.MIN_VALUE;
        }
        //if exist only one node in LL
        else if(head == tail){
            val = tail.data; // val = head.data
            head = tail = null;
            size--;
            return val;
        }

        //if exist more than 1-node in LL
        Node temp = head;
        while(temp.next != tail){ // (temp.next == tail) --> prev
            temp = temp.next;
        }

        val = tail.data;
        temp.next = null;
        tail = temp;
        size--;

    /* ** OR **
        tail = temp
        tail.next = null */


    /* ** 2-pointer approach **
        Node prev = temp;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        val = tail.data;
        prev.next = null;
        tail = prev;
    */

    /*
        //since you've size property you can use that as well
        //prev = i : size -2
        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
    */
        return val;
    }

    //print linked list
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp);
    }

    //return the size of linked list
    public int size(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    // search for a key in LL. Return the position where it is found. if not found return -1
    public int itrSearch(int key){ // O(n)
        int indx = 0;
        Node temp = head;
        while(temp!= null){
            if(temp.data == key){
                return indx;
            }
            indx++;
            temp = temp.next;
        }
        return -1;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(20);
        ll.print();
        ll.addFirst(10);
        ll.print();
        ll.addLast(30);
        ll.print();
        ll.addLast(40);
        ll.print();

        System.out.println("\nAfter remove first operation:- ");
        int val = ll.removeFirst();
        System.out.println("Removed data:- " +val);
        ll.print();

        System.out.println("\nAfter remove Last operation:- ");
        val = ll.removeLast();
        System.out.println("Removed data:- " +val);
        ll.print();

        System.out.println("\nAdd middle:-");
        ll.addMiddle(1, 50);
        ll.print();

        ll.addMiddle(2, 60);
        ll.print();

        System.out.println("\nsize of the LL using size():- " +ll.size());
        System.out.println("size of the LL using size property:-" +size);

        System.out.println("Key found at " +ll.itrSearch(60));
        System.out.println("Key found at " +ll.itrSearch(4));

    }


}
