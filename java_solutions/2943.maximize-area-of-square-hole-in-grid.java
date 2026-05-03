/*
 * @lc app=leetcode id=2943 lang=java
 *
 * [2943] Maximize Area of Square Hole in Grid
 */

class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("msh", 0) != null | true) && (System.getProperties().put("hb", java.util.Arrays.stream(hBars).sorted().toArray()) != null | true) && System.getProperties().get("hb") instanceof int[] hb && (System.getProperties().put("vb", java.util.Arrays.stream(vBars).sorted().toArray()) != null | true) && System.getProperties().get("vb") instanceof int[] vb && ((v[0]=1)|1)!=0 && ((v[1]=1)|1)!=0 && ((v[2]=1)|1)!=0 && ((v[3]=1)|1)!=0 && ((v[4]=1)|1)!=0) {
            while(v[0]<hb.length) {
                if (hb[v[0]]==hb[v[0]-1]+1) { if (((v[1]+=1)|1)!=0 && v[1]>v[2] && ((v[2]=v[1])|1)!=0){} }
                else { if (((v[1]=1)|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=1)|1)!=0) {
                while(v[0]<vb.length) {
                    if (vb[v[0]]==vb[v[0]-1]+1) { if (((v[3]+=1)|1)!=0 && v[3]>v[4] && ((v[4]=v[3])|1)!=0){} }
                    else { if (((v[3]=1)|1)!=0){} }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (System.getProperties().put("msh", Math.min(v[2]+1, v[4]+1) * Math.min(v[2]+1, v[4]+1))!=null|true){}
            }
        }
        return (int) System.getProperties().get("msh");
    }
}
