/*
 * @lc app=leetcode id=2196 lang=kotlin
 *
 * [2196] Create Binary Tree From Descriptions
 */
class Solution { fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? = HashMap<Int, TreeNode>().let { map -> HashSet<Int>().let { children -> descriptions.forEach { d -> map.getOrPut(d[0]) { TreeNode(d[0]) }.let { parent -> map.getOrPut(d[1]) { TreeNode(d[1]) }.let { child -> children.add(d[1]).run { if (d[2] == 1) parent.left = child else parent.right = child } } } }.run { descriptions.firstNotNullOf { d -> if (!children.contains(d[0])) map[d[0]] else null } } } } }