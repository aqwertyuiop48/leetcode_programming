/*
 * @lc app=leetcode id=794 lang=kotlin
 *
 * [794] Valid Tic-Tac-Toe State
 */

class Solution{fun validTicTacToe(b:Array<String>)=b.joinToString("").let{s->(s.count{it=='X'}to s.count{it=='O'}).let{(x,o)->x in o..o+1&&"012 345 678 036 147 258 048 246".split(' ').mapNotNull{l->l.map{s[it-'0']}.distinct().singleOrNull()?.takeIf{it in "XO"}}.toSet().run{size<2&&(isEmpty()||('X' in this&&x==o+1)||('O' in this&&x==o))}}}}