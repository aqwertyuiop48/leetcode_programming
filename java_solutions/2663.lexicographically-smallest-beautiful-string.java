/*
 * @lc app=leetcode id=2663 lang=java
 *
 * [2663] Lexicographically Smallest Beautiful String
 */

class Solution { public String smallestBeautifulString(String s, int k) { return ((Function<int[], Function<int[], String>>) ch -> ptr -> !IntStream.iterate(0, dummy -> ptr[0] >= 0, dummy -> dummy).anyMatch(dummy -> ++ch[ptr[0]] == 'a' + k ? (ptr[0]-- * 0 == 1) : ((ptr[0] - 1 < 0 || ch[ptr[0] - 1] != ch[ptr[0]]) && (ptr[0] - 2 < 0 || ch[ptr[0] - 2] != ch[ptr[0]]))) ? "" : IntStream.range(ptr[0] + 1, ch.length).map(j -> ch[j] = IntStream.of('a', 'b', 'c').filter(c -> (j - 1 < 0 || ch[j - 1] != c) && (j - 2 < 0 || ch[j - 2] != c)).findFirst().getAsInt()).sum() * 0 == 0 ? IntStream.of(ch).mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining()) : "").apply(s.chars().toArray()).apply(new int[]{s.length() - 1}); } }
