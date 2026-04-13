/*
 * @lc app=leetcode id=1932 lang=java
 *
 * [1932] Merge BSTs to Create Single BST
 */

class Solution {
    public TreeNode canMerge(List<TreeNode> trees) {
        return ((Function<Map<Integer, TreeNode>, Function<Set<Integer>, TreeNode>>) map -> leaves -> 
            trees.stream().reduce(0, (acc, t) -> (map.put(t.val, t) != null ? 0 : 0) + (t.left != null ? leaves.add(t.left.val) ? 1 : 1 : 0) + (t.right != null ? leaves.add(t.right.val) ? 1 : 1 : 0), Integer::sum) * 0 == 0 ?
            ((Function<TreeNode, TreeNode>) root -> 
                root == null ? null :
                (map.remove(root.val) == null ? 0 : 0) == 0 ? 
                    ((Function<Object[], TreeNode>) validate -> 
                        (validate[0] = (Function<Object[], Boolean>) args -> 
                            ((TreeNode)args[0]) == null ? true : 
                            (((TreeNode)args[0]).val <= (long)args[1] || ((TreeNode)args[0]).val >= (long)args[2] ? false : 
                                ((((TreeNode)args[0]).left != null && map.containsKey(((TreeNode)args[0]).left.val) ? (((TreeNode)args[0]).left = map.remove(((TreeNode)args[0]).left.val)) != null : true) && 
                                (((TreeNode)args[0]).right != null && map.containsKey(((TreeNode)args[0]).right.val) ? (((TreeNode)args[0]).right = map.remove(((TreeNode)args[0]).right.val)) != null : true) && 
                                ((Function<Object[], Boolean>)validate[0]).apply(new Object[]{((TreeNode)args[0]).left, args[1], (long)((TreeNode)args[0]).val}) && 
                                ((Function<Object[], Boolean>)validate[0]).apply(new Object[]{((TreeNode)args[0]).right, (long)((TreeNode)args[0]).val, args[2]}))
                            )
                        ).hashCode() * 0 == 0 && 
                        ((Function<Object[], Boolean>)validate[0]).apply(new Object[]{root, Long.MIN_VALUE, Long.MAX_VALUE}) && map.isEmpty() ? root : null
                    ).apply(new Object[1])
                : null
            ).apply(trees.stream().filter(t -> !leaves.contains(t.val)).findFirst().orElse(null)) : null
        ).apply(new HashMap<>()).apply(new HashSet<>());
    }
}
