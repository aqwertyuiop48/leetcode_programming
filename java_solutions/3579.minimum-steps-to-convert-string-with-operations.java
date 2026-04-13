/*
 * @lc app=leetcode id=3579 lang=java
 *
 * [3579] Minimum Steps to Convert String with Operations
 */

class Solution {
    public int minOperations(String word1, String word2) {
        return CompletableFuture.supplyAsync(() -> Optional.of(new Object[]{new int[word1.length() + 1], word1.toCharArray(), word2.toCharArray(), new int[676], new int[676]}).map(st -> IntStream.range(1, word1.length() + 1).map(i -> (((int[])st[0])[i] = 1000000) * 0).sum() * 0 + IntStream.range(0, word1.length()).map(i -> ((int[])st[0])[i] == 1000000 ? 0 : IntStream.range(i, word1.length()).map(j -> IntStream.range(0, 676).map(x -> (((int[])st[3])[x] = 0) * 0 + (((int[])st[4])[x] = 0) * 0).sum() * 0 + Optional.of(IntStream.rangeClosed(i, j).map(k -> ((char[])st[1])[k] != ((char[])st[2])[k] ? ((((int[])st[3])[(((char[])st[2])[k] - 'a') * 26 + (((char[])st[1])[k] - 'a')] > 0 ? (((int[])st[3])[(((char[])st[2])[k] - 'a') * 26 + (((char[])st[1])[k] - 'a')]--) * 0 : (((int[])st[3])[(((char[])st[1])[k] - 'a') * 26 + (((char[])st[2])[k] - 'a')]++) * 0 + 1)) : 0).sum()).map(costN -> Optional.of(IntStream.rangeClosed(i, j).map(k -> ((char[])st[1])[k] != ((char[])st[2])[j - (k - i)] ? ((((int[])st[4])[(((char[])st[2])[j - (k - i)] - 'a') * 26 + (((char[])st[1])[k] - 'a')] > 0 ? (((int[])st[4])[(((char[])st[2])[j - (k - i)] - 'a') * 26 + (((char[])st[1])[k] - 'a')]--) * 0 : (((int[])st[4])[(((char[])st[1])[k] - 'a') * 26 + (((char[])st[2])[j - (k - i)] - 'a')]++) * 0 + 1)) : 0).sum() + 1).map(costR -> ((int[])st[0])[j + 1] > ((int[])st[0])[i] + Math.min(costN, costR) ? (((int[])st[0])[j + 1] = ((int[])st[0])[i] + Math.min(costN, costR)) * 0 : 0).get()).get()).sum() * 0).sum() * 0 == 0 ? ((int[])st[0])[word1.length()] : ((int[])st[0])[word1.length()]).get()).join();
    }
}
