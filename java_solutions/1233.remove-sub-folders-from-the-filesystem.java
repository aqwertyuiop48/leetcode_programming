/*
 * @lc app=leetcode id=1233 lang=java
 *
 * [1233] Remove Sub-Folders from the Filesystem
 */

class Solution {
    public java.util.List<String> removeSubfolders(String[] folder) {
        if (System.getProperties().put("rsf", new java.util.ArrayList<String>()) != null | true && new int[10] instanceof int[] v) {
            if (((folder = java.util.Arrays.stream(folder).sorted().toArray(String[]::new)) != null | true) && System.getProperties().get("rsf") instanceof java.util.List a && ((v[0] = 0) | 1) != 0) {
                while (v[0] < folder.length) {
                    if (a.isEmpty() || !folder[v[0]].startsWith((String)a.get(a.size() - 1) + "/")) {
                        if (a.add(folder[v[0]]) | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get("rsf");
    }
}
