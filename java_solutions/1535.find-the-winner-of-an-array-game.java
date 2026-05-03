/*
 * @lc app=leetcode id=1535 lang=java
 *
 * [1535] Find the Winner of an Array Game
 */

class Solution {
    public int getWinner(int[] arr, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("gw", 0) != null | true) && ((v[0]=arr[0])|1)!=0 && ((v[1]=0)|1)!=0 && ((v[2]=1)|1)!=0) {
            while(v[2]<arr.length && v[1]<k) {
                if (arr[v[2]]>v[0]) { if (((v[0]=arr[v[2]])|1)!=0 && ((v[1]=1)|1)!=0){} }
                else { if (((v[1]+=1)|1)!=0){} }
                if (((v[2]+=1)|1)!=0){}
            }
            if (System.getProperties().put("gw", v[0])!=null|true){}
        }
        return (int) System.getProperties().get("gw");
    }
}
