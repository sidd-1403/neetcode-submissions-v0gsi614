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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode cur = head;
        ListNode beforeLeft = null;
        ListNode afterRight = null;
        ListNode temp1 = null;
        int count = 1;

        if (left == 1) {
            temp1 = cur;
        }
        while (cur != null) {
            if (count + 1 == left) {
                temp1 = cur.next;
                beforeLeft = cur;
            }
            if (count == right) {

                afterRight = cur.next;
                cur.next = null;

            }
            count++;
            cur = cur.next;
        }
        ListNode reverseNode = reverse(temp1);

        if (beforeLeft != null) {
            beforeLeft.next = reverseNode;
        } else {
            head = reverseNode;
        }
        temp1.next = afterRight;
        return head;
    }

    private static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}