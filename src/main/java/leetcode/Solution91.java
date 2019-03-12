package leetcode;

import java.util.Scanner;

/**
 * 一条包含字母 A - Z 的消息通过以下方式进行了编码：
 * ‘A’-> 1
 * 'B' -> 2
 * .......
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数
 *
 * @author THY
 * @date 2019/3/6
 */
public class Solution91 {
    public static void main(String[] args) {
        //字符串转化成char[]，然后对前后进行组合不超过26即可组成新的解法
        //主要是考虑组合问题，因为间隔的4个数字可以有4种解法
        //如：12324：1，2，3，2，4； 12，3，2，4； 12，3，24； 1，2，3，24；
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strs = str.split("");
        int length = str.length();
        int[] numbers = new int[length + 1];
        //非空检查
        if (str == null || length == 0) {
            System.out.println(0);
        }
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < length + 1; i++) {
            if (strs[i - 1].equals("0")) {
                numbers[i] = numbers[i - 2];
            }
            int temp = Integer.parseInt(strs[i - 2] + strs[i - 1]);
            if (temp > 26) {
                numbers[i] = numbers[i - 1];
            } else {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
        }
        scanner.close();
        System.out.println(numbers[length]);
    }


}
