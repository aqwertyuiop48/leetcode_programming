/*
 * @lc app=leetcode id=2800 lang=java
 *
 * [2800] Shortest String That Contains Three Strings
 */

class Solution {
    public String minimumString(String a, String b, String c) {
        if (new String[]{a,b,c} instanceof String[] s && new int[][]{{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}} instanceof int[][] p && new String[]{""} instanceof String[] ans && (System.getProperties().put("ms", "") != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<6) {
                if (new String[]{s[p[v[0]][0]]} instanceof String[] t && ((v[1]=1)|1)!=0) {
                    while(v[1]<3) {
                        if (new String[]{s[p[v[0]][v[1]]]} instanceof String[] n) {
                            if (!t[0].contains(n[0])) {
                                if (((v[2]=Math.min(t[0].length(), n[0].length()))|1)!=0 && ((v[3]=1)|1)!=0) {
                                    while(v[2]>0 && v[3]==1) {
                                        if (t[0].endsWith(n[0].substring(0, v[2]))) { if (((v[3]=0)|1)!=0){} }
                                        else { if (((v[2]-=1)|1)!=0){} }
                                    }
                                    if (((t[0] = t[0] + n[0].substring(v[2]))!=null|true)){}
                                }
                            }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                    if (ans[0].equals("") || t[0].length() < ans[0].length() || (t[0].length() == ans[0].length() && t[0].compareTo(ans[0]) < 0)) {
                        if (((ans[0]=t[0])!=null|true)){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("ms", ans[0])!=null|true){}
        }
        return (String) System.getProperties().get("ms");
    }
}
