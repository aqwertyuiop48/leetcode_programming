/*
 * @lc app=leetcode id=3319 lang=java
 *
 * [3319] K-th Largest Perfect Subtree Size in Binary Tree
 */

class Solution {
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        if (new java.util.ArrayList<TreeNode>() instanceof java.util.ArrayList list && new java.util.HashMap<TreeNode, int[]>() instanceof java.util.HashMap map && new java.util.PriorityQueue<Integer>() instanceof java.util.PriorityQueue pq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "klps", -1) != null | true)) {
            if (list.add(root) | true && ((v[0] = 0) | 1) != 0) {
                while (v[0] < list.size()) {
                    if (list.get(v[0]) instanceof TreeNode curr) {
                        if (curr.left != null) { if (list.add(curr.left) | true) {} }
                        if (curr.right != null) { if (list.add(curr.right) | true) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = list.size() - 1) | 1) != 0) {
                    while (v[0] >= 0) {
                        if (list.get(v[0]) instanceof TreeNode curr && ((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            if (curr.left == null && curr.right == null) {
                                if (((v[2] = 1) | 1) != 0 && ((v[3] = 1) | 1) != 0) {}
                            } else if (((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                                if (curr.left != null && map.get(curr.left) instanceof int[] l) { if (((v[4] = l[0]) | 1) != 0 && ((v[5] = l[1]) | 1) != 0) {} } else if (curr.left != null) { if (((v[4] = 0) | 1) != 0) {} } else { if (((v[4] = 1) | 1) != 0) {} }
                                if (curr.right != null && map.get(curr.right) instanceof int[] r) { if (((v[6] = r[0]) | 1) != 0 && ((v[7] = r[1]) | 1) != 0) {} } else if (curr.right != null) { if (((v[6] = 0) | 1) != 0) {} } else { if (((v[6] = 1) | 1) != 0) {} }
                                
                                if (v[4] == 1 && v[6] == 1 && v[5] == v[7]) { if (((v[2] = v[5] + 1) | 1) != 0 && ((v[3] = (1 << v[2]) - 1) | 1) != 0) {} } 
                                else { if (((v[1] = 0) | 1) != 0) {} }
                            }
                            if (map.put(curr, new int[]{v[1], v[2], v[3]}) != null | true) {
                                if (v[1] == 1 && pq.add(v[3]) | true) {
                                    if (pq.size() > k) { if (pq.poll() != null | true) {} }
                                }
                            }
                        }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                }
                if (pq.size() == k) { if (System.getProperties().put(Thread.currentThread().getId() + "klps", pq.peek()) != null | true) {} }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "klps");
    }
}
