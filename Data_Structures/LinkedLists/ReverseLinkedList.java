package Data_Structures.LinkedLists;

import java.util.Stack;

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }
}


public class ReverseLinkedList {

    public static ListNode Reverse(ListNode l1){
        //using stack (LIFO) so that we can easily access LinkedList items in reverse order
        Stack<Integer> stk=new Stack<>();
        //dummy node
        ListNode reverseList=new ListNode(Integer.MIN_VALUE);
        //pointer to traverse list
        ListNode ptr=l1;
        while(ptr!=null){
            //push each element to stack
            stk.push(ptr.value);
            ptr=ptr.next;
        }
        //pointer of new node to add stack elements
        ListNode rPt=reverseList;
        while(!stk.isEmpty()){
            //adding stack elements to new LinkedList
            rPt.next=new ListNode(stk.pop());
            rPt=rPt.next;
        }
        //return next node of dummy node as head
        return reverseList.next;
    }
    public static void main(String[] args) {
        ListNode n1=new ListNode(10);
        n1.next= new ListNode(20);
        n1.next.next= new ListNode(30);
        n1.next.next.next= new ListNode(40);

        ListNode reverse= Reverse(n1);

        while(reverse!=null){
            System.out.println(reverse.value);
            reverse=reverse.next;
        }
    }
}
