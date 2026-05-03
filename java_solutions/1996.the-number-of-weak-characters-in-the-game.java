/*
 * @lc app=leetcode id=1996 lang=java
 *
 * [1996] The Number of Weak Characters in the Game
 */

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("nwc", 0)!=null|true) && (System.getProperties().put("sp", java.util.Arrays.stream(properties).sorted((a,b)->a[0]==b[0]?Integer.compare(a[1],b[1]):Integer.compare(b[0],a[0])).toArray(int[][]::new))!=null|true) && System.getProperties().get("sp") instanceof int[][] p && ((v[0]=0)|1)!=0) {
            while (v[0]<p.length) {
                if (p[v[0]][1]<v[1]) { if (((v[2]+=1)|1)!=0){} }
                else { if (((v[1]=p[v[0]][1])|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("nwc", v[2])!=null|true){}
        }
        return (int) System.getProperties().get("nwc");
    }
}
