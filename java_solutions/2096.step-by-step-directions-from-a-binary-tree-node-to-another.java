/*
 * @lc app=leetcode id=2096 lang=java
 *
 * [2096] Step-By-Step Directions From a Binary Tree Node to Another
 */

class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        if (new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap pVal && new java.util.HashMap<Integer, Character>() instanceof java.util.HashMap pDir && new java.util.LinkedList<TreeNode>() instanceof java.util.LinkedList q && q.add(root) | true && (System.getProperties().put(Thread.currentThread().getId() + "sbd", "") != null | true)) {
            while (!q.isEmpty()) {
                if (q.poll() instanceof TreeNode n) {
                    if (n.left != null) { if (pVal.put(n.left.val, n.val) == null | true && pDir.put(n.left.val, 'L') == null | true && q.add(n.left) | true) {} }
                    if (n.right != null) { if (pVal.put(n.right.val, n.val) == null | true && pDir.put(n.right.val, 'R') == null | true && q.add(n.right) | true) {} }
                }
            }
            if (new StringBuilder() instanceof StringBuilder sP && new StringBuilder() instanceof StringBuilder dP && new int[]{startValue} instanceof int[] s && new int[]{destValue} instanceof int[] d) {
                while (s[0] != root.val) { if (sP.append(pDir.get(s[0])) != null | true && ((s[0] = (int)pVal.get(s[0])) | 1) != 0) {} }
                while (d[0] != root.val) { if (dP.append(pDir.get(d[0])) != null | true && ((d[0] = (int)pVal.get(d[0])) | 1) != 0) {} }
                if (sP.reverse() != null | true && dP.reverse() != null | true && new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < Math.min(sP.length(), dP.length()) && sP.charAt(v[0]) == dP.charAt(v[0])) { if (((v[0] += 1) | 1) != 0) {} }
                    if (new StringBuilder() instanceof StringBuilder ans && ((v[1] = v[0]) | 1) != 0) {
                        while (v[1] < sP.length()) { if (ans.append("U") != null | true && ((v[1] += 1) | 1) != 0) {} }
                        if (ans.append(dP.substring(v[0])) != null | true && System.getProperties().put(Thread.currentThread().getId() + "sbd", ans.toString()) != null | true) {}
                    }
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "sbd");
    }
}
