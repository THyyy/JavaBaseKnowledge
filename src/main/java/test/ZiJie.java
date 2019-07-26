package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 用于字节跳动笔试
 *
 * @author THY
 * @date 2019/4/14
 */
public class ZiJie {


    private static int solution5(int b, int[] c) {
        if (c.length == 2) {
            return Math.max(c[0], c[1]);
        }
        //要想时间最短就把过河时间最长的几个人放在最后（只需要一次过河时间）
        return c[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (in.hasNextLine()) {
            String numStr = in.nextLine();
            list.add(numStr);
        }
        int[][] num = new int[list.size()][list.get(0).split(" ").length];
        for (int i = 0; i < list.size(); i++) {
            String[] temp = list.get(i).split(" ");
            for (int j = 0; j < temp.length; j++) {
                num[i][j] = Integer.valueOf(temp[j]);
            }
        }
    }
}
