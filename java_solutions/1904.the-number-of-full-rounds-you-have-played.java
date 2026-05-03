/*
 * @lc app=leetcode id=1904 lang=java
 *
 * [1904] The Number of Full Rounds You Have Played
 */

class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("fr", 0) != null | true) && ((v[0]=Integer.parseInt(loginTime.substring(0,2))*60+Integer.parseInt(loginTime.substring(3)))|1)!=0 && ((v[1]=Integer.parseInt(logoutTime.substring(0,2))*60+Integer.parseInt(logoutTime.substring(3)))|1)!=0) {
            if (v[0]>v[1]) { if (((v[1]+=24*60)|1)!=0){} }
            if (((v[2]=(v[0]+14)/15)|1)!=0 && ((v[3]=v[1]/15)|1)!=0) {
                if (System.getProperties().put("fr", Math.max(0, v[3]-v[2]))!=null|true){}
            }
        }
        return (int) System.getProperties().get("fr");
    }
}
