package com.pilot.leetcode.数组与矩阵;

public class LeetCode_287_寻找重复数 {
    // 题目
    // 给定一个包含n + 1 个整数的数组nums ，其数字都在 1 到 n之间（包括 1 和 n），可知至少存在一个重复的整数。
    // 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
    // 你设计的解决方案必须不修改数组 nums 且只用常量级 O(1) 的额外空间。
    //
    // 示例:
    // 输入: xxx
    // 输出: xxx
    //
    // 说明:
    // xxx

    // 题解：
    // xxx

    // 错题记录：
    // xxx

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        // 练习
        int res = code(nums);
        System.out.println("输出：" + res);
    }

    private static int code(int[] nums) {
        int left = 1, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] <= mid){
                    cnt ++;
                }
            }
            if (cnt > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
