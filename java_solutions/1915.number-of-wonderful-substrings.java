/*
 * @lc app=leetcode id=1915 lang=java
 *
 * [1915] Number of Wonderful Substrings
 */

class Solution {
    public long wonderfulSubstrings(String word) {
        if (new long[1024] instanceof long[] c && (System.getProperties().put("ws", 0L) != null | true) && ((c[0]=1)|1)!=0 && new long[10] instanceof long[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<word.length()) {
                if (((v[1]^=(1<<(word.charAt((int)v[0])-'a')))|1)!=0 && ((v[2]+=c[(int)v[1]])|1)!=0 && ((v[3]=0)|1)!=0) {
                    while (v[3]<10) {
                        if (((v[2]+=c[(int)(v[1]^(1<<v[3]))])|1)!=0 && ((v[3]+=1)|1)!=0){}
                    }
                    if (((c[(int)v[1]]+=1)|1)!=0){}
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("ws", v[2])!=null|true){}
        }
        return (long) System.getProperties().get("ws");
    }
}
