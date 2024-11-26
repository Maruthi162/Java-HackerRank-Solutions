package Data_Structures.LinkedLists.Insertion;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }
}

public class InsertingInTheMiddle {
    //Traversing LinkedList
    public static void TraverseLinkedList(ListNode head){
        ListNode ptr=head;
        while(ptr!=null){
            System.out.println(ptr.value);
            ptr=ptr.next;
        }
    }
    //Insert at position
    public static ListNode InsertAtMiddle(ListNode head, int position, int valueToInsert){
        ListNode newNode=new ListNode(valueToInsert);
        ListNode ptr=head;
        for(int i=1;i<position;i++){
            ptr=ptr.next;
        }

        //isert new node at position

        newNode.next=ptr.next;
        ptr.next=newNode;

        return head;

    }
    public static void main(String[] args) {

        ListNode n1= new ListNode(21);
        ListNode n2=new ListNode(22);
        ListNode n3= new ListNode(23);
        ListNode n4= new ListNode(24);
        ListNode n5= new ListNode(25);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        TraverseLinkedList(n1);
        InsertAtMiddle(n1,3,50);
        System.out.println("After Inserting 50 at 3");
        TraverseLinkedList(n1);

        
    }
}
