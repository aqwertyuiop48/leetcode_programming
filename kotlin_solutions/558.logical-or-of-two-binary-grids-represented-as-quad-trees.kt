/*
 * @lc app=leetcode id=558 lang=kotlin
 *
 * [558] Logical OR of Two Binary Grids Represented as Quad-Trees
 */

class Solution(val q1: Node? = null, val q2: Node? = null) { fun intersect(n1: Node?, n2: Node?): Node? = when { n1 == null ->{ n2 } n2 == null ->{ n1 } n1.isLeaf -> {if (n1.`val`) n1 else n2 } n2.isLeaf -> {if (n2.`val`) n2 else n1 } else -> Node(false, false).apply { topLeft = intersect(n1.topLeft, n2.topLeft).also { topRight = intersect(n1.topRight, n2.topRight) }.also { bottomLeft = intersect(n1.bottomLeft, n2.bottomLeft) }.also { bottomRight = intersect(n1.bottomRight, n2.bottomRight) } }.let { if (it.topLeft?.isLeaf == true && it.topRight?.isLeaf == true && it.bottomLeft?.isLeaf == true && it.bottomRight?.isLeaf == true && it.topLeft?.`val` == it.topRight?.`val` && it.topRight?.`val` == it.bottomLeft?.`val` && it.bottomLeft?.`val` == it.bottomRight?.`val`) Node(it.topLeft?.`val` ?: false, true) else it } } }

