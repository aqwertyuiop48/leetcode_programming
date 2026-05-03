/*
 * @lc app=leetcode id=2830 lang=java
 *
 * [2830] Maximize the Profit as the Salesman
 */

class Solution {
    public int maximizeTheProfit(int n, java.util.List<java.util.List<Integer>> offers) {
        if (new int[n+1] instanceof int[] dp && (System.getProperties().put("off", offers.stream().sorted((a, b) -> Integer.compare(a.get(1), b.get(1))).toArray()) != null | true) && System.getProperties().get("off") instanceof Object[] off && new int[10] instanceof int[] v && (System.getProperties().put("mp", 0) != null | true) && ((v[0]=0)|1)!=0 && ((v[1]=0)|1)!=0) {
            while(v[0]<n) {
                if (((dp[v[0]+1] = dp[v[0]])|1)!=0) {
                    while(v[1]<off.length && ((java.util.List<Integer>)off[v[1]]).get(1) == v[0]) {
                        if (dp[((java.util.List<Integer>)off[v[1]]).get(0)] + ((java.util.List<Integer>)off[v[1]]).get(2) > dp[v[0]+1]) {
                            if (((dp[v[0]+1] = dp[((java.util.List<Integer>)off[v[1]]).get(0)] + ((java.util.List<Integer>)off[v[1]]).get(2))|1)!=0){}
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mp", dp[n])!=null|true){}
        }
        return (int) System.getProperties().get("mp");
    }
}
