package LinkedList;

 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null ;
        }
        if(head.val == val){
            return removeElements(head.next, val);
        }
        head.next = removeElements(head.next, val);
        return head;
    }
}
public class RemoveElementByRecursion {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        Solution sol = new Solution();
        sol.removeElements(head , 6);

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
