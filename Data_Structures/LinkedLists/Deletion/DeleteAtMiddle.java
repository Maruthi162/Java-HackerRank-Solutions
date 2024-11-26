package Data_Structures.LinkedLists.Deletion;
class ListNode {
    int value ;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }
}

public class DeleteAtMiddle {

    //traversing 
    public static void TraverseLinkedList(ListNode head){
        ListNode ptr=head;
        while(ptr!=null){
            System.out.println(ptr.value);
            ptr=ptr.next;
        }
    }

    //delete in the middle
    public static ListNode DeleteInMiddle(ListNode head, int position){       // 1 2 3 4 5

        //edge cases
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
    
        // Special case: deleting the head node (index 0)
        if (position == 0) {
            head = head.next;
            return head;
        }

        ListNode ptr=head;
        //move pointer to previous node of position
        for(int i=0;i<position-1;i++){
            ptr=ptr.next;
        } 
        //node to be deleted
        ListNode nodeToDelete=ptr.next;
        //update the pointer next node of deleted node
        ptr.next=nodeToDelete.next;

        return head;

    }
    public static void main(String[] args) {

        ListNode n1 = new ListNode(21);
        ListNode n2 = new ListNode(22);
        ListNode n3 = new ListNode(23);
        ListNode n4 = new ListNode(24);
        ListNode n5 = new ListNode(25);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Before deleting value");
        TraverseLinkedList(n1);
        // delete
        ListNode newHead = DeleteInMiddle(n1, 3);
        // after deleting value
        System.out.println("After deleting 24 at 3rd position");
        TraverseLinkedList(newHead);

    }
}
