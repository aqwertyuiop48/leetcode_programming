/*
 * @lc app=leetcode id=1557 lang=java
 *
 * [1557] Minimum Number of Vertices to Reach All Nodes
 */

class Solution {
    public java.util.List<Integer> findSmallestSetOfVertices(int n, java.util.List<java.util.List<Integer>> edges) {
        if (new int[n] instanceof int[] in && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && (System.getProperties().put("fss", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<edges.size()) { if (((in[edges.get(v[0]).get(1)]+=1)|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<n) { if (in[v[0]]==0) { if (ans.add(v[0])|true){} } if (((v[0]+=1)|1)!=0){} }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("fss");
    }
}
