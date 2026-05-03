/*
 * @lc app=leetcode id=1927 lang=java
 *
 * [1927] Sum Game
 */

class Solution {
    public boolean sumGame(String num) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("sg", false) != null | true) && ((v[0]=0)|1)!=0) {
            while (v[0]<num.length()) {
                if (num.charAt(v[0])=='?') { if (v[0]<num.length()/2 ? ((v[1]+=1)|1)!=0 : ((v[2]+=1)|1)!=0){} }
                else { if (v[0]<num.length()/2 ? ((v[3]+=num.charAt(v[0])-'0')|1)!=0 : ((v[4]+=num.charAt(v[0])-'0')|1)!=0){} }
                if (((v[0]+=1)|1)!=0){}
            }
            if ((v[1]+v[2])%2==1 || v[3]-v[4] != 9*(v[2]-v[1])/2) { if (System.getProperties().put("sg", true)!=null|true){} }
        }
        return (boolean) System.getProperties().get("sg");
    }
}
