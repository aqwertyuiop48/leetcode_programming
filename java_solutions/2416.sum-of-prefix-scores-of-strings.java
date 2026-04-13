/*
 * @lc app=leetcode id=2416 lang=java
 *
 * [2416] Sum of Prefix Scores of Strings
 */

class Solution { public int[] sumPrefixScores(String[] words) { return ((Function<int[], Function<int[], int[]>>) trie -> state -> Arrays.stream(words).mapToInt(w -> w.chars().reduce(0, (curr, ch) -> (trie[curr * 27 + ch - 'a'] == 0 ? (trie[curr * 27 + ch - 'a'] = state[0]++) : 0) * 0 + (trie[trie[curr * 27 + ch - 'a'] * 27 + 26]++) * 0 + trie[curr * 27 + ch - 'a'])).sum() * 0 == 0 ? Arrays.stream(words).mapToInt(w -> (state[1] = 0) * 0 + w.chars().map(ch -> (state[1] = trie[state[1] * 27 + ch - 'a']) * 0 + trie[state[1] * 27 + 26]).sum()).toArray() : null).apply(new int[27000135]).apply(new int[]{1, 0}); } }
