package test;

import java.util.Scanner;

/**
 * 用于快手笔试
 *
 * @author THY
 * @date 2019/4/13
 */
public class KuaiShouTest {

    private static long solution1(int n) {
        long result = 1L;
        if (n == 0) {
            return result;
        }
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        while (true) {
            if (result % 10 != 0) {
                return result % 10;
            } else {
                result /= 10;
            }
        }
    }


    private static int solution2(String s1, String s2) {
        if (s1.equals(s2) == true) {
            return 0;
        }
        int changeTime = 0;
        boolean change = false;
        char temp;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        if (chars1.length <= chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
                    changeTime++;
                }
            }
            changeTime += (chars2.length - chars1.length);
            return changeTime;
        } else {
            for (int i = 0; i < chars2.length; i++) {
                if (chars1[i] != chars2[i]) {
                    changeTime++;
                }
            }
            changeTime += (chars1.length - chars2.length);
            return changeTime;
        }
    }

    private static int solution3(String s3) {
//        String[] strings = s3.split(",");
//        int times1 = 0;
//        int x = Integer.parseInt(strings[0]);
//        int y = Integer.parseInt(strings[1]);
//        System.out.println(x);
//        System.out.println(y);
//        int times = 0;
//        if (x < 0 & y > 0) {
//            times = x;
//        }
//        if (x < 0 & y < 0) {
//
//        }
//        if (x > 0 & y > 0) {
//
//        }
//        if (x > 0 & y < 0) {
//            times -= x;
//        }
//        return times;
//        if (y % x <= 1) {
//            while (y > x) {
//                y /= x;
//                times1++;
//            }
//            times1++;
//        }
//        if (y % (x + 1) <= 1) {
//            while (y > (x + 1)) {
//                y /= x;
//                times1++;
//            }
//            times1++;
//        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        String s2 = sc.next();
        String s3 = sc.next();
//        System.out.println(solution2(s1, s2));
        System.out.println(solution3(s3));
//        int n = sc.nextInt();
//        System.out.println(solution1(n));

    }
}
