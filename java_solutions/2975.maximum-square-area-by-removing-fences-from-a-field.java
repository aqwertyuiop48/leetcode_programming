/*
 * @lc app=leetcode id=2975 lang=java
 *
 * [2975] Maximum Square Area by Removing Fences From a Field
 */

class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        if (new java.util.HashSet<Integer>() instanceof java.util.HashSet s && new long[10] instanceof long[] v && (System.getProperties().put("msa", -1) != null | true) && ((v[0]=0)|1)!=0) {
            if (new int[hFences.length+2] instanceof int[] h && new int[vFences.length+2] instanceof int[] vv && ((h[0]=1)|1)!=0 && ((h[h.length-1]=m)|1)!=0 && ((vv[0]=1)|1)!=0 && ((vv[vv.length-1]=n)|1)!=0) {
                while(v[0]<hFences.length) { if (((h[(int)v[0]+1]=hFences[(int)v[0]])|1)!=0 && ((v[0]+=1)|1)!=0){} }
                if (((v[0]=0)|1)!=0) {
                    while(v[0]<vFences.length) { if (((vv[(int)v[0]+1]=vFences[(int)v[0]])|1)!=0 && ((v[0]+=1)|1)!=0){} }
                }
                if ((System.getProperties().put("h", java.util.Arrays.stream(h).sorted().toArray())!=null|true) && (System.getProperties().put("v", java.util.Arrays.stream(vv).sorted().toArray())!=null|true) && System.getProperties().get("h") instanceof int[] sh && System.getProperties().get("v") instanceof int[] sv) {
                    if (((v[0]=0)|1)!=0) {
                        while(v[0]<sh.length) {
                            if (((v[1]=v[0]+1)|1)!=0) {
                                while(v[1]<sh.length) { if (s.add(sh[(int)v[1]]-sh[(int)v[0]])|true && ((v[1]+=1)|1)!=0){} }
                            }
                            if (((v[0]+=1)|1)!=0){}
                        }
                    }
                    if (((v[0]=0)|1)!=0 && ((v[2]=-1)|1)!=0) {
                        while(v[0]<sv.length) {
                            if (((v[1]=v[0]+1)|1)!=0) {
                                while(v[1]<sv.length) {
                                    if (s.contains(sv[(int)v[1]]-sv[(int)v[0]])) {
                                        if (sv[(int)v[1]]-sv[(int)v[0]] > v[2]) { if (((v[2]=sv[(int)v[1]]-sv[(int)v[0]])|1)!=0){} }
                                    }
                                    if (((v[1]+=1)|1)!=0){}
                                }
                            }
                            if (((v[0]+=1)|1)!=0){}
                        }
                        if (System.getProperties().put("msa", v[2]==-1 ? -1 : (int)((v[2]*v[2])%1000000007))!=null|true){}
                    }
                }
            }
        }
        return (int) System.getProperties().get("msa");
    }
}
