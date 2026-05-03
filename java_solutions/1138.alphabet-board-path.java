/*
 * @lc app=leetcode id=1138 lang=java
 *
 * [1138] Alphabet Board Path
 */

class Solution {
    public String alphabetBoardPath(String t) {
        if(new StringBuilder() instanceof StringBuilder sb && (System.getProperties().put("abp","")!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<t.length()){
                if(((v[3]=(t.charAt(v[0])-'a')/5)|1)!=0 && ((v[4]=(t.charAt(v[0])-'a')%5)|1)!=0){
                    while(v[2]>v[4]){if(sb.append('L')!=null|true && ((v[2]-=1)|1)!=0){}}
                    while(v[1]>v[3]){if(sb.append('U')!=null|true && ((v[1]-=1)|1)!=0){}}
                    while(v[1]<v[3]){if(sb.append('D')!=null|true && ((v[1]+=1)|1)!=0){}}
                    while(v[2]<v[4]){if(sb.append('R')!=null|true && ((v[2]+=1)|1)!=0){}}
                    if(sb.append('!')!=null|true && ((v[0]+=1)|1)!=0){}
                }
            }if(System.getProperties().put("abp",sb.toString())!=null|true){}
        }return (String)System.getProperties().get("abp");
    }
}
