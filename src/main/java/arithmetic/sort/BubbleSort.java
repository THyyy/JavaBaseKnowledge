package arithmetic.sort;

import java.util.Arrays;

/**
 * 冒泡排序算法
 * 时间复杂度：最好的情况O（n），平均情况：O（n^2），最差情况：O（n^2）
 * 空间复杂度：O（1）
 * 稳定性：稳定
 * 内部排序：排序过程中，数据元素只在内存中
 * @author THY
 * @date 2019/2/24
 */
public class BubbleSort {

    /**
     * 传统冒泡排序算法
     *
     * @param target
     */
    public static int[] bubbleSort(int[] target) {

        int n = target.length;
        if (target != null && n != 1) {
            //一共进行 n - 1 躺比较
            for (int i = 0; i < n - 1; i++) {
                //每次比较把最小的往前移
                for (int j = n - 1; j > i; j--) {
                    if (target[j] < target[j - 1]) {
                        int tem = target[j];
                        target[j] = target[j - 1];
                        target[j - 1] = tem;
                    }
                    System.out.println(Arrays.toString(target));
                }
            }
        }
        return target;
    }

    /**
     * 优化版冒泡排序
     * 只是在传统冒泡排序的基础上添加了一个Boolean值作为交换判断
     * 无交换则已经排好序
     * @param target
     */
    public static int[] optimizeBubbleSort(int[] target) {
        int n = target.length;
        if (target != null && n < 1) {
            for (int i = 0; i < n - 1; i++) {
                boolean isChange = false;
                for (int j = n - 1; j > i; j--) {
                    if (target[j] < target[j - 1]) {
                        int tem = target[j];
                        target[j] = target[j - 1];
                        target[j - 1] = tem;
                        isChange = true;
                    }
                }
                System.out.println(Arrays.toString(target));
                if (!isChange) {
                    return target;
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,2,5,9,67,8,10};
        bubbleSort(test);
        System.out.println("--------------------");
        optimizeBubbleSort(test);
    }
}
