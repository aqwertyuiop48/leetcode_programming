/*
 * @lc app=leetcode id=101 lang=kotlin
 *
 * [101] Symmetric Tree
 */

class Solution{fun isSymmetric(root:TreeNode?):Boolean=root?.let{DeepRecursiveFunction<Pair<TreeNode?,TreeNode?>,Boolean>{(l,r)->when{l==null&&r==null->{true}l==null||r==null->{false}l.`val`!=r.`val`->{false}else->callRecursive(l.left to r.right)&&callRecursive(l.right to r.left)}}.invoke(it.left to it.right)}?:true}

