package arithmetic.sort;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * 直接插入排序
 * 在有序的序列中不断插入新的元素以扩大有序区到整个数组
 * 时间复杂度：最好的情况O（n），平均情况：O（n^2），最差情况：O（n^2）
 * 空间复杂度：O（1）
 * 稳定性：稳定
 * 内部排序：排序过程中，数据元素只在内存中
 *
 * @author THY
 * @date 2019/2/24
 */
public class StraightInsertionSort {
    public static int[] insterSort(int[] target) {
        if (target != null && target.length > 1) {
            //不断扩大有序数组直至整个数组
            for (int i = 1; i < target.length; i++) {
                //对前面部分的子数组进行排序
                for (int j = i; j > 0; j--) {
                    if (target[j] < target[j - 1]) {
                        int tem = target[j];
                        target[j] = target[j - 1];
                        target[j - 1] = tem;
                    }
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] test = new int[]{548, 15, 468, 98, 31, 42, 51, 35, 78, 65, 12, 354};
        insterSort(test);
        System.out.println(Arrays.toString(test));
    }
}
