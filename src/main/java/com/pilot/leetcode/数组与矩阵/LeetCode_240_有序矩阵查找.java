package com.pilot.leetcode.数组与矩阵;

public class LeetCode_240_有序矩阵查找 {
    // 题目
    // 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。
    // 该矩阵具有以下特性：
    // 1.每行的元素从左到右升序排列。
    // 2.每列的元素从上到下升序排列。
    //
    // 示例:
    // 输入: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
    // 输出: true
    //
    // 说明:
    // 从第一行最后一个回溯，比这个数大 -> y+1，比这个数小 -> x-1

    // 题解：
    //

    // 错题记录：
    // xxx

    public static void main(String[] args) {
        int[][] nums = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        // 标准答案
        // answers(nums,18);

        // 练习
        // true
        code(nums, 18);
        // false
        // code(nums, 5000);
    }

    private static void code(int[][] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0].length == 0) {
            System.out.println("输出：" + false);
            return;
        }
        int m = nums.length;
        int n = nums[0].length;
        int row = 0;
        int col = n - 1;
        while (row < m && col >= 0) {
            System.out.println("[" + row + "," + col + "]");
            if (nums[row][col] == target) {
                // 等于
                System.out.println("输出：" + true);
                return;
            } else if (nums[row][col] < target) {
                // 小于
                row++;
            } else if (nums[row][col] > target) {
                // 大于
                col--;
            }
        }
        System.out.println("输出: " + Boolean.FALSE);
    }


    private static void answers(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("输出: " + false);
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            System.out.println("[" + row + "," + col + "]");
            if (target == matrix[row][col]) {
                System.out.println("输出: " + true);
                break;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("输出: " + false);
    }
}
