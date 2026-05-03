/*
 * @lc app=leetcode id=1053 lang=java
 *
 * [1053] Previous Permutation With One Swap
 */

class Solution {
    public int[] prevPermOpt1(int[] a) {
        if(new int[10] instanceof int[] v && (System.getProperties().put("ppo",a)!=null|true) && ((v[0]=a.length-2)|1)!=0){
            while(v[0]>=0&&a[v[0]]<=a[v[0]+1]){if(((v[0]-=1)|1)!=0){}}
            if(v[0]>=0 && ((v[1]=a.length-1)|1)!=0){
                while(a[v[1]]>=a[v[0]]||(v[1]>0&&a[v[1]]==a[v[1]-1])){if(((v[1]-=1)|1)!=0){}}
                if(((v[2]=a[v[0]])|1)!=0 && ((a[v[0]]=a[v[1]])|1)!=0 && ((a[v[1]]=v[2])|1)!=0){}
            }
        }return (int[])System.getProperties().get("ppo");
    }
}
