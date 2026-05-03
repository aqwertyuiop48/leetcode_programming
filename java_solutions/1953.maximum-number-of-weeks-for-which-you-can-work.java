/*
 * @lc app=leetcode id=1953 lang=java
 *
 * [1953] Maximum Number of Weeks for Which You Can Work
 */

class Solution {
    public long numberOfWeeks(int[] milestones) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("now", 0L)!=null|true) && ((v[0]=0)|1)!=0) {
            while (v[0]<milestones.length) {
                if (((v[1]+=milestones[(int)v[0]])|1)!=0 && milestones[(int)v[0]]>v[2]) { if (((v[2]=milestones[(int)v[0]])|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (v[2] > v[1]-v[2]+1) { if (System.getProperties().put("now", (v[1]-v[2])*2+1)!=null|true){} }
            else { if (System.getProperties().put("now", v[1])!=null|true){} }
        }
        return (long) System.getProperties().get("now");
    }
}
