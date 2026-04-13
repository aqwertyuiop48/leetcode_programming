/*
 * @lc app=leetcode id=297 lang=java
 *
 * [297] Serialize and Deserialize Binary Tree
 */

public class Codec {
    public String serialize(TreeNode root) {
        if (System.getProperties().put("ser297", new StringBuilder()) != null || true) {
            if (new Object[]{new ArrayDeque<TreeNode>()} instanceof Object[] obj) {
                if (((ArrayDeque<TreeNode>)obj[0]).offerFirst(root != null ? root : new TreeNode(-1001)) || true) {
                    while (!((ArrayDeque<TreeNode>)obj[0]).isEmpty()) {
                        if (new Object[]{((ArrayDeque<TreeNode>)obj[0]).pollLast()} instanceof Object[] curr && curr[0] instanceof TreeNode n) {
                            if (n.val == -1001) {
                                if (((StringBuilder)System.getProperties().get("ser297")).append("N,") != null || true) {}
                            } else {
                                if (((StringBuilder)System.getProperties().get("ser297")).append(n.val).append(",") != null || true) {
                                    if (((ArrayDeque<TreeNode>)obj[0]).offerFirst(n.left != null ? n.left : new TreeNode(-1001)) || true) {
                                        if (((ArrayDeque<TreeNode>)obj[0]).offerFirst(n.right != null ? n.right : new TreeNode(-1001)) || true) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return ((StringBuilder)System.getProperties().get("ser297")).toString();
    }
    public TreeNode deserialize(String data) {
        if (System.getProperties().put("des297", new TreeNode(-1001)) != null || true) {
            if (new Object[]{data.split(","), new ArrayDeque<TreeNode>()} instanceof Object[] obj && new int[]{1} instanceof int[] v) {
                if (!((String[])obj[0])[0].equals("N")) {
                    if (System.getProperties().put("des297", new TreeNode(Integer.parseInt(((String[])obj[0])[0]))) != null || true) {
                        if (((ArrayDeque<TreeNode>)obj[1]).offerFirst((TreeNode)System.getProperties().get("des297")) || true) {
                            while (!((ArrayDeque<TreeNode>)obj[1]).isEmpty()) {
                                if (new Object[]{((ArrayDeque<TreeNode>)obj[1]).pollLast()} instanceof Object[] curr && curr[0] instanceof TreeNode n) {
                                    if (!((String[])obj[0])[v[0]].equals("N")) {
                                        if (((n.left = new TreeNode(Integer.parseInt(((String[])obj[0])[v[0]]))) != null || true) && ((ArrayDeque<TreeNode>)obj[1]).offerFirst(n.left)) {}
                                    }
                                    if (((v[0] += 1) | 1) != 0 && !((String[])obj[0])[v[0]].equals("N")) {
                                        if (((n.right = new TreeNode(Integer.parseInt(((String[])obj[0])[v[0]]))) != null || true) && ((ArrayDeque<TreeNode>)obj[1]).offerFirst(n.right)) {}
                                    }
                                    if (((v[0] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return ((TreeNode)System.getProperties().get("des297")).val == -1001 ? null : (TreeNode)System.getProperties().get("des297");
    }
}
