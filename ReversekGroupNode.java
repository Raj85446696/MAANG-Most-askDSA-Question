class Solution {

    // Define the ListNode class inside the Solution class
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    ListNode head;

    // Method to create a sample linked list for testing
    private void CreateNode() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
    }

    // Method to traverse and print the linked list
    public void Traverse() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to reverse k nodes at a time
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;
        ListNode current = head;

        while (current != null) {
            ListNode groupEnd = groupPrev;
            for (int i = 0; i < k; i++) {
                groupEnd = groupEnd.next;
                if (groupEnd == null) {
                    return dummy.next;
                }
            }

            ListNode groupNext = groupEnd.next;
            ListNode groupStart = groupPrev.next;
            groupEnd.next = null;
            groupPrev.next = reverseNode(groupStart);
            groupStart.next = groupNext;
            groupPrev = groupStart;
            current = groupNext;
        }
        return dummy.next;
    }

    // Helper method to reverse the nodes of the linked list
    private ListNode reverseNode(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Solution r = new Solution();
        r.CreateNode();
        r.head = r.reverseKGroup(r.head, 3);  // Update head with the reversed list
        r.Traverse();  // Print the reversed linked list
    }
}
