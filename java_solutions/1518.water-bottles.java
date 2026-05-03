/*
 * @lc app=leetcode id=1518 lang=java
 *
 * [1518] Water Bottles
 */

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("wb", 0) != null | true) && ((v[0]=numBottles)|1)!=0 && ((v[1]=numBottles)|1)!=0) {
            while(v[1]>=numExchange) {
                if (((v[0]+=v[1]/numExchange)|1)!=0 && ((v[1]=v[1]/numExchange+v[1]%numExchange)|1)!=0){}
            }
            if (System.getProperties().put("wb", v[0])!=null|true){}
        }
        return (int) System.getProperties().get("wb");
    }
}
