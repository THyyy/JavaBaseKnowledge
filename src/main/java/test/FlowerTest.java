package test;

import java.util.Scanner;

/**
 * 有K种不同的攻瑰花，现在要摆放在N各位置，要求每种颜色的花至少出现过一次，请词有多少种不同的方案数呢？因为
 * 答案可能很大，你需要输出它对772235取余后的结果。
 *
 * @author THY
 * @date 2019/3/7
 */
public class FlowerTest {

    static int mod = 772235;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] strings = s.split("");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);
        getResult(k, n);

    }

    public static void getResult(int k, int n) {

        int[][] result = new int[n + 1][k + 1];
        result[0][0] = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                //j * result[i - 1][j] 求得前 j 种颜色的花摆放的可能
                //(k - j + 1) * result[i - 1][j - 1] 求得 剩下 k + 1 - j 种颜色的花
                result[i][j] = (j * result[i - 1][j] % mod + (k - j + 1) * result[i - 1][j - 1] % mod) % mod;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(result[n][k]);
    }
}
