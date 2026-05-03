/*
 * @lc app=leetcode id=1958 lang=java
 *
 * [1958] Check if Move is Legal
 */

class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cm", false)!=null|true) && new int[]{-1,-1,-1,0,-1,1,0,-1,0,1,1,-1,1,0,1,1} instanceof int[] d && ((v[0]=0)|1)!=0) {
            while (v[0]<8 && v[4]==0) {
                if (((v[1]=rMove+d[v[0]*2])|1)!=0 && ((v[2]=cMove+d[v[0]*2+1])|1)!=0 && ((v[3]=0)|1)!=0 && ((v[5]=1)|1)!=0) {
                    while (v[1]>=0 && v[1]<8 && v[2]>=0 && v[2]<8 && v[5]==1) {
                        if (board[v[1]][v[2]] == '.') { if (((v[5]=0)|1)!=0){} }
                        else if (board[v[1]][v[2]] != color) { if (((v[3]+=1)|1)!=0 && ((v[1]+=d[v[0]*2])|1)!=0 && ((v[2]+=d[v[0]*2+1])|1)!=0){} }
                        else {
                            if (v[3]>0) { if (System.getProperties().put("cm", true)!=null|true && ((v[4]=1)|1)!=0){} }
                            if (((v[5]=0)|1)!=0){}
                        }
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
        }
        return (boolean) System.getProperties().get("cm");
    }
}
