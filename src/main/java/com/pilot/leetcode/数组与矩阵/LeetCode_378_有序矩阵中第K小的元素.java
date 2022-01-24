package com.pilot.leetcode.数组与矩阵;

public class LeetCode_378_有序矩阵中第K小的元素 {
    // 题目
    // 给你一个n x n矩阵matrix ，其中每行和每列元素均按升序排序，找到矩阵中排序后的第k小元素
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
    // todo 这边为什么是O(n^2 logN) Arrays.sort的复杂度不是 nlogN吗？ 不应该是 O(n^2+nlogN)？
    // 解法1（直接排序 时间复杂度O(n^2 logN)）.
    // 对行列嵌套for循环，值塞进新建对int[]里，再用数组工具排序方法 Arrays.sort排序，排序后第k个 即 arrays[k-1]
    // 解法2（归并排序 时间复杂度O(klogN) 归并 k 次）.
    // 每次堆中插入和弹出的操作时间复杂度均为 logn。
    // todo 略
    // 解法3（二分查找法 时间复杂度O(nlog(r−l))）
    // 找出二维矩阵中最小的数 left，最大的数 right，那么第 k 小的数必定在 left ~ right 之间
    // mid=(left+right)/2；在二维矩阵中寻找小于等于 mid 的元素个数 count
    // 若这个 count 小于 k，表明第 k 小的数在右半部分且不包含 mid，即 left=mid+1, right=right，又保证了第 k 小的数在 left ~ right 之间
    // 若这个 count 大于 k，表明第 k 小的数在左半部分且可能包含 mid，即 left=left, right=mid，又保证了第 k 小的数在 left~right 之间
    // 因为每次循环中都保证了第 k 小的数在 left ~ right 之间，当 left==right 时，第 k 小的数即被找出，等于 right
    // 注意：这里的 left mid right 是数值，不是索引位置。

    // 错题记录：
    // 我用的for一次循环，推荐答案用二分查找法

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        // 标准答案
        // answers(matrix, 8);

        // 练习
        code(matrix, 8);
    }

    private static void code(int[][] matrix, int k) {
        int m = matrix.length,n = matrix[0].length;
        int left = matrix[0][0], right = matrix[m-1][n-1];
        while(left <= right){
            int mid = (left+right)/2;
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for(int j = 0; i < n && matrix[i][j] <= mid ;j++){
                    cnt++;
                }
            }
            if(cnt < k){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        System.out.println(left);
    }

    private static void answers(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int lo = matrix[0][0], hi = matrix[m - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            System.out.println("mid: " + mid);
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
