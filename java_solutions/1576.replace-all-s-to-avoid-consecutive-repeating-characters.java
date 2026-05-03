/*
 * @lc app=leetcode id=1576 lang=java
 *
 * [1576] Replace All ?'s to Avoid Consecutive Repeating Characters
 */

class Solution {
    public String modifyString(String s) {
        if (s.toCharArray() instanceof char[] c && (System.getProperties().put("ms", "") != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0] < c.length) {
                if (c[v[0]] == '?') {
                    if (((v[1]='a')|1)!=0) {
                        while (v[1] <= 'c') {
                            if ((v[0] == 0 || c[v[0]-1] != v[1]) && (v[0] == c.length - 1 || c[v[0]+1] != v[1])) {
                                if (((c[v[0]] = (char)v[1])|1)!=0 && ((v[1]=1000)|1)!=0){}
                            }
                            if (((v[1]+=1)|1)!=0){}
                        }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("ms", new String(c)) != null | true){}
        }
        return (String) System.getProperties().get("ms");
    }
}
