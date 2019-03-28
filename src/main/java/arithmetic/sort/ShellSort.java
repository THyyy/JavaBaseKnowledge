package arithmetic.sort;

import java.awt.font.TextAttribute;

/**
 * 希尔排序
 * 依赖于初始序列，分别对间隔gap的gap个子序列进行直接插入排序
 * 然后不断缩小gap，直至gap为1
 * 时间复杂度O（n）~O（n^2）
 * 空间复杂度O（1）
 * 稳定性：不稳定
 * 内部排序
 *
 * @author THY
 * @date 2019/3/17
 */
public class ShellSort {
    public static void shellSort(int[] target) {
        if (target != null && target.length != 1) {
            int gap = target.length;
            while (gap > 1) {
                gap = gap / 3 + 1;
                for (int i = gap; i < target.length; i++) {
                    int j = i - gap;
                    while (j >= 0) {
                        if (target[j + gap] < target[j]) {
                            swap(target, j, j + gap);
                            j -= gap;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void swap(int[] target, int i, int j) {
        int temp = target[i];
        target[i] = target[j];
        target[j] = temp;
    }
}
