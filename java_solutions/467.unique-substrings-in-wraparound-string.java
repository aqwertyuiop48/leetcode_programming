/*
 * @lc app=leetcode id=467 lang=java
 *
 * [467] Unique Substrings in Wraparound String
 */

record Solution() {
    public int findSubstringInWraproundString(String p) {
        return java.util.Arrays.stream(java.util.stream.IntStream.range(0, p.length()).boxed().reduce(new int[27], (dp, i) -> java.util.stream.Stream.of(dp).peek(arr -> arr[26] = (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i - 1) - p.charAt(i) == 25)) ? arr[26] + 1 : 1).peek(arr -> arr[p.charAt(i) - 'a'] = Math.max(arr[p.charAt(i) - 'a'], arr[26])).findFirst().get(), (a, b) -> a)).limit(26).sum();
    }
}
