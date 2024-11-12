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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st=new Stack<Integer>();
        ListNode temp=head;
        reverse(st,temp);
        

        
    }
    public Stack<Integer> reverse(Stack<Integer> st,ListNode head)
    {
        if(head==null)
            return st;
        st.push(head.val);
        reverse(st,head.next);
        return st;
    }
}