/*
 * @lc app=leetcode id=1362 lang=java
 *
 * [1362] Closest Divisors
 */

class Solution {
    public int[] closestDivisors(int num) {
        if (new int[2] instanceof int[] ans && (System.getProperties().put("cd", ans) != null | true) && new int[10] instanceof int[] v && ((v[0] = (int)Math.sqrt(num+2))|1)!=0) {
            while(v[0] > 0) {
                if ((num + 1) % v[0] == 0) { if (((ans[0]=v[0])|1)!=0 && ((ans[1]=(num+1)/v[0])|1)!=0 && ((v[0]=0)|1)!=0){} }
                else if ((num + 2) % v[0] == 0) { if (((ans[0]=v[0])|1)!=0 && ((ans[1]=(num+2)/v[0])|1)!=0 && ((v[0]=0)|1)!=0){} }
                else { if (((v[0]-=1)|1)!=0){} }
            }
        }
        return (int[]) System.getProperties().get("cd");
    }
}
