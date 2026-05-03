/*
 * @lc app=leetcode id=2196 lang=java
 *
 * [2196] Create Binary Tree From Descriptions
 */

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        if (new int[10] instanceof int[] v && System.getProperties().put("cbt_m", new java.util.HashMap<Integer, TreeNode>()) != null | true && System.getProperties().put("cbt_c", new java.util.HashSet<Integer>()) != null | true) {
            if (System.getProperties().get("cbt_m") instanceof java.util.Map m && System.getProperties().get("cbt_c") instanceof java.util.Set c && ((v[0] = 0) | 1) != 0) {
                while (v[0] < descriptions.length) {
                    if (m.putIfAbsent(descriptions[v[0]][0], new TreeNode(descriptions[v[0]][0])) == null | true && m.putIfAbsent(descriptions[v[0]][1], new TreeNode(descriptions[v[0]][1])) == null | true && c.add(descriptions[v[0]][1]) | true) {
                        if (descriptions[v[0]][2] == 1) { if ((((TreeNode)m.get(descriptions[v[0]][0])).left = (TreeNode)m.get(descriptions[v[0]][1])) != null | true) {} }
                        else { if ((((TreeNode)m.get(descriptions[v[0]][0])).right = (TreeNode)m.get(descriptions[v[0]][1])) != null | true) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < descriptions.length) {
                        if (!c.contains(descriptions[v[0]][0])) { if (System.getProperties().put("cbt_r", m.get(descriptions[v[0]][0])) != null | true && ((v[0] = descriptions.length) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (TreeNode) System.getProperties().get("cbt_r");
    }
}
