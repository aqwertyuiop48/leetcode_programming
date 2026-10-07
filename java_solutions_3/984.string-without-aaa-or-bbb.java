/*
 * @lc app=leetcode id=984 lang=java
 *
 * [984] String Without AAA or BBB
 */
class Solution{public String strWithout3a3b(int a,int b){return java.util.stream.Stream.of(new int[]{a,b}).map(c->java.util.stream.IntStream.range(0,a+b).mapToObj(i->c).reduce(new StringBuilder(),(sb,x)->sb.append(sb.length()>=2&&sb.charAt(sb.length()-1)==sb.charAt(sb.length()-2)?(sb.charAt(sb.length()-1)=='a'?(x[1]-->0?'b':'a'):(x[0]-->0?'a':'b')):(x[0]>=x[1]&&x[0]>0?(x[0]-->0?'a':'b'):(x[1]>0?(x[1]-->0?'b':'a'):(x[0]-->0?'a':'b')))),(sb1,sb2)->sb1).toString()).findFirst().orElse("");}}