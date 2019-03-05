package leetcode;

/**
 * @author THY
 * @date 2019/3/5
 */
public class OneZeroPack {
    public static int ZeroOnePack2(int v, int n, int[] weight, int[] value) {
        //动态规划
        int[] dp = new int[v + 1];
        for (int i = 1; i < n + 1; i++) {
            //逆序实现
            for (int j = v; j >= weight[i - 1]; j--) {
                dp[j] = Math.max(dp[j - weight[i - 1]] + value[i - 1], dp[j]);
            }
        }
        return dp[v];
    }

    public static void main(String[] args) {
        int[] weight = {2, 5, 4, 8, 9};
        int[] value = {3, 2, 8, 4, 7};
        int result = ZeroOnePack2(10, 5, weight, value);
        System.out.println(result);
        System.out.printf(result + "\t" + result);
    }
}
