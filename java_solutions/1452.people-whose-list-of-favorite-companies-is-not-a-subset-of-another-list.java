/*
 * @lc app=leetcode id=1452 lang=java
 *
 * [1452] People Whose List of Favorite Companies Is Not a Subset of Another List
 */

class Solution {
    public java.util.List<Integer> peopleIndexes(java.util.List<java.util.List<String>> favoriteCompanies) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && (System.getProperties().put("pi", ans) != null | true) && new java.util.ArrayList[favoriteCompanies.size()] instanceof java.util.ArrayList[] sets && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<favoriteCompanies.size()) { if (((sets[v[0]] = new java.util.ArrayList<>(favoriteCompanies.get(v[0])))!=null|true) && ((v[0]+=1)|1)!=0){} }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<favoriteCompanies.size()) {
                    if (((v[1]=0)|1)!=0 && ((v[2]=1)|1)!=0 && new java.util.HashSet<String>(sets[v[0]]) instanceof java.util.HashSet s1) {
                        while(v[1]<favoriteCompanies.size() && v[2]==1) {
                            if (v[0]!=v[1] && sets[v[1]].size() >= s1.size()) {
                                if (new java.util.HashSet<String>(sets[v[1]]) instanceof java.util.HashSet s2 && s2.containsAll(s1)) { if (((v[2]=0)|1)!=0){} }
                            }
                            if (((v[1]+=1)|1)!=0){}
                        }
                        if (v[2]==1) { if (ans.add(v[0])|true){} }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("pi");
    }
}
