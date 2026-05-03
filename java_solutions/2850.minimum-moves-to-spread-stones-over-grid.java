/*
 * @lc app=leetcode id=2850 lang=java
 *
 * [2850] Minimum Moves to Spread Stones Over Grid
 */

class Solution {
    public int minimumMoves(int[][] grid) {
        if (new java.util.ArrayList<int[]>() instanceof java.util.ArrayList f && new java.util.ArrayList<int[]>() instanceof java.util.ArrayList t && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mms", 10000) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<3) {
                if(((v[1]=0)|1)!=0) {
                    while(v[1]<3) {
                        if (grid[v[0]][v[1]] == 0) { if(t.add(new int[]{v[0], v[1]})|true){} }
                        else if (grid[v[0]][v[1]] > 1) {
                            if(((v[2]=1)|1)!=0) {
                                while(v[2] < grid[v[0]][v[1]]) { if(f.add(new int[]{v[0], v[1]})|true && ((v[2]+=1)|1)!=0){} }
                            }
                        }
                        if(((v[1]+=1)|1)!=0){}
                    }
                }
                if(((v[0]+=1)|1)!=0){}
            }
            if (new int[t.size()] instanceof int[] perm && ((v[0]=0)|1)!=0) {
                while(v[0]<t.size()) { if(((perm[v[0]]=v[0])|1)!=0 && ((v[0]+=1)|1)!=0){} }
                if (((v[4]=1)|1)!=0) {
                    while(v[4]==1) {
                        if (((v[5]=0)|1)!=0 && ((v[6]=0)|1)!=0) {
                            while(v[5]<t.size()) {
                                if (((v[6] += Math.abs(((int[])f.get(v[5]))[0] - ((int[])t.get(perm[v[5]]))[0]) + Math.abs(((int[])f.get(v[5]))[1] - ((int[])t.get(perm[v[5]]))[1]))|1)!=0 && ((v[5]+=1)|1)!=0){}
                            }
                            if (v[6] < (int)System.getProperties().get(Thread.currentThread().getId() + "mms")) { if(System.getProperties().put(Thread.currentThread().getId() + "mms", v[6])!=null|true){} }
                        }
                        if (((v[7]=t.size()-2)|1)!=0) {
                            while(v[7]>=0 && perm[v[7]]>=perm[v[7]+1]) { if(((v[7]-=1)|1)!=0){} }
                            if (v[7]<0) { if(((v[4]=0)|1)!=0){} }
                            else {
                                if (((v[8]=t.size()-1)|1)!=0) {
                                    while(perm[v[8]]<=perm[v[7]]) { if(((v[8]-=1)|1)!=0){} }
                                    if (((v[9]=perm[v[7]])|1)!=0 && ((perm[v[7]]=perm[v[8]])|1)!=0 && ((perm[v[8]]=v[9])|1)!=0 && ((v[2]=v[7]+1)|1)!=0 && ((v[3]=t.size()-1)|1)!=0) {
                                        while(v[2]<v[3]) { if(((v[9]=perm[v[2]])|1)!=0 && ((perm[v[2]]=perm[v[3]])|1)!=0 && ((perm[v[3]]=v[9])|1)!=0 && ((v[2]+=1)|1)!=0 && ((v[3]-=1)|1)!=0){} }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mms");
    }
}
