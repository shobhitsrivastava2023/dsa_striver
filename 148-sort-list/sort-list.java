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
    //finding the middle node of a LL
    public static ListNode findMiddle(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head; 
        while(fast!=null &&fast.next!=null){
            fast = fast.next.next; 
            slow = slow.next; 
        }
        return slow; 

    }
    //merging the sorted Linked Lists
    public static ListNode mergeLL(ListNode leftHead, ListNode rightHead){
        ListNode dummy = new ListNode(-1); 
        ListNode temp = dummy; 
        while(leftHead!=null && rightHead !=null){
            if(leftHead.val <= rightHead.val){
                temp.next = leftHead;
                leftHead = leftHead.next;      
            }else{ 
                temp.next = rightHead; 
                rightHead = rightHead.next; 
            }
             temp = temp.next;
           
           
        }
          if(leftHead != null){
            temp.next = leftHead; 
        } else {
            temp.next = rightHead;
        }

        return dummy.next;
    }
    //sortList function 
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = findMiddle(head); 
        ListNode leftHead = head; 
        ListNode rightHead = middle.next; 
        middle.next = null; 
        leftHead = sortList(leftHead); 
        rightHead = sortList(rightHead); 
        return mergeLL(leftHead, rightHead); 

        
    }
}