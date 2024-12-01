package Data_Structures.LinkedLists;

class ListNode{
    int value;
    ListNode next;
    public ListNode(int value){
        this.value=value;
    }
}

public class ReverseLinkedListWithoutExtraSpace {

    public static ListNode Reverse(ListNode head){    // null     10      -->  20   -->  30 -->40 ===> 10 <-- 20 <-- 30 <-- 40
        //if head is null                               pre     curr       next
        if(head == null){
            return head;
        }
        //if head has one value
        if(head.next == null){
            return head;
        }
        //pointer to pt=revious node
        ListNode preNode= null;
        //pointer to current node
        ListNode currNode= head;

        while(currNode != null){
            //pointer to next node
            ListNode nxtNode=currNode.next;
            //connect current node to previous node
            currNode.next=preNode;
            //update previous to node to current node
            preNode=currNode;
            //update current node to nxt node
            currNode=nxtNode;
        }
        return preNode;
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
