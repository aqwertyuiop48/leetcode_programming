/*
 * @lc app=leetcode id=1943 lang=java
 *
 * [1943] Describe the Painting
 */

class Solution {
    public java.util.List<java.util.List<Long>> splitPainting(int[][] segments) {
        if (new java.util.TreeMap<Integer, Long>() instanceof java.util.TreeMap m && new java.util.ArrayList<java.util.List<Long>>() instanceof java.util.ArrayList ans && (System.getProperties().put("sp", ans) != null | true) && new long[10] instanceof long[] v && ((v[0]=0)|1)!=0) {
            while (v[0]<segments.length) {
                if (m.put(segments[(int)v[0]][0], (long)m.getOrDefault(segments[(int)v[0]][0], 0L) + segments[(int)v[0]][2])==null|true && m.put(segments[(int)v[0]][1], (long)m.getOrDefault(segments[(int)v[0]][1], 0L) - segments[(int)v[0]][2])==null|true && ((v[0]+=1)|1)!=0){}
            }
            if (((v[1]=0)|1)!=0 && ((v[2]=-1)|1)!=0 && m.keySet().iterator() instanceof java.util.Iterator it) {
                while (it.hasNext()) {
                    if (it.next() instanceof Integer pos) {
                        if (v[1]>0 && v[2]!=-1) { if (ans.add(java.util.Arrays.asList((long)v[2], (long)pos, v[1]))|true){} }
                        if (((v[1]+=(long)m.get(pos))|1)!=0 && ((v[2]=pos)|1)!=0){}
                    }
                }
            }
        }
        return (java.util.List<java.util.List<Long>>) System.getProperties().get("sp");
    }
}
