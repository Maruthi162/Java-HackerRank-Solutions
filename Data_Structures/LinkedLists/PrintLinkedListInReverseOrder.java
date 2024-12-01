package Data_Structures.LinkedLists;
class ListNode{
    int value;
    ListNode next;
    public ListNode(int value){
        this.value=value;
    }
}
public class PrintLinkedListInReverseOrder {

    public static void PrintLinkedListInReverseOrderWithRecurssion(ListNode head){   // 10 --> 20 --> 30 --> 40
            //base case
            if(head==null){
                return ;
            }
            //calls recurssively until reaches null and store those values on stack
            PrintLinkedListInReverseOrderWithRecurssion(head.next);

            //print recurssive call values
            System.out.println(head.value);

    }

    public static void main(String[] args) {

        ListNode n1=new ListNode(10);
        n1.next= new ListNode(20);
        n1.next.next= new ListNode(30);
        n1.next.next.next= new ListNode(40);

        PrintLinkedListInReverseOrderWithRecurssion(n1);    

    }
}
