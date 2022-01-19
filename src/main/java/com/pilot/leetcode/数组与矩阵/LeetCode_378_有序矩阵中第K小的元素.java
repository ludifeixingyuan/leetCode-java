package com.pilot.leetcode.数组与矩阵;

public class LeetCode_378_有序矩阵中第K小的元素 {
    // 题目
    // 给你一个n x n矩阵matrix ，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
    // 请注意，它是 排序后 的第 k 小元素，而不是第 k 个 不同 的元素。
    //
    //
    // 示例:
    // 输入: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
    // 输出: 13
    //
    // 说明:
    // xxx

    // 题解：
    // xxx

    // 错题记录：
    // 我用的for一次循环，推荐答案用二分查找法

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        // 标准答案
        answers(matrix, 8);

        // 练习
        // code(matrix, 8);
    }

    private static void code(int[][] matrix, int k) {
        int index = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int j = 0; j < m * n; j++) {
            if (index + 1 == k) {
                System.out.println("输出：" + matrix[index / n][index % n]);
                break;
            }
            index++;
        }
    }


    private static void answers(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int lo = matrix[0][0], hi = matrix[m - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n && matrix[i][j] <= mid; j++) {
                    cnt++;
                }
            }
            if (cnt < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println("输出：" + lo);
    }
}
