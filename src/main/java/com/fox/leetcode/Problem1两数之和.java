package com.fox.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum/
 */
public class Problem1两数之和 {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] ints = twoSum(nums, target);
        System.out.println(JSON.toJSONString(ints));

    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    /**
     * 暴力破解法
     *
     * @param nums
     * @param target
     * @return
     */
//    public int[] twoSum(int[] nums, int target) {
//
//        int length = nums.length;
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//
//        return null;
//    }

}
