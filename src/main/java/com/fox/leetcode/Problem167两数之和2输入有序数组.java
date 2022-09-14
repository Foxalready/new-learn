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

    /**
     * 双指针
     */
    public static int[] twoSum(int[] numbers, int target) {

        int slow = 0;
        int fast = numbers.length - 1;
        while (slow != fast) {
            int sum = numbers[slow] + numbers[fast];
            if (sum < target) {
                slow++;
            } else if (sum > target) {
                fast--;
            } else {
                return new int[]{slow + 1, fast + 1};
            }
        }

        return null;
    }

    /**
     * 哈希表ss
     */
//    public static int[] twoSum(int[] numbers, int target) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            if (map.containsKey(target - numbers[i])) {
//                return new int[]{map.get(target - numbers[i]) + 1, i + 1};
//            }
//            map.put(numbers[i], i);
//        }
//
//        return null;
//    }

}
