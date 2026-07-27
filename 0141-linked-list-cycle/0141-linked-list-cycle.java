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
        
        if(head == null){
            return false;
        }
        ListNode Slow = head;
        ListNode Fast = head.next;

        while(Slow != null || Fast != null){
            if(Fast == null || Fast.next == null){
                return false;
            }
            if(Fast == Slow){
                return true;
            }
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        return false;
    }
}