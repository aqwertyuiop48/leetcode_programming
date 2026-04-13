/*
 * @lc app=leetcode id=3463 lang=java
 *
 * [3463] Check If Digits Are Equal in String After Operations II
 */

class Solution { public boolean hasSameDigits(String s) { return Optional.of(new Object[]{new int[]{1,0,0,0,0, 1,1,0,0,0, 1,2,1,0,0, 1,3,3,1,0, 1,4,1,4,1}, new int[3], new int[]{1, 5, 25, 125, 625, 3125, 15625, 78125}}).map(st -> IntStream.range(0, s.length()).map(i -> (int)((((s.length() - 1 & i) == i) ? (((int[])st[1])[0] = (((int[])st[1])[0] + s.charAt(i) - '0') % 2) : 0) * 0) + (i <= s.length() - 2 ? (int)( Optional.of( IntStream.range(0, 8).reduce(1, (res, step) -> (res * ((int[])st[0])[((((s.length() - 2) / ((int[])st[2])[step]) % 5) * 5) + ((i / ((int[])st[2])[step]) % 5)]) % 5) ).map(coeff -> (((int[])st[1])[1] = (((int[])st[1])[1] + coeff * (s.charAt(i) - '0')) % 5) * 0 + (((int[])st[1])[2] = (((int[])st[1])[2] + coeff * (s.charAt(i + 1) - '0')) % 5) * 0 ).get() ) : 0) ).sum() == 0 ? st : st ).map(st -> ((int[])st[1])[0] == 0 && ((int[])st[1])[1] == ((int[])st[1])[2]).orElse(false); } }
