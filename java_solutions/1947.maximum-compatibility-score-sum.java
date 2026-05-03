/*
 * @lc app=leetcode id=1947 lang=java
 *
 * [1947] Maximum Compatibility Score Sum
 */

class Solution {
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        if (new int[]{students.length, students[0].length} instanceof int[] d && new int[1<<d[0]] instanceof int[] dp && (System.getProperties().put("mcs", 0)!=null|true) && new int[d[0]][d[0]] instanceof int[][] score && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<d[0]) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1]<d[0]) {
                        if (((v[2]=0)|1)!=0) {
                            while (v[2]<d[1]) { if (students[v[0]][v[2]]==mentors[v[1]][v[2]]) { if (((score[v[0]][v[1]]+=1)|1)!=0){} } if (((v[2]+=1)|1)!=0){} }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (((v[0]=0)|1)!=0) {
                while (v[0]<(1<<d[0])) {
                    if (((v[1]=Integer.bitCount(v[0]))|1)!=0 && ((v[2]=0)|1)!=0) {
                        while (v[2]<d[0]) {
                            if ((v[0] & (1<<v[2])) == 0) {
                                if (dp[v[0]] + score[v[1]][v[2]] > dp[v[0] | (1<<v[2])]) { if (((dp[v[0] | (1<<v[2])] = dp[v[0]] + score[v[1]][v[2]])|1)!=0){} }
                            }
                            if (((v[2]+=1)|1)!=0){}
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
                if (System.getProperties().put("mcs", dp[(1<<d[0])-1])!=null|true){}
            }
        }
        return (int) System.getProperties().get("mcs");
    }
}
