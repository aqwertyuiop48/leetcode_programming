/*
 * @lc app=leetcode id=501 lang=kotlin
 *
 * [501] Find Mode in Binary Search Tree
 */

class Solution(var max: Int = 0, val valueFreqMap: HashMap<Int, Int> = HashMap(), val result: ArrayList<Int> = ArrayList()) { fun findMode(root: TreeNode?) = root?.let { max.let { max = 0 }.run { valueFreqMap.clear() }.run { result.clear() }.run { calcF(it) }.run { result.toIntArray() } } ?: intArrayOf() fun calcF(node: TreeNode): Unit = node.`val`.let { value -> valueFreqMap.getOrDefault(value, 0).plus(1).also { newFreq -> valueFreqMap[value] = newFreq }.let { newFreq -> when { newFreq > max -> {max.let { max = newFreq }.run { result.clear() }.run { result.add(value) }} newFreq == max -> {result.add(value)} else -> Unit } }.run { when { node.left != null && node.right != null -> {when { node.right.`val` == value -> {calcF(node.right).run { calcF(node.left) }} else -> calcF(node.left).run { calcF(node.right) } }} node.right != null -> {calcF(node.right)} node.left != null -> {calcF(node.left)} else -> Unit } } }}

