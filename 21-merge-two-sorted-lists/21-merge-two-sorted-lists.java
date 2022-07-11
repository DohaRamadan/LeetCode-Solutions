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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null; 
        else if(l1 == null)
            return l2; 
        else if(l2 == null)
            return l1; 
        ListNode res;
        if(l1.val <= l2.val){
            res = new ListNode(l1.val); 
            l1 = l1.next; 
        }else{
            res = new ListNode(l2.val); 
            l2 = l2.next; 
        }
        ListNode curr = res;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = new ListNode(l1.val); 
                l1 = l1.next; 
            }else{
                curr.next = new ListNode(l2.val); 
                l2 = l2.next; 
            }
            curr = curr.next; 
        }
        
        while(l1 != null){
            curr.next = new ListNode(l1.val); 
            l1 = l1.next; 
            curr = curr.next; 
        }
        
        while(l2 != null){
            curr.next = new ListNode(l2.val); 
            l2 = l2.next; 
            curr = curr.next; 
        }
        
        return res;
        
    }
}