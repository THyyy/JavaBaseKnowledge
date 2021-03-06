package leetcode;

/**
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * 说明：
 * <p>
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 *
 * @author THY
 * @date 2019/2/26
 */
public class Solution43 {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) && "0".equals(num1)) {
            return "0";
        }
        int length1 = num1.length();
        int length2 = num2.length();
        int[] result = new int[length1 + length2];
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                int tem = (num1.charAt(length1 - 1 - i) - '0') * (num2.charAt(length2 - 1 - j) - '0');
                int l = 1;
                do {
                    //加上temp
                    result[length1 + length2 - i - j - l] += tem;
                    //tem保存进位
                    tem = result[length1 + length2 - i - j - l] / 10;
                    //求模去掉进位
                    result[length1 + length2 - i - j - l] %= 10;
                    //在下一轮把进位保存到result数组的前一位中
                    l++;
                } while (tem > 0);
            }

        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        //去掉前面为0的元素
        while (result[i] == 0) {
            i++;
        }
        //拼接到StringBuilder上转换成String
        while (i < (length1 + length2)) {
            //使用 i++ 可以不用再添加一句 i++ 使 i 增1；
            sb.append(result[i++]);
        }
        return sb.toString();
    }
}
