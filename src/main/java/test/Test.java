package test;

/**
 * @author THY
 * @date 2019/2/27
 */
public class Test {

    public static String findSubString(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        int length = 0;//子字符串长度
        int index = 0;//起始下标
        int count = 1;
        int i = 0;
        for (; i < chars.length - 1; i++) {
            //连续的字母count + 1
            if (chars[i] + 1 == chars[i + 1]) {
                count += 1;
                length = length < count ? count : length;
                index = i - count + 2;
            } else {
                count = 1;
            }
        }
        System.out.println("index = " + index);
        System.out.println("lenght = " + length);
        return str.substring(index, length + index);
    }

    public static void main(String[] args) {
        String str = new String("dabcetabcdezdibcdefghuiu");
        System.out.println(findSubString(str));

    }
}
