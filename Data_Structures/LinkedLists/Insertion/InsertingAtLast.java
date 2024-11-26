package Data_Structures.LinkedLists.Insertion;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

public class InsertingAtLast {

    // method to insert element at last
    static public ListNode InserAtLast(ListNode head, int valueToInsert) {
        
        ListNode newNode = new ListNode(valueToInsert);

        if (head == null) {
            return newNode;
        }

        ListNode ptr=head;
        while(ptr.next!=null){
            //increments ptr until it reaches last node
            ptr=ptr.next;
        }
        //insert the new node at last
        ptr.next=newNode;

        return head;
        
    }

    // method to traverse linkedlist
    public static void TraverseLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(101);
        ListNode n2 = new ListNode(102);
        ListNode n3 = new ListNode(103);
        ListNode n4 = new ListNode(104);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        // before inserting value
        System.out.println("Before inserting value");
        TraverseLinkedList(n1);
        // insert
        InserAtLast(n1, 120);
        // after inserting value
        System.out.println("After inserting 110 at last");
        TraverseLinkedList(n1);

    }
}
