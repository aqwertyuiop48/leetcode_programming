/*
 * @lc app=leetcode id=2768 lang=java
 *
 * [2768] Number of Black Blocks
 */

class Solution {
    public long[] countBlackBlocks(int m, int n, int[][] coordinates) {
        if (new long[5] instanceof long[] ans && new java.util.HashMap<Long, Integer>() instanceof java.util.HashMap map && (System.getProperties().put("cbb", ans) != null | true) && ((ans[0] = (long)(m-1)*(n-1))|1)!=0 && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<coordinates.length) {
                if (((v[1]=coordinates[v[0]][0])|1)!=0 && ((v[2]=coordinates[v[0]][1])|1)!=0 && ((v[3]=Math.max(0,v[1]-1))|1)!=0) {
                    while(v[3]<=Math.min(m-2,v[1])) {
                        if (((v[4]=Math.max(0,v[2]-1))|1)!=0) {
                            while(v[4]<=Math.min(n-2,v[2])) {
                                if (((v[5]=(int)map.getOrDefault(((long)v[3]<<32)|v[4], 0))|1)!=0 && ((ans[v[5]]-=1)|1)!=0 && ((ans[v[5]+1]+=1)|1)!=0 && map.put(((long)v[3]<<32)|v[4], v[5]+1)==null|true && ((v[4]+=1)|1)!=0){}
                            }
                        }
                        if(((v[3]+=1)|1)!=0){}
                    }
                }
                if(((v[0]+=1)|1)!=0){}
            }
        }
        return (long[]) System.getProperties().get("cbb");
    }
}
