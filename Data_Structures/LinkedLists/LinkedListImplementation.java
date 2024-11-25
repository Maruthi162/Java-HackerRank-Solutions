package Data_Structures.LinkedLists;


//implement listNode class
class ListNode{
    int value;     //data
    ListNode next; //address of next node

    public ListNode(int value){
        this.value=value;
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        //creating 4 nodes in memory
        ListNode l1= new ListNode(10);
        ListNode l2= new ListNode(20);
        ListNode l3= new ListNode(30);
        ListNode l4= new ListNode(40);

        //creating links between each node
        l1.next=l2; //assigning address og l2 to l1.next
        l2.next=l3;
        l3.next=l4;
        l4.next=null; //since l4 is last node assiging null

        //traversing LinkedList
        ListNode ptr=l1; // starting with head node
        while(ptr!=null){
            System.out.println(ptr.value);
            ptr=ptr.next;
        }
    }
}
