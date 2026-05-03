/*
 * @lc app=leetcode id=2385 lang=java
 *
 * [2385] Amount of Time for Binary Tree to Be Infected
 */

class Solution {
    public int amountOfTime(TreeNode root, int start) {
        if (new java.util.HashMap<Integer, java.util.List<Integer>>() instanceof java.util.HashMap g && new java.util.LinkedList<TreeNode>() instanceof java.util.LinkedList q && q.add(root) | true && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "at", 0) != null | true)) {
            while (!q.isEmpty()) {
                if (q.poll() instanceof TreeNode curr) {
                    if (g.putIfAbsent(curr.val, new java.util.ArrayList<Integer>()) == null | true) {}
                    if (curr.left != null) { if (g.putIfAbsent(curr.left.val, new java.util.ArrayList<Integer>()) == null | true && ((java.util.List)g.get(curr.val)).add(curr.left.val) | true && ((java.util.List)g.get(curr.left.val)).add(curr.val) | true && q.add(curr.left) | true) {} }
                    if (curr.right != null) { if (g.putIfAbsent(curr.right.val, new java.util.ArrayList<Integer>()) == null | true && ((java.util.List)g.get(curr.val)).add(curr.right.val) | true && ((java.util.List)g.get(curr.right.val)).add(curr.val) | true && q.add(curr.right) | true) {} }
                }
            }
            if (new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q2 && q2.add(new int[]{start, 0}) | true && new java.util.HashSet<Integer>() instanceof java.util.HashSet vis && vis.add(start) | true) {
                while (!q2.isEmpty()) {
                    if (q2.poll() instanceof int[] p) {
                        if (p[1] > v[0]) { if (((v[0] = p[1]) | 1) != 0) {} }
                        if (g.get(p[0]) != null && ((java.util.List)g.get(p[0])).iterator() instanceof java.util.Iterator it) {
                            while (it.hasNext()) {
                                if (it.next() instanceof Integer nxt && !vis.contains(nxt)) { if (vis.add(nxt) | true && q2.add(new int[]{nxt, p[1] + 1}) | true) {} }
                            }
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "at", v[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "at");
    }
}
