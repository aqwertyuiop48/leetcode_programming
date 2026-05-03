/*
 * @lc app=leetcode id=1975 lang=java
 *
 * [1975] Maximum Matrix Sum
 */

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("mms", 0L)!=null|true) && ((v[0]=0)|1)!=0 && ((v[3]=1000000000)|1)!=0) {
            while (v[0]<matrix.length) {
                if (((v[1]=0)|1)!=0) {
                    while (v[1]<matrix[0].length) {
                        if (((v[2]+=Math.abs(matrix[(int)v[0]][(int)v[1]]))|1)!=0 && Math.abs(matrix[(int)v[0]][(int)v[1]])<v[3]) { if (((v[3]=Math.abs(matrix[(int)v[0]][(int)v[1]]))|1)!=0){} }
                        if (matrix[(int)v[0]][(int)v[1]]<0) { if (((v[4]+=1)|1)!=0){} }
                        if (((v[1]+=1)|1)!=0){}
                    }
                }
                if (((v[0]+=1)|1)!=0){}
            }
            if (v[4]%2!=0) { if (((v[2]-=2*v[3])|1)!=0){} }
            if (System.getProperties().put("mms", v[2])!=null|true){}
        }
        return (long) System.getProperties().get("mms");
    }
}
