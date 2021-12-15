package com.question3;

import java.util.HashMap;
import java.util.Map;

public class solution3 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int k1 = 2;

        int[] nums2 = {1, 2, 3};
        int k2 = 3;

        System.out.println(solution(nums1, k1));
        System.out.println(solution(nums2, k2));
    }

    public static int solution(int[] nums, int k){
        // HashMap
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int preSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            preSum += nums[i];
            if (map.containsKey(preSum - k)) {
                count += map.get(preSum - k);
            }

            map.putIfAbsent(preSum, 0);
            map.put(preSum, map.get(preSum) + 1);
        }
        return count;
    }
}
