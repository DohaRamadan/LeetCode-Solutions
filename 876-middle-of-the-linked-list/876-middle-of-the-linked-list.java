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
    public ListNode middleNode(ListNode head) {
        int numOfNodes =0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            numOfNodes ++;
        }
        int middleNodeNum = 0;
        if(numOfNodes % 2 != 0)
            middleNodeNum = (numOfNodes + 1) / 2;
        else
            middleNodeNum = (numOfNodes / 2) + 1;
        ListNode iter = head;
        int i =0;
        while(iter != null){
            if(i == middleNodeNum - 1)
                return iter;
            iter = iter.next;
            i++;
        }
        return null;
    }
}