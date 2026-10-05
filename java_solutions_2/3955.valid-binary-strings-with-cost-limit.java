/*
 * @lc app=leetcode id=3955 lang=java
 *
 * [3955] Valid Binary Strings With Cost Limit
 */

class Solution {
public List<String> generateValidStrings(int n, int k) {
    return Stream.of(new AtomicReference<Function<int[], Stream<String>>>()).flatMap(ref -> ref.updateAndGet(old -> s -> s[1] > k ? Stream.<String>empty() : s[0] == n ? Stream.of("") : Stream.concat(ref.get().apply(new int[]{s[0] + 1, s[1], 0}).map("0"::concat), s[2] == 1 ? Stream.<String>empty() : ref.get().apply(new int[]{s[0] + 1, s[1] + s[0], 1}).map("1"::concat))).apply(new int[]{0, 0, 0})).toList();
}
}
