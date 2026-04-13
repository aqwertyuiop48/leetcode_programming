/*
 * @lc app=leetcode id=3045 lang=java
 *
 * [3045] Count Prefix and Suffix Pairs II
 */

class Solution { public long countPrefixSuffixPairs(String[] words) { return ((Function<Object[], Long>) root -> Arrays.stream(words).mapToLong(word -> ((Function<Object[][], Long>) box -> IntStream.range(0, word.length()).mapToLong(i -> ((IntUnaryOperator) dummy -> (box[0] = (Object[]) ((Map<Integer, Object[]>) box[0][0]).computeIfAbsent(word.charAt(i) * 128 + word.charAt(word.length() - i - 1), k -> new Object[]{new HashMap<Integer, Object[]>(), new int[1]})) != null ? ((int[]) box[0][1])[0] : 0).applyAsInt(0)).sum() + (((int[]) box[0][1])[0]++) * 0L).apply(new Object[][]{root})).sum()).apply(new Object[]{new HashMap<Integer, Object[]>(), new int[1]}); } }
