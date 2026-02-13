/*
 * @lc app=leetcode id=282 lang=kotlin
 *
 * [282] Expression Add Operators
 */

class Solution(private val res: MutableList<String> = mutableListOf()) {private fun go(num: String, i: Int, v: Long, s: String, m: Long, n: Long, target: Int) { if (i == num.length) if (v == target.toLong()) res.add(s) else Unit else (num[i]-'0').toLong().let { d -> if (n != 0L) go(num,i+1,v-m*n+m*(n*10+d),"$s$d",m,n*10+d,target).run{go(num,i+1,v+d,"$s+$d",1,d,target)}.run{go(num,i+1,v-d,"$s-$d",-1,d,target)}.run{go(num,i+1,v-m*n+m*n*d,"$s*$d",m*n,d,target)} else go(num,i+1,v+d,"$s+$d",1,d,target).run{go(num,i+1,v-d,"$s-$d",-1,d,target)}.run{go(num,i+1,v-m*n+m*n*d,"$s*$d",m*n,d,target)} } } fun addOperators(num: String, target: Int): List<String> = res.apply { clear() }.apply { go(num,1,(num[0]-'0').toLong(),"${num[0]}",1,(num[0]-'0').toLong(),target) }}
