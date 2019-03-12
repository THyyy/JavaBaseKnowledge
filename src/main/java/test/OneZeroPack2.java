package test;

/**
 * 有一个箱子容量为 V，（0-20000），共有n个物品（0-30），每个物品有一个体积，如何让箱子剩余容量达到最小
 * @author THY
 * @date 2019/3/5
 */
public class OneZeroPack2 {
    public static int ZeroOnePack2(int v, int n, int[] value) {
        //动态规划
        int[] dp = new int[v + 1];
        for (int i = 0; i < v + 1; i++) {
            dp[i] = v;
        }
        for (int i = 1; i < n + 1; i++) {
            //逆序实现
            for (int j = v; j >= value[i - 1]; j--) {
                dp[j] = Math.min(dp[j - value[i - 1]] - value[i - 1], dp[j]);
            }
        }
        return dp[v];
    }

    public static void main(String[] args) {
        int[] value = {6, 15, 4, 32, 7};
        int result = ZeroOnePack2(14, 5, value);
        System.out.println(result);
//        System.out.printf(result + "\t" + result);
    }
}
