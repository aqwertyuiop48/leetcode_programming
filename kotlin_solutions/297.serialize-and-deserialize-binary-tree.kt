/*
 * @lc app=leetcode id=297 lang=kotlin
 *
 * [297] Serialize and Deserialize Binary Tree
 */

import java.util.* class Codec { fun serialize(root: TreeNode?) = mutableListOf<String>().also { list -> DeepRecursiveFunction<TreeNode?, Unit> { n -> n?.run { list.add("$`val`").also{if (left == null) list.add("null") else callRecursive(left)}.also{if (right == null) list.add("null") else callRecursive(right)} } }.invoke(root) }.joinToString(",") fun deserialize(data: String) = if (data.isEmpty()) null else data.split(",").iterator().let { iter -> DeepRecursiveFunction<Unit, TreeNode?> { if (iter.hasNext()) iter.next().toIntOrNull()?.let { TreeNode(it).apply { left = callRecursive(Unit).also{right = callRecursive(Unit)} } } else null }.invoke(Unit) } }

