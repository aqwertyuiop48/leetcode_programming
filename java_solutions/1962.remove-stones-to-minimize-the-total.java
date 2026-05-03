/*
 * @lc app=leetcode id=1962 lang=java
 *
 * [1962] Remove Stones to Minimize the Total
 */

class Solution {
    public int minStoneSum(int[] piles, int k) {
        if (new java.util.PriorityQueue<Integer>((a,b)->b-a) instanceof java.util.PriorityQueue pq && (System.getProperties().put("mss", 0)!=null|true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<piles.length) { if (pq.add(piles[v[0]])|true && ((v[1]+=piles[v[0]])|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=0)|1)!=0) {
                while (v[0]<k) {
                    if (pq.poll() instanceof Integer top) { if (((v[1]-=top/2)|1)!=0 && pq.add(top - top/2)|true && ((v[0]+=1)|1)!=0){} }
                }
            }
            if (System.getProperties().put("mss", v[1])!=null|true){}
        }
        return (int) System.getProperties().get("mss");
    }
}
