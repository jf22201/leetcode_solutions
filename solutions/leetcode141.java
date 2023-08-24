public class leetcode141 {
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
            ListNode forward;
            ListNode curr;
            ListNode behindCurr;
            if(head == null){
                return false;
            }else if(head.next == null){
                return false;
            }
            else{
                behindCurr = head;
                forward = head.next;
                curr = head.next;
                int pos = 2;
                while(forward.next != null){
                    for(int i=0;i<pos;i++){
                        forward=forward.next;
                        if(forward == behindCurr){
                            return true;
                        }else if(forward.next == null){
                            return false;
                        }
                    }
                    curr = curr.next;
                    forward = curr;
                    behindCurr = behindCurr.next;
                    pos++;
                }
                return false;

            }
        }
    }
}
