/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // optimal method, used hashmaps and time complexity is much more
        // optimal using two pointers 
        ListNode slow  = head; 
        ListNode fast  = head; 
        /*
        ListNode temp = head;
        Map<ListNode, Integer> nodeMap = new HashMap<>();
        while (temp != null) {
            if (nodeMap.containsKey(temp)) {
                return true;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        } */
        while(fast != null && fast.next !=null){
             slow  = slow.next; 
             fast = fast.next.next; 

             if(fast == slow){
                 return true; 
             }
        }
        return false;
    }
}