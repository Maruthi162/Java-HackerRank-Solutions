package Data_Structures.LinkedLists.Insertion;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }
}

public class InsertingAtBegining {

    //method to insert value at the begining of the Node
    public static ListNode InsertAtBegining(ListNode head, int valueToInsert){
        //create new node for value to insert
        ListNode newNode= new ListNode(valueToInsert);
        //connect new node to head node so that it will become head now
        newNode.next=head;
        //now point to the new node
        head=newNode;

        //return new head
        return head;
    }

    //method to traverse the linkedLilst
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

        ListNode n1=new ListNode(10);
        ListNode n2=new ListNode(20);
        ListNode n3=new ListNode(30);
        ListNode n4=new ListNode(40);
        ListNode n5=new ListNode(50);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        //LinkedList before inserting
        TraverseLinkedList(n1);
        //Inserting 101
        ListNode newNode=InsertAtBegining(n1, 101);
        //LinkedListAfter Inserting
        TraverseLinkedList(newNode);
    }
}
