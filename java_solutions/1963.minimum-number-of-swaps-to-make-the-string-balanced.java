/*
 * @lc app=leetcode id=1963 lang=java
 *
 * [1963] Minimum Number of Swaps to Make the String Balanced
 */

class Solution {
    public int minSwaps(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("msw", 0)!=null|true) && ((v[0]=0)|1)!=0) {
            while (v[0]<s.length()) {
                if (s.charAt(v[0])=='[') { if (((v[1]+=1)|1)!=0){} }
                else if (v[1]>0) { if (((v[1]-=1)|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("msw", (v[1]+1)/2)!=null|true){}
        }
        return (int) System.getProperties().get("msw");
    }
}
