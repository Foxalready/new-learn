package com.fox.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/
 */
public class Problem167两数之和2输入有序数组 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] ints = twoSum(nums, target);
        System.out.println(JSON.toJSONString(ints));
    }

    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }

        return null;
    }

}
