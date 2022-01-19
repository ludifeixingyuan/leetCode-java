package com.pilot.leetcode.数组与矩阵;

import java.util.Arrays;

public class LeetCode_566_改变矩阵维度 {
    // 题目
    // 在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。
    //
    // 给你一个由二维数组 mat 表示的m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
    //
    // 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
    //
    // 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
    //
    // 示例:
    // 输入: nums = [[1,2],[3,4]]，r = 1, c = 4 （r、c：分别表示想要的重构的矩阵的行数和列数。）
    // 输出: [1,2,3,4]
    //
    // 说明:
    // 二维矩阵都需要算出 length & [0].length

    // 题解：
    // xxx

    // 错题记录：
    // 嵌套循环 —> 直接拿 r c来循环 遍历新得数组赋值
    // 定义一个index 记录操作次数 reshapedNums[i][j] = nums[index / n][index % n];

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        // 标准答案
        // answers(nums,r,c);

        // 练习
        // 正确
        code(nums, 1, 4);
        // 错误返回原输入的值
        // code(nums, 2, 4);
    }

    private static void code(int[][] nums, int r, int c) {
        int x = nums.length;
        int y = nums[0].length;
        if (x * y != r * c) {
            System.out.println("输出：" + Arrays.deepToString(nums));
            return;
        }
        int[][] res = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = nums[index / y][index % y];
                index++;
            }
        }
        System.out.println("输出：" + Arrays.deepToString(res));
        return;
    }


    private static void answers(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) {
            System.out.println("输出：" + Arrays.deepToString(nums));
            return;
        }
        int[][] reshapedNums = new int[r][c];
        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshapedNums[i][j] = nums[index / n][index % n];
                index++;
            }
        }
        System.out.println("输出：" + Arrays.deepToString(reshapedNums));
        return;
    }
}
