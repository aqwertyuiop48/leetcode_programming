/*
 * @lc app=leetcode id=1513 lang=java
 *
 * [1513] Number of Substrings With Only 1s
 */

class Solution {
    public int numSub(String s) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("nsb", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<s.length()) {
                if (s.charAt((int)v[0]) == '1') {
                    if (((v[1]+=1)|1)!=0 && ((v[2]=(v[2]+v[1])%1000000007L)|1)!=0){}
                } else {
                    if (((v[1]=0)|1)!=0){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("nsb", (int)v[2])!=null|true){}
        }
        return (int) System.getProperties().get("nsb");
    }
}
