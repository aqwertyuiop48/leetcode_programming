/*
 * @lc app=leetcode id=3474 lang=java
 *
 * [3474] Lexicographically Smallest Generated String
 */

class Solution {
    public String generateString(String S, String t) {
        return Optional.of(new Object[]{new char[S.length() + t.length() - 1], new boolean[S.length() + t.length() - 1], new int[]{1}}).map((Object[] st) -> IntStream.range(0, ((char[])st[0]).length).map(i -> (((char[])st[0])[i] = '?') * 0).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(0, S.length()).filter(i -> S.charAt(i) == 'T').map(i -> IntStream.range(0, t.length()).map(j -> (((char[])st[0])[i + j] != '?' && ((char[])st[0])[i + j] != t.charAt(j)) ? (((int[])st[2])[0] = 0) * 0 : ((((char[])st[0])[i + j] = t.charAt(j)) * 0)).sum()).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(0, ((char[])st[0]).length).map(i -> ((char[])st[0])[i] == '?' ? ((((boolean[])st[1])[i] = true) ? 0 : 0) + ((((char[])st[0])[i] = 'a') * 0) : 0).sum() == 0 ? st : st).map((Object[] st) -> IntStream.range(0, S.length()).filter(i -> S.charAt(i) == 'F').filter(i -> IntStream.range(0, t.length()).allMatch(j -> ((char[])st[0])[i + j] == t.charAt(j))).map(i -> Optional.of(IntStream.range(0, t.length()).map(inv -> t.length() - 1 - inv).map(j -> i + j).filter(j -> ((boolean[])st[1])[j]).findFirst().orElse(-1)).map(target -> target != -1 ? ((((char[])st[0])[target] = 'b') * 0) : ((((int[])st[2])[0] = 0) * 0)).get()).sum() == 0 ? st : st).map((Object[] st) -> ((int[])st[2])[0] == 1 ? new String((char[])st[0]) : "").get();
    }
}
