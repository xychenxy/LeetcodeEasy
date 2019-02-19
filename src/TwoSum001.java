
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum001 {

    public static void main(String[] args){

        int[] temp = new int[]{1,2,3,4};
        twoSum(temp,10);
    }

    public static int[] twoSum(int[] sums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i< sums.length; i++) {
            int complement = target - sums[i];
//            System.out.println(map.containsKey(complement));
            if(map.containsKey(complement)){
//                Map类型，containskey（），返回值类型是 true 或者 false；不需要处理异常
//                map.get() 获取的是下坐标
                return new int[] {map.get(complement),i};
            }
            map.put(sums[i],i);
        }
        return new int[] {1,1};
//        throw new IllegalArgumentException("No two sum solution");
    }


}
