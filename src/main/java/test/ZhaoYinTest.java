package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 招商银行笔试第三题自定义编程
 * 本质上是一个背包问题，但是没有考虑到 money 数值过大，导致数组长度过大。
 * 另外难点在于如何返回 楼盘 ID，即背包问题中的物品位置。
 * @author THY
 * @date 2019/3/5
 */
public class ZhaoYinTest {
    public static void maxProbatity(int quantity, int money, int[] lockMoneys, double[] probabilitys) {
        double[] maxPrbatitys = new double[money + 1];

        for (int i = 1; i < quantity + 1; i++) {
            for (int j = money; j >= lockMoneys[i - 1]; j--) {
                maxPrbatitys[j] = Math.max(maxPrbatitys[j - lockMoneys[i - 1]] + probabilitys[i - 1], maxPrbatitys[j]);
            }
        }
        System.out.println("maxPrbatity: " + maxPrbatitys[money]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        // int quantity = 5;
        int money = sc.nextInt();
        // int money = 10;
        int[] lockMoneys = new int[quantity];
        // int[] lockMoneys = {2, 5, 4, 8, 9};
        double[] probabilitys = new double[quantity];
        // double[] probabilitys = {0.3, 0.2, 0.8, 0.4, 0.7};
        int a = 0;
        do {
            int lockMoney = sc.nextInt();
            lockMoneys[a] = lockMoney;
            double probability = sc.nextDouble();
            probabilitys[a] = probability;
            a++;
        } while (a < quantity);
        maxProbatity(quantity, money, lockMoneys, probabilitys);
    }
}