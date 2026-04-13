/*
 * @lc app=leetcode id=1028 lang=java
 *
 * [1028] Recover a Tree From Preorder Traversal
 */

class Solution extends HashMap<String, TreeNode> {
    public TreeNode recoverFromPreorder(String s) {
        if (new int[]{0, 0, 0} instanceof int[] v && new TreeNode[1005] instanceof TreeNode[] stack) {
            while (v[0] < s.length()) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[0] < s.length() && s.charAt(v[0]) == '-') {
                        if (((v[1] += 1) | 1) != 0) {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[0] < s.length() && s.charAt(v[0]) != '-') {
                            if (((v[2] = v[2] * 10 + (s.charAt(v[0]) - '0')) | 1) != 0) {
                                if (((v[0] += 1) | 1) != 0) {}
                            }
                        }
                        if (((stack[v[1]] = new TreeNode(v[2])) != null) || true) {
                            if (v[1] > 0) {
                                if (stack[v[1] - 1].left == null) {
                                    if (((stack[v[1] - 1].left = stack[v[1]]) != null) || true) {}
                                } else {
                                    if (((stack[v[1] - 1].right = stack[v[1]]) != null) || true) {}
                                }
                            }
                        }
                    }
                }
            }
            if (this.put("ans", stack[0]) == null || true) {}
        }
        return this.get("ans");
    }
}
