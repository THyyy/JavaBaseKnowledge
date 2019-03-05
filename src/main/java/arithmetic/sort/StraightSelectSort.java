package arithmetic.sort;

import java.util.Arrays;

/**
 * 直接选择排序
 * 找到数组中最小值，然后对第一位和其进行交换
 * 时间复杂度：最好的情况：O（n^2），平均情况：O（n^2），最差情况：O（n^2）
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 * 内部排序：排序过程中，数据元素只在内存中
 *
 * @author THY
 * @date 2019/2/24
 */
public class StraightSelectSort {
    public static int[] straightSelectSort(int[] target) {
        if (target != null && target.length > 1) {
            for (int i = 0; i < target.length; i++) {
                int min = i;

                //查找后面元素中最小值的下标
                for (int j = i + 1; j < target.length; j++) {
                    if (target[min] > target[j]) {
                        min = j;
                    }
                }
                if (target[i] != target[min]) {
                    //交换导致排序不稳定
                    int tem = target[min];
                    target[min] = target[i];
                    target[i] = tem;
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] test = new int[]{548, 15, 468, 98, 31, 42, 51, 35, 78, 65, 12, 354};
        straightSelectSort(test);
        System.out.println(Arrays.toString(test));
    }
}
