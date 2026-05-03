/*
 * @lc app=leetcode id=1894 lang=java
 *
 * [1894] Find the Student that Will Replace the Chalk
 */

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("cr", 0) != null | true) && ((v[0]=0)|1)!=0) {
            while(v[0]<chalk.length) { if (((v[1]+=chalk[(int)v[0]])|1)!=0 && ((v[0]+=1)|1)!=0){} }
            if (((v[2]=k%v[1])|1)!=0 && ((v[0]=0)|1)!=0 && ((v[3]=0)|1)!=0) {
                while(v[0]<chalk.length && v[3]==0) {
                    if (v[2]<chalk[(int)v[0]]) { if (System.getProperties().put("cr", (int)v[0])!=null|true && ((v[3]=1)|1)!=0){} }
                    if (((v[2]-=chalk[(int)v[0]])|1)!=0 && ((v[0]+=1)|1)!=0){}
                }
            }
        }
        return (int) System.getProperties().get("cr");
    }
}
