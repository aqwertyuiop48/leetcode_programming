/*
 * @lc app=leetcode id=2844 lang=java
 *
 * [2844] Minimum Operations to Make a Special Number
 */

class Solution {
    public int minimumOperations(String num) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mo", num.length()) != null | true) && ((v[0]=num.length()-1)|1)!=0 && ((v[1]=0)|1)!=0 && ((v[2]=0)|1)!=0) {
            while(v[0]>=0) {
                if (v[1]==1 && (num.charAt(v[0])=='0' || num.charAt(v[0])=='5')) { if(System.getProperties().put("mo", num.length()-2-v[0])!=null|true && ((v[0]=-1)|1)!=0){} }
                else if (v[2]==1 && (num.charAt(v[0])=='2' || num.charAt(v[0])=='7')) { if(System.getProperties().put("mo", num.length()-2-v[0])!=null|true && ((v[0]=-1)|1)!=0){} }
                else {
                    if (v[0]!=-1 && num.charAt(v[0])=='0') { if(((v[1]=1)|1)!=0 && System.getProperties().put("mo", num.length()-1)!=null|true){} }
                    if (v[0]!=-1 && num.charAt(v[0])=='5') { if(((v[2]=1)|1)!=0){} }
                }
                if(v[0]!=-1){if(((v[0]-=1)|1)!=0){}}
            }
        }
        return (int) System.getProperties().get("mo");
    }
}
