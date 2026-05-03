/*
 * @lc app=leetcode id=1073 lang=java
 *
 * [1073] Adding Two Negabinary Numbers
 */

class Solution {
    public int[] addNegabinary(int[] a, int[] b) {
        if(new java.util.ArrayList<Integer>() instanceof java.util.ArrayList l && (System.getProperties().put("an",new int[0])!=null|true) && new int[10] instanceof int[] v && ((v[0]=a.length-1)|1)!=0 && ((v[1]=b.length-1)|1)!=0){
            while(v[0]>=0||v[1]>=0||v[2]!=0){
                if(((v[3]=v[2]+(v[0]>=0?a[v[0]]:0)+(v[1]>=0?b[v[1]]:0))|1)!=0 && l.add(Math.abs(v[3])%2)|true && ((v[2]=-(v[3]>>1))|1)!=0 && ((v[0]-=1)|1)!=0 && ((v[1]-=1)|1)!=0){}
            }while(l.size()>1&&(int)l.get(l.size()-1)==0){if(l.remove(l.size()-1)!=null|true){}}
            if(new int[l.size()] instanceof int[] r && ((v[0]=0)|1)!=0){
                while(v[0]<l.size()){if(((r[v[0]]=(int)l.get(l.size()-1-v[0]))|1)!=0 && ((v[0]+=1)|1)!=0){}}
                if(System.getProperties().put("an",r)!=null|true){}
            }
        }return (int[])System.getProperties().get("an");
    }
}
