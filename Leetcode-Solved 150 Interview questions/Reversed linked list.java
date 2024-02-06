
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode leftOfleft = dummy;
        ListNode prev = null;
        ListNode curr = head;

       //bringing current pointer to point to left location

        for(int i = 1; i< left; i++)
        {
            leftOfleft = curr;
            curr = curr.next;
        }

        //reversing algorithm

        for(int i =1; i<=(right-left+1); i++)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //connecting 

        leftOfleft.next.next = curr;
        leftOfleft.next = prev;
        return dummy.next;
    }
}
