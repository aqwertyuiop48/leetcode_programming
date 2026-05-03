/*
 * @lc app=leetcode id=1046 lang=java
 *
 * [1046] Last Stone Weight
 */

class Solution {
    public int lastStoneWeight(int[] s) {
        if(new java.util.PriorityQueue<Integer>((a,b)->b-a) instanceof java.util.PriorityQueue pq && (System.getProperties().put("lsw",0)!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<s.length){if(pq.add(s[v[0]])|true && ((v[0]+=1)|1)!=0){}}
            while(pq.size()>1){if(((v[1]=(int)pq.poll())|1)!=0 && ((v[2]=(int)pq.poll())|1)!=0 && v[1]!=v[2] && pq.add(v[1]-v[2])|true){}}
            if(System.getProperties().put("lsw",pq.isEmpty()?0:(int)pq.poll())!=null|true){}
        }return (int)System.getProperties().get("lsw");
    }
}
