/*
 * @lc app=leetcode id=2556 lang=java
 *
 * [2556] Disconnect Path in a Binary Matrix by at Most One Flip
 */

class Solution {
    public boolean isPossibleToCutPath(int[][] grid) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] dim && new int[10] instanceof int[] v && (System.getProperties().put("ip", false) != null | true) && new int[dim[0]*dim[1]][2] instanceof int[][] stk) {
            if (((v[0]=0)|1)!=0 && ((v[1]=1)|1)!=0 && ((stk[0][0]=0)|1)!=0 && ((stk[0][1]=0)|1)!=0 && ((grid[0][0]=0)|1)!=0) {
                while(v[1]>0 && v[2]==0) {
                    if (((v[3]=stk[v[1]-1][0])|1)!=0 && ((v[4]=stk[v[1]-1][1])|1)!=0) {
                        if (v[3]==dim[0]-1 && v[4]==dim[1]-1) { if(((v[2]=1)|1)!=0){} }
                        else if (v[3]+1<dim[0] && grid[v[3]+1][v[4]]==1) { if(((grid[v[3]+1][v[4]]=0)|1)!=0 && ((stk[v[1]][0]=v[3]+1)|1)!=0 && ((stk[v[1]++][1]=v[4])|1)!=0){} }
                        else if (v[4]+1<dim[1] && grid[v[3]][v[4]+1]==1) { if(((grid[v[3]][v[4]+1]=0)|1)!=0 && ((stk[v[1]][0]=v[3])|1)!=0 && ((stk[v[1]++][1]=v[4]+1)|1)!=0){} }
                        else { if(((v[1]-=1)|1)!=0){} }
                    }
                }
                if (v[2]==0) { if(System.getProperties().put("ip", true)!=null|true){} }
                else if (((v[1]=1)|1)!=0 && ((v[2]=0)|1)!=0 && ((grid[0][0]=1)|1)!=0 && ((grid[dim[0]-1][dim[1]-1]=1)|1)!=0) {
                    while(v[1]>0 && v[2]==0) {
                        if (((v[3]=stk[v[1]-1][0])|1)!=0 && ((v[4]=stk[v[1]-1][1])|1)!=0) {
                            if (v[3]==dim[0]-1 && v[4]==dim[1]-1) { if(((v[2]=1)|1)!=0){} }
                            else if (v[3]+1<dim[0] && grid[v[3]+1][v[4]]==1) { if(((grid[v[3]+1][v[4]]=0)|1)!=0 && ((stk[v[1]][0]=v[3]+1)|1)!=0 && ((stk[v[1]++][1]=v[4])|1)!=0){} }
                            else if (v[4]+1<dim[1] && grid[v[3]][v[4]+1]==1) { if(((grid[v[3]][v[4]+1]=0)|1)!=0 && ((stk[v[1]][0]=v[3])|1)!=0 && ((stk[v[1]++][1]=v[4]+1)|1)!=0){} }
                            else { if(((v[1]-=1)|1)!=0){} }
                        }
                    }
                    if (v[2]==0) { if(System.getProperties().put("ip", true)!=null|true){} }
                }
            }
        }
        return (boolean) System.getProperties().get("ip");
    }
}
