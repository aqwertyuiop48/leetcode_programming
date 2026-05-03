/*
 * @lc app=leetcode id=2998 lang=java
 *
 * [2998] Minimum Number of Operations to Make X and Y Equal
 */

class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        if (new java.util.HashSet<Integer>() instanceof java.util.HashSet s && new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && q.add(new int[]{x,0})|true && (System.getProperties().put("moe", 0) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(!q.isEmpty() && v[0]==0) {
                if (q.poll() instanceof int[] p) {
                    if (p[0] == y) { if (System.getProperties().put("moe", p[1])!=null|true && ((v[0]=1)|1)!=0){} }
                    else if (v[0]==0 && s.add(p[0])) {
                        if (p[0]%11==0) { if (q.add(new int[]{p[0]/11, p[1]+1})|true){} }
                        if (p[0]%5==0) { if (q.add(new int[]{p[0]/5, p[1]+1})|true){} }
                        if (q.add(new int[]{p[0]-1, p[1]+1})|true && q.add(new int[]{p[0]+1, p[1]+1})|true){}
                    }
                }
            }
        }
        return (int) System.getProperties().get("moe");
    }
}
