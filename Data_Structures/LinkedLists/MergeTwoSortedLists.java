package Data_Structures.LinkedLists;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

public class MergeTwoSortedLists {

    public static ListNode MergeSortedLists(ListNode l1, ListNode l2) {
        // lets take dummy node
        ListNode dummy = new ListNode(Integer.MIN_VALUE);

        // let's make dummy node as header
        ListNode ptr = dummy;

        while (l1 != null && l2 != null) {
            // compare l1 and l2 values
            if (l1.value <= l2.value) {
                // connect to dummyNode
                ptr.next = l1;
                // move l1 pointer
                l1 = l1.next;
            } else {
                // connect l2 value to dummy node
                ptr.next = l2;
                // move l2 pointetr
                l2 = l2.next;
            }
            // move the current pointet
            ptr = ptr.next;
        }
        // If one of the lists is not empty, append it to the merged list
        if (l1 == null) {
            ptr.next = l2;
        } else if (l2 == null) {
            ptr.next = l1;
        }

        // return the next of dummy node bcs that will be our head

        return dummy.next;
    }

    public static void main(String[] args) {
        // sorted list 1
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);

        // sorted list 2
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(5);
        l2.next.next.next = new ListNode(6);
        l2.next.next.next.next = new ListNode(20);

        ListNode mergedList = MergeSortedLists(l1, l2);

        // print merged list
        while (mergedList != null) {
            System.out.println(mergedList.value);
            mergedList = mergedList.next;
        }

    }
}
