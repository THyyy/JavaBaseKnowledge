package test;


import java.util.jar.JarEntry;

/**
 * @author THY
 * @date 2019/2/27
 */
public class Test2 {

    public static void main(String[] args) {
        String str = "abdabcdfge";
        String rule = "abcdefghijklmnopqrstuvwxyz";
        int length = 0;
        int count = 1;
        int index = 0;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < str.length() - 2; ) {
            for (int j = 0; j < rule.length() - 2; j++) {
                if (i + 2 < str.length() && j + 2 < rule.length() && str.substring(i, i + 1).equalsIgnoreCase(rule.substring(j, j + 1))
                        && str.substring(i + 1, i + 2).equalsIgnoreCase(rule.substring(j + 1, j + 2))) {
                    count++;
                    if (length <= count) {
                        length = count;
                        index = i - count + 2;
                    }
                } else {
                    count = 1;
                }
            }
            i++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
        System.out.println("index :" + index);
        System.out.println("length :" + length);
        System.out.println(str.substring(index, index + length));
    }
}
