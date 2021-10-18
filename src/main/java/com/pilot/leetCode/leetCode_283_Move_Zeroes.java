package com.pilot.leetCode;

import java.util.Arrays;

/**
 * 283.把数组中的 0 移到末尾
 *
 * @author wangzongbin
 * @date 2021-10-18
 */
public class leetCode_283_Move_Zeroes {
    // 题目
    // 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    //
    // 示例:
    // 输入: [0,1,0,3,12]
    // 输出: [1,3,12,0,0]
    //
    // 说明:
    // 必须在原数组上操作，不能拷贝额外的数组。
    // 尽量减少操作次数。

    // 题解：
    // 这道题让我们将一个给定数组中所有的0都移到后面，把非零数前移，要求不能改变非零数的相对应的位置关系，而且不能拷贝额外的数组，
    // 那么只能用替换法in-place来做，需要用两个指针，一个不停的向后扫，找到非零位置，然后和前面那个指针交换位置即可.

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int idx = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[idx++] = num;
            }
        }
        while (idx < nums.length) {
            nums[idx++] = 0;
        }
        System.out.println("输出: " + Arrays.toString(nums));
    }
}
