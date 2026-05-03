/*
 * @lc app=leetcode id=2471 lang=java
 *
 * [2471] Minimum Number of Operations to Sort a Binary Tree by Level
 */

class Solution {
    public int minimumOperations(TreeNode root) {
        if (new Object[]{new java.util.LinkedList<TreeNode>()} instanceof Object[] o && o[0] instanceof java.util.Queue q && q.offer(root) | true && new int[10] instanceof int[] v && (System.getProperties().put("mno", 0) != null | true)) {
            while (!q.isEmpty()) {
                if (((v[0] = q.size()) | 1) != 0 && new int[v[0]] instanceof int[] arr && new int[v[0]] instanceof int[] srt && ((v[1] = 0) | 1) != 0) {
                    while (v[1] < v[0]) {
                        if (new Object[]{q.poll()} instanceof Object[] p && p[0] instanceof TreeNode n) {
                            if (((arr[v[1]] = n.val) | 1) != 0 && ((srt[v[1]] = n.val) | 1) != 0) {}
                            if (n.left != null && q.offer(n.left) | true) {}
                            if (n.right != null && q.offer(n.right) | true) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (new Object[]{java.util.Arrays.stream(srt).sorted().toArray()} instanceof Object[] so && so[0] instanceof int[] s && new java.util.HashMap<Integer, Integer>() instanceof java.util.Map m && new int[v[0]] instanceof int[] vis && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < v[0]) { if (m.put(s[v[1]], v[1]) == null | true && ((v[1] += 1) | 1) != 0) {} }
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < v[0]) {
                                if (vis[v[1]] == 0 && ((v[2] = v[1]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                    while (vis[v[2]] == 0) { if (((vis[v[2]] = 1) | 1) != 0 && ((v[2] = (int)m.get(arr[v[2]])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {} }
                                    if (v[3] > 0 && System.getProperties().put("mno", (int)System.getProperties().get("mno") + v[3] - 1) != null | true) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mno");
    }
}
