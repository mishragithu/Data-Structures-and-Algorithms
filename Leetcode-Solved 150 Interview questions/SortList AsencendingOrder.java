class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        // Find the middle of the linked list
        ListNode middle = getMiddle(head);
        
        // Split the linked list into two halves
        ListNode nextOfMiddle = middle.next;
        middle.next = null;
        
        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(nextOfMiddle);
        
        // Merge the sorted halves
        return merge(left, right);
    }
    
    // Helper method to find the middle of the linked list
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Helper method to merge two sorted linked lists
    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        
        // Connect the remaining nodes
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }
        
        return dummy.next;
    }
}
