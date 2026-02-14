/*
 * @lc app=leetcode id=652 lang=kotlin
 *
 * [652] Find Duplicate Subtrees
 */

import java.security.MessageDigest class Solution { private fun md5Hash(s: String): String = java.math.BigInteger(1, MessageDigest.getInstance("MD5").digest(s.toByteArray())).toString(16).padStart(32, '0') fun merkleHash(root: TreeNode?, subtreeHashes: MutableMap<String, MutableList<TreeNode>>): String = if (root == null) "$" else md5Hash(merkleHash(root.left, subtreeHashes) + merkleHash(root.right, subtreeHashes) + md5Hash(root.`val`.toString())).also { subtreeHashes.getOrPut(it) { mutableListOf() }.add(root) } fun findDuplicateSubtrees(root: TreeNode?): List<TreeNode?> = mutableMapOf<String, MutableList<TreeNode>>().also { merkleHash(root, it) }.filter { it.value.size > 1 }.values.map { it.first() } }

