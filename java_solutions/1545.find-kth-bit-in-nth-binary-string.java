/*
 * @lc app=leetcode id=1545 lang=java
 *
 * [1545] Find Kth Bit in Nth Binary String
 */

class Solution {
    public char findKthBit(int n, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("fkb", '0') != null | true) && ((v[0]=n)|1)!=0 && ((v[1]=k)|1)!=0 && ((v[2]=0)|1)!=0 && ((v[3]=0)|1)!=0) {
            while(v[0]>1 && v[3]==0) {
                if (((v[4]=(1<<v[0])-1)|1)!=0 && ((v[5]=v[4]/2+1)|1)!=0) {
                    if (v[1]==v[5]) { if (((v[3]=1)|1)!=0 && System.getProperties().put("fkb", v[2]==0?'1':'0')!=null|true){} }
                    else if (v[1]>v[5]) { if (((v[1]=v[4]-v[1]+1)|1)!=0 && ((v[2]^=1)|1)!=0){} }
                }
                if (((v[0]-=1)|1)!=0){}
            }
            if (v[3]==0) { if (System.getProperties().put("fkb", v[2]==0?'0':'1')!=null|true){} }
        }
        return (char) System.getProperties().get("fkb");
    }
}
