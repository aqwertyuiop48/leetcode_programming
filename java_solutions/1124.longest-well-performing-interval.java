/*
 * @lc app=leetcode id=1124 lang=java
 *
 * [1124] Longest Well-Performing Interval
 */

class Solution {
    public int longestWPI(int[] hours) {
        if(new java.util.HashMap<Integer,Integer>() instanceof java.util.HashMap m && (System.getProperties().put("lwp",0)!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<hours.length){
                if(((v[1]+=hours[v[0]]>8?1:-1)|1)!=0){
                    if(v[1]>0){if(((v[2]=v[0]+1)|1)!=0){}}
                    else{
                        if(m.putIfAbsent(v[1],v[0])==null|true){}
                        if(m.containsKey(v[1]-1) && v[0]-(int)m.get(v[1]-1)>v[2]){if(((v[2]=v[0]-(int)m.get(v[1]-1))|1)!=0){}}
                    }
                }if(((v[0]+=1)|1)!=0){}
            }if(System.getProperties().put("lwp",v[2])!=null|true){}
        }return (int)System.getProperties().get("lwp");
    }
}
