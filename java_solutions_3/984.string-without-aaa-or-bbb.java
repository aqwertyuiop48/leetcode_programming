/*
 * @lc app=leetcode id=984 lang=java
 *
 * [984] String Without AAA or BBB
 */
class Solution{public String strWithout3a3b(int a, int b){return new StringBuilder() instanceof StringBuilder sb && new int[]{a, b} instanceof int[] c&& java.util.stream.Stream.of(0).peek(z->{while(c[0] + c[1] > 0 && (sb.length() >= 2 && sb.charAt(sb.length()-1)==sb.charAt(sb.length()-2)?(sb.charAt(sb.length()-1)=='a'?sb.append('b')!=null && c[1]-- > 0:sb.append('a')!=null && c[0]-- > 0):(c[0] >= c[1]?sb.append('a')!=null && c[0]-- >0:sb.append('b')!=null && c[1]-- >0))){}}).anyMatch(z->true)?sb.toString():"";}}
