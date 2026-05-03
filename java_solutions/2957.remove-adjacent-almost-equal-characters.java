/*
 * @lc app=leetcode id=2957 lang=java
 *
 * [2957] Remove Adjacent Almost-Equal Characters
 */

class Solution {
    public int removeAlmostEqualCharacters(String word) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("rac", 0) != null | true) && ((v[0]=1)|1)!=0 && ((v[1]=0)|1)!=0) {
            while(v[0]<word.length()) {
                if (Math.abs(word.charAt(v[0]) - word.charAt(v[0]-1)) <= 1) { if (((v[1]+=1)|1)!=0 && ((v[0]+=2)|1)!=0){} }
                else { if (((v[0]+=1)|1)!=0){} }
            }
            if (System.getProperties().put("rac", v[1])!=null|true){}
        }
        return (int) System.getProperties().get("rac");
    }
}
