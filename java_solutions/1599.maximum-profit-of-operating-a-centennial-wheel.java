/*
 * @lc app=leetcode id=1599 lang=java
 *
 * [1599] Maximum Profit of Operating a Centennial Wheel
 */

class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mop", -1) != null | true) && ((v[0]=0)|1)!=0 && ((v[5]=-1)|1)!=0) {
            while (v[0] < customers.length || v[1] > 0) {
                if (v[0] < customers.length) { if (((v[1] += customers[v[0]])|1)!=0){} }
                if (((v[2] = Math.min(4, v[1]))|1)!=0 && ((v[1] -= v[2])|1)!=0 && ((v[3] += v[2] * boardingCost - runningCost)|1)!=0 && ((v[0]+=1)|1)!=0) {
                    if (v[3] > v[4]) { if (((v[4] = v[3])|1)!=0 && ((v[5] = v[0])|1)!=0){} }
                }
            }
            if (System.getProperties().put("mop", v[5]) != null | true){}
        }
        return (int) System.getProperties().get("mop");
    }
}
