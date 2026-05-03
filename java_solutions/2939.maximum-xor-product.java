/*
 * @lc app=leetcode id=2939 lang=java
 *
 * [2939] Maximum Xor Product
 */

class Solution {
    public int maximumXorProduct(long a, long b, int n) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("mxp", 0) != null | true) && ((v[0]=a)|1)!=0 && ((v[1]=b)|1)!=0 && ((v[2]=1000000007L)|1)!=0 && ((v[3]=n-1)|1)!=0) {
            while(v[3]>=0) {
                if (((v[4]=1L<<(int)v[3])|1)!=0) {
                    if ((v[0]&v[4]) == (v[1]&v[4])) { if (((v[0]|=v[4])|1)!=0 && ((v[1]|=v[4])|1)!=0){} }
                    else if (v[0]>v[1]) { if (((v[0]&=~v[4])|1)!=0 && ((v[1]|=v[4])|1)!=0){} }
                    else { if (((v[0]|=v[4])|1)!=0 && ((v[1]&=~v[4])|1)!=0){} }
                }
                if (((v[3]-=1)|1)!=0){}
            }
            if (System.getProperties().put("mxp", (int)(((v[0]%v[2])*(v[1]%v[2]))%v[2]))!=null|true){}
        }
        return (int) System.getProperties().get("mxp");
    }
}
