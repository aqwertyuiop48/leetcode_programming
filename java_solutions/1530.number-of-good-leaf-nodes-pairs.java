/*
 * @lc app=leetcode id=1530 lang=java
 *
 * [1530] Number of Good Leaf Nodes Pairs
 */

class Solution {
    public int countPairs(TreeNode root, int distance) {
        if (new java.util.HashMap<TreeNode, TreeNode>() instanceof java.util.HashMap p && new java.util.ArrayList<TreeNode>() instanceof java.util.ArrayList l && new java.util.LinkedList<TreeNode>() instanceof java.util.LinkedList q && (System.getProperties().put("cp", 0) != null | true) && q.add(root)|true && new int[10] instanceof int[] v) {
            while(!q.isEmpty()) {
                if (q.poll() instanceof TreeNode n) {
                    if (n.left!=null) { if (p.put(n.left, n)==null|true && q.add(n.left)|true){} }
                    if (n.right!=null) { if (p.put(n.right, n)==null|true && q.add(n.right)|true){} }
                    if (n.left==null && n.right==null) { if (l.add(n)|true){} }
                }
            }
            if (((v[0]=0)|1)!=0) {
                while(v[0]<l.size()) {
                    if (new java.util.LinkedList<TreeNode>() instanceof java.util.LinkedList q2 && new java.util.HashSet<TreeNode>() instanceof java.util.HashSet vis && q2.add(l.get(v[0]))|true && vis.add(l.get(v[0]))|true && ((v[1]=0)|1)!=0) {
                        while(!q2.isEmpty() && v[1]<=distance) {
                            if (((v[2]=q2.size())|1)!=0) {
                                while(v[2]>0) {
                                    if (q2.poll() instanceof TreeNode curr) {
                                        if (curr!=l.get(v[0]) && curr.left==null && curr.right==null) { if (((v[3]+=1)|1)!=0){} }
                                        if (curr.left!=null && vis.add(curr.left)) { if (q2.add(curr.left)|true){} }
                                        if (curr.right!=null && vis.add(curr.right)) { if (q2.add(curr.right)|true){} }
                                        if (p.containsKey(curr) && vis.add(p.get(curr))) { if (q2.add(p.get(curr))|true){} }
                                    }
                                    if (((v[2]-=1)|1)!=0){}
                                }
                            }
                            if (((v[1]+=1)|1)!=0){}
                        }
                    }
                    if (((v[0]+=1)|1)!=0){}
                }
            }
            if (System.getProperties().put("cp", v[3]/2)!=null|true){}
        }
        return (int) System.getProperties().get("cp");
    }
}
