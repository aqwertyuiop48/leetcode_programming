/*
 * @lc app=leetcode id=3947 lang=java
 *
 * [3947] Maximum Number of Items From Sale II
 */

class Solution {
public int maximumSaleItems(int[][] items, int budget) {
    return (int) IntStream.of(Arrays.stream(items).mapToInt(it -> it[1]).min().getAsInt()).mapToLong(ch -> Stream.of(new int[Arrays.stream(items).mapToInt(it -> it[0]).max().getAsInt() + 1]).peek(freq -> Arrays.stream(items).forEach(it -> freq[it[0]]++)).mapToLong(freq -> Stream.of(IntStream.range(0, freq.length).map(f -> f == 0 || freq[f] == 0 ? 0 : IntStream.iterate(f, c -> c < freq.length, c -> c + f).map(c -> freq[c]).sum()).toArray()).mapToLong(multi -> Stream.of(Arrays.stream(items).filter(it -> multi[it[0]] > 1 && it[1] <= 2L * ch).collect(Collectors.groupingBy(it -> it[1], TreeMap::new, Collectors.summingLong(it -> multi[it[0]] - 1))).entrySet().stream().collect(() -> new long[]{0, budget, 0}, (st, e) -> st[0] += 2 * (st[2] = Math.min(e.getValue(), st[1] / e.getKey())) + 0 * (st[1] -= st[2] * e.getKey()), (a, b) -> {})).mapToLong(st -> st[0] + st[1] / ch).sum()).sum()).sum()).sum();
}
}
