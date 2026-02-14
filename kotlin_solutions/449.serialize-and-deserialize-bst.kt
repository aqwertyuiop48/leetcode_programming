/*
 * @lc app=leetcode id=449 lang=kotlin
 *
 * [449] Serialize and Deserialize BST
 */

class Codec { fun serialize(root: TreeNode?): String = root?.let { "${it.`val`} ${serialize(it.left)}${serialize(it.right)}" } ?: "" fun deserialize(data: String): TreeNode? = data.split(" ").filter { it.isNotEmpty() }.map { it.toInt() } .fold(null as TreeNode?) { root, v -> root.insert(v) } fun TreeNode?.insert(v: Int): TreeNode = this?.apply { if (v < `val`) left = left.insert(v) else right = right.insert(v) } ?: TreeNode(v) }

