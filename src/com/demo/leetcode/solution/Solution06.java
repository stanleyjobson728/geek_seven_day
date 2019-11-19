package com.demo.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: ghost
 * @Date: 2019/11/19 15:57
 * @Description:  三数之和

 */
class Solution06 {
//    给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
//
//    注意：答案中不可以包含重复的三元组。
//
//    例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//    满足要求的三元组集合为：
//            [
//            [-1, 0, 1],
//            [-1, -1, 2]
//            ]
//
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;

        // Arrays.sort(nums);
        //  List<List<Integer>> result = new ArrayList<>(100);
        //  List<Integer> tlist = new ArrayList<>();
        //  for (int rt = 0; rt < nums.length; rt++) {
        //      tlist.add(nums[rt]);
        //  }
        //  List<String> cccc = new ArrayList<>();
        //  Map<String, String> kvMap = new HashMap<>(999);
        //  for (int i = 0; i < nums.length; i++) {
        //      for (int k = i + 1; k < nums.length; k++) {
        //          String StrK = i + "*" + k;
        //          String strV = nums[i] + "" + "_" + nums[k] + "_" + (0 -  nums[i] - nums[k]);
        //          kvMap.put(StrK, strV);
        //      }
        //  }
        //  for (Map.Entry<String, String> p : kvMap.entrySet()) {
        //      String[] split =  p.getKey().split("\\*");
        //      String s0 = split[0];
        //      String s1 = split[1];
        //      String[] s =  p.getValue().split("_");
        //      String sv0 = s[0];
        //      String sv1 = s[1];
        //      String sv2 = s[2];
        //      boolean contains = tlist.contains(Integer.parseInt(sv2));
        //      if (contains) {
        //          Integer i1 = tlist.indexOf(Integer.parseInt(sv2));
        //          if (!i1.equals(-1)&&!i1.equals(Integer.parseInt(s0)) && !i1.equals(Integer.parseInt(s1))) {
        //              List<Integer> list = new ArrayList<>();
        //              if (!cccc.contains(sv0 + sv1 + sv2) ) {
        //                  list.add(Integer.parseInt(sv0));
        //                  list.add(Integer.parseInt(sv1));
        //                  list.add(Integer.parseInt(sv2));
        //                  cccc.add(sv0 + sv1 + sv2);
        //                  result.add(list);
        //              }
        //          }
        //      }
        //  }
        //  Map<String,Integer> map = new HashMap<>(999);
        //  for(int m=0;m<result.size();m++){
        //      List<Integer> lrrs = result.get(m);
        //      Collections.sort(lrrs);
        //      String ssrrrss  = "";
        //      for (Integer iiii: lrrs){
        //          ssrrrss += iiii+"_";
        //      }
        //      int size = map.size();
        //      Integer integer1 = map.get(ssrrrss);
        //      if(size==0||integer1==null){
        //          map.put(ssrrrss,m);
        //      }
        //  }
        //  List<List<Integer>> newresult = new ArrayList<>(100);
        //  for(Map.Entry<String,Integer> gf: map.entrySet()){
        //      String key = gf.getKey();
        //      String[] s = key.split("_");
        //      List<Integer> lsssddda= new ArrayList<>(100);
        //      for (String s1 : s) {
        //          lsssddda.add(Integer.parseInt(s1));
        //      }
        //      newresult.add(lsssddda);
        //  }
        //  return newresult;
    }
}
