/*
 * @lc app=leetcode id=1462 lang=java
 *
 * [1462] Course Schedule IV
 */

class Solution {
    public java.util.List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        if (new boolean[numCourses][numCourses] instanceof boolean[][] adj && new java.util.ArrayList<Boolean>() instanceof java.util.ArrayList ans && (System.getProperties().put("cip", ans) != null | true) && new int[10] instanceof int[] v && ((v[0]=0)|1)!=0) {
            while(v[0]<prerequisites.length) { if (((adj[prerequisites[v[0]][0]][prerequisites[v[0]][1]]=true)|true) && ((v[0]+=1)|1)!=0){} }
            if (((v[2]=0)|1)!=0) {
                while(v[2]<numCourses) {
                    if (((v[0]=0)|1)!=0) {
                        while(v[0]<numCourses) {
                            if (((v[1]=0)|1)!=0) {
                                while(v[1]<numCourses) {
                                    if (adj[v[0]][v[2]] && adj[v[2]][v[1]]) { if ((adj[v[0]][v[1]]=true)|true){} }
                                    if (((v[1]+=1)|1)!=0){}
                                }
                            }
                            if (((v[0]+=1)|1)!=0){}
                        }
                    }
                    if (((v[2]+=1)|1)!=0){}
                }
            }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<queries.length) { if (ans.add(adj[queries[v[0]][0]][queries[v[0]][1]])|true && ((v[0]+=1)|1)!=0){} }
            }
        }
        return (java.util.List<Boolean>) System.getProperties().get("cip");
    }
}
