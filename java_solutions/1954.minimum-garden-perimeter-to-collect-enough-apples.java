/*
 * @lc app=leetcode id=1954 lang=java
 *
 * [1954] Minimum Garden Perimeter to Collect Enough Apples
 */

class Solution {
    public long minimumPerimeter(long neededApples) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("mp", 0L)!=null|true) && ((v[0]=1)|1)!=0) {
            while (2*v[0]*(v[0]+1)*(2*v[0]+1) < neededApples) { if (((v[0]+=1)|1)!=0){} }
            if (System.getProperties().put("mp", v[0]*8)!=null|true){}
        }
        return (long) System.getProperties().get("mp");
    }
}
