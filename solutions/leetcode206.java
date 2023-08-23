//leetcode 206 solution
public class leetcode206{
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }else if(head.next == null){
            return head;
        }else{
            ListNode curr = head;
            ListNode behind = head;
            ListNode front = curr.next;
            curr.next = null;
            while(front != null){
                curr = front;
                front = curr.next;
                curr.next = behind;
                behind = curr;
            }
            return curr;
        }
        
    }
}