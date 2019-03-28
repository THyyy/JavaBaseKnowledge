package leetcode;


/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author THY
 * @date 2019/3/25
 */
public class Solution2 {
    private static ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode2 result = new ListNode2(0);
        ListNode2 temp = result;
        while (true) {
            if (l1 != null) {
                temp.val = temp.val + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp.val = temp.val + l2.val;
                l2 = l2.next;
            }
            //进位判断
            temp.next = new ListNode2(temp.val / 10);
            temp.val = temp.val % 10;
            if (l1 == null && l2 == null) {
                temp.next = (temp.next.val==0?null:temp.next);
                break;
            }
            temp = temp.next;
        }
        return result;
    }

}

/**
 * Definition for singly-linked list.
 */
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}

