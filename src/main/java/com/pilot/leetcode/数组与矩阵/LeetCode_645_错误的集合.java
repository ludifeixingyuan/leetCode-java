package com.pilot.leetcode.数组与矩阵;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_645_错误的集合 {
    // 题目
    // 集合 s 包含从 1 到n的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有一个数字重复 。
    // 给定一个数组 nums 代表了集合 S 发生错误后的结果。
    // 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

    //
    // 示例:
    // 输入: nums = [1,2,2,4]
    // 输出: [2,3]
    //
    // 说明:
    // xxx

    // 题解：
    // 根据题目，重复的数字出现两次，普通数字出现一次，缺失数字不出现。那么，我们可以构造一个数组来记录每个数字出现的次数，就能找到出现两次的数字和缺失数字了。

    // 错题记录：
    // 第一次做题误以为集合s肯定是从小到大的，其实不一定

    public static void main(String[] args) {
        int[] nums = {1,2,5,4};
        // 标准答案
        // answers(nums);

        // 练习
        code(nums);
    }

    private static void code(int[] nums) {
        int[] hash = new int[nums.length];
        for (int num : nums) {
            hash[num - 1]++;
        }
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (hash[i] == 0) {
                ret[1] = i + 1;
            } else if (hash[i] == 2) {
                ret[0] = i + 1;
            }
        }

        System.out.println("输出："+ Arrays.toString(ret));
    }


    private static void answers(int[] nums) {

    }
}
