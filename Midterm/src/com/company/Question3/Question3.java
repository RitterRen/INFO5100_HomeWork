package com.company.Question3;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static void main(String[] args) {
        int[] array = {1, 3, -1, 3, 4, -1};
        System.out.println(solution3(array));
    }

    public static int solution3(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int num : nums) {
            if (!numsMap.containsKey(num)){
                numsMap.put(num, 1);
            }else {
                numsMap.put(num, numsMap.get(num) + 1);
            }
        }
        int res = 0;
        for (int key : numsMap.keySet()) {
            int value = numsMap.get(key);
            if ( value > 1 ) {
                res += key;
            }
        }
        return res;
    }
}
