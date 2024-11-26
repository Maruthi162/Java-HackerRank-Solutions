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

        Stack<Integer> stk=new Stack<>();
        ListNode reverseList=new ListNode(0);
        ListNode ptr=l1;
        while(ptr!=null){
            stk.push(ptr.value);
            ptr=ptr.next;
        }
        ListNode rPt=reverseList;
        while(!stk.isEmpty()){
            rPt.next=new ListNode(stk.pop());
            rPt=rPt.next;
        }

        return reverseList;
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
