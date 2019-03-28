package leetcode;

/**
 * 反转一个单链表。
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL、
 * @author THY
 * @date 2019/3/2
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution206 {
    public ListNode206 reverseList(ListNode206 head) {
        if (head == null) {
            return head;
        }
        ListNode206 result = null;
        ListNode206 temp = null;
        while(head != null) {
            temp = head.next;
            head.next = result;
            result = head;
            head = head.next;
        }
        return result;
    }

}

 class ListNode206 {
      int val;
      ListNode206 next;
       ListNode206(int x) { val = x; }
   }
