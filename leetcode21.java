public class leetcode21{
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
ListNode newHead;
ListNode list1Curr;
ListNode list2Curr;
boolean list1Bool;
ListNode curr;
if(list1 == null || list2 == null){
    if(list1 != null){
        return list1;
    }
    else if(list2 != null){
        return list2;
    }
    else{
        return null;
    }
}else if(list1.val < list2.val){
    list1Bool = true;
    newHead = list1;
    list1Curr = list1.next;
    list2Curr = list2;

}
else{
    list1Bool = false;
    newHead = list2;
    list2Curr = list2.next;
    list1Curr = list1;
}
curr = newHead;

while(true){
    if(curr.next != null){
        if(list1Bool){
            if(curr.next.val < list2Curr.val){
                curr = curr.next;
                list1Curr = curr.next;
            }
            else{
                curr.next = list2Curr;
                curr = curr.next;
                list2Curr = curr.next;
                list1Bool = false;
                
            }
        }else{
            if(curr.next.val < list1Curr.val){
                curr = curr.next;
                list2Curr = curr.next;
            }
            else{
                curr.next = list1Curr;
                curr = curr.next;
                list1Curr = curr.next;
                list1Bool = true;
                
        }
        }
    }else{
        if(list1Bool){
            curr.next = list2Curr;
            return newHead;
        }else{
            curr.next = list1Curr;
            return newHead;
        }
    }
}
    }
}



}