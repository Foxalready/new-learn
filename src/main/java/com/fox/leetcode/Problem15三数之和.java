package com.fox.leetcode;

import com.alibaba.fastjson.JSON;
import com.fox.util.JsonUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/3sum/
 */
public class Problem15三数之和 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(JsonUtil.toString(lists));
    }

    /**
     * 排序 + 双指针
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        if (length < 3) {
            return result;
        }
        // 对于i来说，从0开始循环
        for (int i = 0; i < length; i++) {
            // 如果数字相等，则跳过循环
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 找到j，k需要相加得到的和
            int target = -nums[i];
            // 此时可以用双指针
            int k = length - 1;
            for (int j = i + 1; j < length; j++) {
                // 如果数字相等，则跳过循环
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                // j 一定要小于k
                while (j < k && nums[j] + nums[k] > target) {
                    k--;
                }
                // 如果 j=k，则跳出循环
                if (j == k) {
                    break;
                }
                // 如果目标相等，则放入结果集中
                if (nums[j] + nums[k] == target) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(list);
                }
            }
        }
        return result;
    }


    /**
     * 暴力法
     * 这道题暴力法无解
     */
//    public List<List<Integer>> threeSum(int[] nums) {
//
//        List<List<Integer>> result = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        List<Integer> list = new ArrayList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[k]);
//                        result.add(list);
//                    }
//                }
//            }
//        }
//
//        return result;
//    }

}
