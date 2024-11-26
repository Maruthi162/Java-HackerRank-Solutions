package Data_Structures.LinkedLists.Deletion;

class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

public class DeletingAtTheLast {

    public static void TraverseLinkedList(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

    // delete element at start
    public static ListNode DeleteAtLast(ListNode head) {

        // edge case
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }

        // pointer
        ListNode ptr = head;

        // move the pointer to 2nd last node
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }

        ptr.next = null;

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
        ListNode newHead = DeleteAtLast(n1);
        // after deleting value
        System.out.println("After deleting 25 at last");
        TraverseLinkedList(newHead);

    }
}
