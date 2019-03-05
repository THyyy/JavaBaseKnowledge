package arithmetic.sort;

import java.util.Arrays;

/**
 * 快速排序算法
 * 包括两个过程：划分和排序
 * 时间复杂度：最好是O（nlog n），平均情况：O（nlog n），最差情况：O（n^2）
 * 空间复杂度：O（log n）
 * 基准元素：任意一个
 * 稳定性：不稳定
 * 内部排序：排序过程中，数据元素只在内存中
 *
 * @author THY
 * @date 2019/2/24
 */
public class QuickSort {

    public static void quickSort(int[] target, int left, int right) {
        //排除为 null 或长度为 1 的情况
        if (target == null || left >= right || target.length <= 1) {
            return;
        }
        int i = left;
        int j = right;
        //基准值
        int value = target[(left + right) / 2];
        while (i <= j) {
            while (target[i] < value) {
                i++;
            }
            while (target[j] > value) {
                j--;
            }
            if (i < j) {
                int tem = target[i];
                target[i] = target[j];
                target[j] = tem;
                ++i;
                --j;
            } else if (i == j) {
                i++;
            }
        }
        //递归
        quickSort(target, left, j);
        quickSort(target, i, right);
    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 58, 95, 6, 13, 18, 59, 16, 158, 54, 87, 35};
        quickSort(test, 0, test.length - 1);
        System.out.println(Arrays.toString(test));
    }
}
