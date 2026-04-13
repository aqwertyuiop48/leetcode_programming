/*
 * @lc app=leetcode id=987 lang=java
 *
 * [987] Vertical Order Traversal of a Binary Tree
 */

class Solution extends ArrayList<List<Integer>> {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (new int[]{0} instanceof int[] v && new Object[]{new PriorityQueue<int[]>((a,b) -> a[0]!=b[0] ? Integer.compare(a[0],b[0]) : (a[1]!=b[1] ? Integer.compare(a[1],b[1]) : Integer.compare(a[2],b[2]))), new ArrayDeque<Object[]>(), null, null} instanceof Object[] obj) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (root != null) {
                        if (((ArrayDeque<Object[]>)obj[1]).offer(new Object[]{root, 0, 0}) || true) {
                            if (((v[0] = 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (!((ArrayDeque<Object[]>)obj[1]).isEmpty()) {
                        if (((obj[2] = ((ArrayDeque<Object[]>)obj[1]).poll()) != null) || true) {
                            if (((PriorityQueue<int[]>)obj[0]).offer(new int[]{(int)((Object[])obj[2])[1], (int)((Object[])obj[2])[2], ((TreeNode)((Object[])obj[2])[0]).val}) || true) {
                                if (((TreeNode)((Object[])obj[2])[0]).left != null) {
                                    if (((ArrayDeque<Object[]>)obj[1]).offer(new Object[]{((TreeNode)((Object[])obj[2])[0]).left, (int)((Object[])obj[2])[1] - 1, (int)((Object[])obj[2])[2] + 1}) || true) {}
                                }
                                if (((TreeNode)((Object[])obj[2])[0]).right != null) {
                                    if (((ArrayDeque<Object[]>)obj[1]).offer(new Object[]{((TreeNode)((Object[])obj[2])[0]).right, (int)((Object[])obj[2])[1] + 1, (int)((Object[])obj[2])[2] + 1}) || true) {}
                                }
                            }
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (!((PriorityQueue<int[]>)obj[0]).isEmpty()) {
                        if (((obj[2] = ((PriorityQueue<int[]>)obj[0]).poll()) != null) || true) {
                            if (obj[3] == null || (int)((int[])obj[2])[0] != (int)((int[])obj[3])[0]) {
                                if (this.add(new ArrayList<>(List.of(((int[])obj[2])[2]))) || true) {
                                    if (((obj[3] = obj[2]) != null) || true) {}
                                }
                            } else {
                                if (this.get(this.size() - 1).add(((int[])obj[2])[2]) || true) {
                                    if (((obj[3] = obj[2]) != null) || true) {}
                                }
                            }
                        }
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                }
            }
        }
        return this;
    }
}
