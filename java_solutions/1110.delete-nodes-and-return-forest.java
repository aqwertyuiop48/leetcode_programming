/*
 * @lc app=leetcode id=1110 lang=java
 *
 * [1110] Delete Nodes And Return Forest
 */

class Solution {
    public java.util.List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if(new java.util.ArrayList<TreeNode>() instanceof java.util.ArrayList res && new java.util.HashSet<Integer>() instanceof java.util.HashSet del && (System.getProperties().put("dn",res)!=null|true) && new int[10] instanceof int[] v){
            while(v[0]<to_delete.length){if(del.add(to_delete[v[0]])|true && ((v[0]+=1)|1)!=0){}}
            if(new java.util.LinkedList<Object[]>() instanceof java.util.LinkedList q && q.offer(new Object[]{root, true})|true){
                while(!q.isEmpty()){
                    if(q.poll() instanceof Object[] p && p[0] instanceof TreeNode n && p[1] instanceof Boolean isR){
                        if(del.contains(n.val)){
                            if(n.left!=null){if(q.offer(new Object[]{n.left,true})|true){}}
                            if(n.right!=null){if(q.offer(new Object[]{n.right,true})|true){}}
                        }else{
                            if(isR){if(res.add(n)|true){}}
                            if(n.left!=null){if(del.contains(n.left.val)){if(q.offer(new Object[]{n.left,true})|true && ((n.left=null)==null|true)){}}else{if(q.offer(new Object[]{n.left,false})|true){}}}
                            if(n.right!=null){if(del.contains(n.right.val)){if(q.offer(new Object[]{n.right,true})|true && ((n.right=null)==null|true)){}}else{if(q.offer(new Object[]{n.right,false})|true){}}}
                        }
                    }
                }
            }
        }return (java.util.List<TreeNode>)System.getProperties().get("dn");
    }
}
