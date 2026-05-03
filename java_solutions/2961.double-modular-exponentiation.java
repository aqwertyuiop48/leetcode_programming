/*
 * @lc app=leetcode id=2961 lang=java
 *
 * [2961] Double Modular Exponentiation
 */

class Solution {
    public java.util.List<Integer> getGoodIndices(int[][] variables, int target) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && (System.getProperties().put("dme", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<variables.length) {
                if (java.math.BigInteger.valueOf(variables[v[0]][0]).modPow(java.math.BigInteger.valueOf(variables[v[0]][1]), java.math.BigInteger.valueOf(10)).modPow(java.math.BigInteger.valueOf(variables[v[0]][2]), java.math.BigInteger.valueOf(variables[v[0]][3])).intValue() == target) {
                    if (ans.add(v[0])|true){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("dme");
    }
}
