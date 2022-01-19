package com.pilot.leetcode.数组与矩阵;

public class LeetCode_485_找出数组中最长的连续1 {
    // 题目
    // 给定一个二进制数组， 计算其中最大连续 1 的个数。
    //
    // 示例:
    // 输入: [1,1,0,1,1,1]
    // 输出: 3
    //
    // 说明:
    // xxx

    // 题解：
    // xxx

    // 错题记录：
    // xxx

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        // 标准答案
        // answers(nums);

        // 练习
        code(nums);
    }

    private static void code(int[] nums) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                temp = 0;
            }
            count = Math.max(count, temp);
        }
        System.out.println(count);
    }


    private static void answers(int[] nums) {
        int max = 0, cur = 0;
        for (int x : nums) {
            cur = x == 0 ? 0 : cur + 1;
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}
