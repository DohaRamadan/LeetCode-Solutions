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
  public ListNode removeNthFromEnd(ListNode head, int n) {
        int numOfNodes =0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            numOfNodes ++;
        }
        if(numOfNodes == 1)
            return null;
        int nodeIndex = numOfNodes - n;
        ListNode iter = head;
        int i=0;
        while(iter != null){
            if(nodeIndex > 0 && i == nodeIndex - 1){
                ListNode nextofNext = iter.next.next;
                iter.next = nextofNext;
            }else if(nodeIndex == 0 && i == nodeIndex){
                ListNode nextOfIter = iter.next;
                iter = nextOfIter;
                head = nextOfIter;
            }
            iter = iter.next;
            i++;
        }
        return head;
    }
}