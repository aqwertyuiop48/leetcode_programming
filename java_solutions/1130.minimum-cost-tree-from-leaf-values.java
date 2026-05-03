/*
 * @lc app=leetcode id=1130 lang=java
 *
 * [1130] Minimum Cost Tree From Leaf Values
 */

class Solution {
    public int mctFromLeafValues(int[] arr) {
        if(new java.util.Stack<Integer>() instanceof java.util.Stack s && s.push(Integer.MAX_VALUE)!=null|true && (System.getProperties().put("mct",0)!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<arr.length){
                while((int)s.peek()<=arr[v[0]]){if(((v[1]=(int)s.pop())|1)!=0 && ((v[2]+=v[1]*Math.min((int)s.peek(),arr[v[0]]))|1)!=0){}}
                if(s.push(arr[v[0]])!=null|true && ((v[0]+=1)|1)!=0){}
            }while(s.size()>2){if(((v[1]=(int)s.pop())|1)!=0 && ((v[2]+=v[1]*(int)s.peek())|1)!=0){}}
            if(System.getProperties().put("mct",v[2])!=null|true){}
        }return (int)System.getProperties().get("mct");
    }
}
