/*
 * @lc app=leetcode id=508 lang=kotlin
 *
 * [508] Most Frequent Subtree Sum
 */

class Solution { fun findFrequentTreeSum(root: TreeNode?) = HashMap<Int, Int>().let { m -> DeepRecursiveFunction<TreeNode?,Int>{t->t?.let{(callRecursive(it.left)+callRecursive(it.right)+it.`val`).also{s->m[s]=m.getOrDefault(s,0)+1}}?:0} .let { f -> m.also { f(root) }.values.maxOrNull()?.let { max -> m.filterValues { it == max }.keys.toIntArray() } ?: intArrayOf() } } }

