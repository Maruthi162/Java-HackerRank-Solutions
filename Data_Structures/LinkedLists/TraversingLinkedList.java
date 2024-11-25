package Data_Structures.LinkedLists;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }
}

public class TraversingLinkedList {

    public static void TraverseLinkedList(ListNode head){
        //take temp variable so that we don't disturb head node
        ListNode temp=head;
        while(temp!=null){
            //access current node value
            System.out.println(temp.value);
            //move the pointer to next node
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        //create linkedlist items
        ListNode n1=new ListNode(10);
        ListNode n2=new ListNode(20);
        ListNode n3=new ListNode(30);
        ListNode n4=new ListNode(40);

        //creating links
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        //calling traversing method
        TraverseLinkedList(n1);

    }
}
