/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public static ListNode reverseLinkedList(ListNode head){ 
    ListNode prev = null; 
    ListNode current  = head; 
    ListNode next = null; 
    while(current != null){ 
        next= current.next; 
        current.next = prev; 
        prev = current; 
        current = next; 
    }
    return head = prev; 
 }
  
    

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode fast = head; 
        ListNode slow = head; 
        while(fast !=null && fast.next !=null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        // middle of the linkedList 
        ListNode secondHalf = reverseLinkedList(slow.next);
        slow.next = null; 
        ListNode firstHalf = head; 
        while(secondHalf != null){ 
            ListNode temp1 = firstHalf.next; 
            ListNode temp2 = secondHalf.next; 

            firstHalf.next = secondHalf; 
            secondHalf.next = temp1; 

            firstHalf = temp1; 
            secondHalf = temp2;  

        }

      

        
    }
}