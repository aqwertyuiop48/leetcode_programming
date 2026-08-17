/*
 * @lc app=leetcode id=2096 lang=kotlin
 *
 * [2096] Step-By-Step Directions From a Binary Tree Node to Another
 */

class Solution {
    fun getDirections(root: TreeNode?, startValue: Int, destValue: Int): String = mutableMapOf<Int, Pair<Int, Char>>().let { par -> mutableListOf(root).apply { while (isNotEmpty()) removeAt(0)?.let { n -> listOfNotNull(n.left?.let { it to 'L' }, n.right?.let { it to 'R' }).forEach { (child, dir) -> par[child.val] = (n.val to dir).also { add(child) } } } }.let { { v: Int -> generateSequence(v) { par[it]?.first }.mapNotNull { par[it]?.second }.joinToString("").reversed() }.let { getPath -> getPath(startValue).let { sP -> getPath(destValue).let { dP -> sP.zip(dP).takeWhile { it.first == it.second }.size.let { com -> "U".repeat(sP.length - com) + dP.substring(com) } } } } } }
}