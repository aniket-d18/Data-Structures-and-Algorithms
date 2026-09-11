package LinkedList;

class ListNode876 {
    int val;
    ListNode876 next;
    ListNode876() {}
    ListNode876(int val) { this.val = val; }
    ListNode876(int val, ListNode876 next) { this.val = val; this.next = next; }
}

class SolutionofLinkedList {
    public ListNode876 middleNode(ListNode876 head) {
        ListNode876 slow = head;
        ListNode876 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class MiddleOfLinkedList876 {
    public static void main(String[] args) {
        ListNode876 head = new ListNode876(1,
                new ListNode876(2,
                        new ListNode876(3,
                                new ListNode876(4,
                                        new ListNode876(5)))));

        SolutionofLinkedList sol = new SolutionofLinkedList();
        ListNode876 mid = sol.middleNode(head);
        System.out.println(mid.val); // Output: 3
    }
}
