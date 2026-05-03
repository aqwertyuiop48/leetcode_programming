/*
 * @lc app=leetcode id=1105 lang=java
 *
 * [1105] Filling Bookcase Shelves
 */

class Solution {
    public int minHeightShelves(int[][] b, int w) {
        if(java.util.stream.IntStream.generate(()->1000000).limit(b.length+1).toArray() instanceof int[] d && (System.getProperties().put("mhs",0)!=null|true) && ((d[0]=0)|1)!=0 && new int[10] instanceof int[] v && ((v[0]=1)|1)!=0){
            while(v[0]<=b.length){
                if(((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=v[0])|1)!=0){
                    while(v[3]>0){
                        if(((v[1]+=b[v[3]-1][0])|1)!=0 && v[1]>w){if(((v[3]=1)|1)!=0){}}
                        else{if(((v[2]=Math.max(v[2],b[v[3]-1][1]))|1)!=0 && ((d[v[0]]=Math.min(d[v[0]],d[v[3]-1]+v[2]))|1)!=0){}}
                        if(((v[3]-=1)|1)!=0){}
                    }
                }if(((v[0]+=1)|1)!=0){}
            }if(System.getProperties().put("mhs",d[b.length])!=null|true){}
        }return (int)System.getProperties().get("mhs");
    }
}
