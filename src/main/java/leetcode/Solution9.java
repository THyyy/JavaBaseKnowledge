package leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * @author THY
 * @date 2019/3/25
 */
public class Solution9 {

    private static boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        /**
         * 首先想到回文数可以分为两段，前一段形成的数字是后一段数字的反转
         * 或者是前一段数字等于后一段数字的反转 / 10
         * 则解决当前算法题
         **/
        //后一段的数字
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return (x == y) || (y / 10 == x);
    }

    public static void main(String[] args) {
        int x = 123221;
        System.out.println(isPalindrome(x));
    }
}
