package leetcode;


/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 示例:
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * @author THY
 * @date 2019/3/2
 */
public class Solution24 {
    public ListNode24 swapPairs(ListNode24 head) {

        if(head == null) {
            return null;
        }
        ListNode24 temp;
        ListNode24 pos = head;
        ListNode24 dummy = new ListNode24(0);
        ListNode24 pre = dummy;
        dummy.next = head;
        while(pos != null && pos.next != null) {
            temp = pos.next.next;
            pos.next.next = pos;
            pre.next = pos.next;
            pos.next = temp;
            pre = pos;
            pos = pos.next;
        }
        return dummy.next;
    }
}

class ListNode24 {
    int val;
    ListNode24 next;

    ListNode24(int x) {
        val = x;
    }
}