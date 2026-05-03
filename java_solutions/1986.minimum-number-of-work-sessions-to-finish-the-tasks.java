/*
 * @lc app=leetcode id=1986 lang=java
 *
 * [1986] Minimum Number of Work Sessions to Finish the Tasks
 */

class Solution {
    public int minSessions(int[] tasks, int sessionTime) {
        if (new int[1<<tasks.length] instanceof int[] dp && (System.getProperties().put("mses", 0)!=null|true) && new int[10] instanceof int[] v && ((v[0]=1)|1)!=0) {
            while (v[0]<(1<<tasks.length)) {
                if (((dp[v[0]]=1000000)|1)!=0 && ((v[1]=0)|1)!=0) {
                    while (v[1]<tasks.length) {
                        if ((v[0]&(1<<v[1]))!=0) {
                            if (((v[2]=v[0]^(1<<v[1]))|1)!=0 && ((v[3]=dp[v[2]]/100)|1)!=0 && ((v[4]=dp[v[2]]%100)|1)!=0) {
                                if (v[4]+tasks[v[1]]<=sessionTime) { if (((v[5]=v[3]*100+v[4]+tasks[v[1]])|1)!=0){} }
                                else { if (((v[5]=(v[3]+1)*100+tasks[v[1]])|1)!=0){} }
                                if (v[5]<dp[v[0]]) { if (((dp[v[0]]=v[5])|1)!=0){} }
                            }
                        }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (System.getProperties().put("mses", dp[(1<<tasks.length)-1]/100 + 1)!=null|true){}
        }
        return (int) System.getProperties().get("mses");
    }
}
