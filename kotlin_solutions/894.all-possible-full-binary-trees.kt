/*
 * @lc app=leetcode id=894 lang=kotlin
 *
 * [894] All Possible Full Binary Trees
 */

class Solution { fun allPossibleFBT(n: Int) = { memo: MutableMap<Int, List<TreeNode?>> -> DeepRecursiveFunction<Int, List<TreeNode?>> { num -> if (num % 2 == 0) emptyList() else if (num == 1) listOf(TreeNode(0)) else memo.getOrPut(num) { (1 until num step 2).flatMap { leftSize -> callRecursive(leftSize).flatMap { l -> callRecursive(num - 1 - leftSize).map { r -> TreeNode(0).apply { left = l.also{right = r }} } } } } }(n) }(mutableMapOf()) }

