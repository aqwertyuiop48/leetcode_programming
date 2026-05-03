/*
 * @lc app=leetcode id=2930 lang=java
 *
 * [2930] Number of Strings Which Can Be Rearranged to Contain Substring
 */

class Solution {
    public int stringCount(int n) {
        if (new long[10] instanceof long[] v && (System.getProperties().put("sc", 0) != null | true) && ((v[0]=1)|1)!=0 && ((v[1]=1)|1)!=0 && ((v[2]=1)|1)!=0 && ((v[3]=1)|1)!=0 && ((v[4]=1)|1)!=0 && ((v[5]=1000000007)|1)!=0) {
            while(v[0]<=n) {
                if (((v[6]=v[2])|1)!=0 && ((v[7]=v[3])|1)!=0 && ((v[8]=v[4])|1)!=0) {
                    if (((v[1]=(v[1]*26)%v[5])|1)!=0 && ((v[2]=(v[2]*25)%v[5])|1)!=0 && ((v[3]=(v[3]*24)%v[5])|1)!=0 && ((v[4]=(v[4]*23)%v[5])|1)!=0 && ((v[0]+=1)|1)!=0){}
                }
            }
            if (((v[0]=n)|1)!=0) {
                if (new long[]{v[2], v[2], (v[2] + v[0]*v[6])%v[5], v[3], (v[3] + v[0]*v[7])%v[5], (v[3] + v[0]*v[7])%v[5], (v[4] + v[0]*v[8])%v[5]} instanceof long[] x) {
                    if (((v[9] = (v[1] - (x[0]+x[1]+x[2])%v[5] + (x[3]+x[4]+x[5])%v[5] - x[6])%v[5])|1)!=0) {
                        if (System.getProperties().put("sc", (int)((v[9]%v[5]+v[5])%v[5]))!=null|true){}
                    }
                }
            }
        }
        return (int) System.getProperties().get("sc");
    }
}
