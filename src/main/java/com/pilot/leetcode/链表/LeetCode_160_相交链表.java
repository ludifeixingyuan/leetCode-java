package com.pilot.leetcode.链表;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_160_相交链表 {
    // 题目
    // 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
    // 注意，函数返回结果后，链表必须 保持其原始结构 。

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
        // 标准答案
        // answers();
        int[] arr = new int[];
        // 练习
        code();
    }
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countForNum = new HashMap<>();
        for (int num : nums) {
            countForNum.put(num, countForNum.getOrDefault(num, 0) + 1);
        }
        int longest = 0;
        for (int num : countForNum.keySet()) {
            if (countForNum.containsKey(num + 1)) {
                longest = Math.max(longest, countForNum.get(num + 1) + countForNum.get(num));
            }
        }
        return longest;
    }

    private static void code() {

    }


    private static void answers() {

    }
}
