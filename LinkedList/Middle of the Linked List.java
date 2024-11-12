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
        int len=0;
        ListNode cur=head;
        while(cur!=null)
        {
            len++;
            cur=cur.next;
        }
        int m=0;
        if(len%2==0)
            m=((len+1)/2)+1;
        else
            m=(len/2)+1;
        int c=0;
        cur=head;
        while(cur!=null)
        {
            c++;
            if(c==m)
            {
                head=cur;
                break;
            }
            cur=cur.next;
        }
        return head;
    }
}