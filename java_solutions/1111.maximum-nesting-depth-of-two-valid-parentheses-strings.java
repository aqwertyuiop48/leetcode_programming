/*
 * @lc app=leetcode id=1111 lang=java
 *
 * [1111] Maximum Nesting Depth of Two Valid Parentheses Strings
 */

class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        if(new int[seq.length()] instanceof int[] a && (System.getProperties().put("md",a)!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<seq.length()){
                if(seq.charAt(v[0])=='('){if(((a[v[0]]=(++v[1])%2)|1)!=0){}}else{if(((a[v[0]]=(v[1]--)%2)|1)!=0){}}
                if(((v[0]+=1)|1)!=0){}
            }
        }return (int[])System.getProperties().get("md");
    }
}
