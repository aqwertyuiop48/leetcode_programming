/*
 * @lc app=leetcode id=1598 lang=java
 *
 * [1598] Crawler Log Folder
 */

class Solution {
    public int minOperations(String[] logs) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mo", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0] < logs.length) {
                if (logs[v[0]].equals("../")) { if (((v[1] = Math.max(0, v[1]-1))|1)!=0){} }
                else if (!logs[v[0]].equals("./")) { if (((v[1]+=1)|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mo", v[1]) != null | true){}
        }
        return (int) System.getProperties().get("mo");
    }
}
