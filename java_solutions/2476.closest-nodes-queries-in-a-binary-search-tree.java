/*
 * @lc app=leetcode id=2476 lang=java
 *
 * [2476] Closest Nodes Queries in a Binary Search Tree
 */

class Solution {
    public java.util.List<java.util.List<Integer>> closestNodes(TreeNode root, java.util.List<Integer> queries) {
        if (System.getProperties().put("cnq", new java.util.ArrayList<java.util.List<Integer>>()) != null | true && new Object[]{new java.util.ArrayList<Integer>()} instanceof Object[] o && o[0] instanceof java.util.List a && new int[10] instanceof int[] v) {
            if (new java.util.function.Function[1] instanceof java.util.function.Function[] f && (f[0] = n -> n == null ? true : ((boolean)f[0].apply(((TreeNode)n).left) && a.add(((TreeNode)n).val) | true && (boolean)f[0].apply(((TreeNode)n).right))) != null && (boolean)f[0].apply(root)) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < queries.size()) {
                        if (((v[1] = 0) | 1) != 0 && ((v[2] = a.size() - 1) | 1) != 0 && ((v[3] = -1) | 1) != 0 && ((v[4] = -1) | 1) != 0) {
                            while (v[1] <= v[2]) {
                                if (((v[5] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                                    if ((int)a.get(v[5]) == queries.get(v[0])) { if (((v[3] = (int)a.get(v[5])) | 1) != 0 && ((v[4] = (int)a.get(v[5])) | 1) != 0 && ((v[1] = v[2] + 1) | 1) != 0) {} }
                                    else if ((int)a.get(v[5]) < queries.get(v[0])) { if (((v[3] = (int)a.get(v[5])) | 1) != 0 && ((v[1] = v[5] + 1) | 1) != 0) {} }
                                    else { if (((v[4] = (int)a.get(v[5])) | 1) != 0 && ((v[2] = v[5] - 1) | 1) != 0) {} }
                                }
                            }
                            if (((java.util.List)System.getProperties().get("cnq")).add(java.util.Arrays.asList(v[3], v[4])) | true && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (java.util.List<java.util.List<Integer>>) System.getProperties().get("cnq");
    }
}
