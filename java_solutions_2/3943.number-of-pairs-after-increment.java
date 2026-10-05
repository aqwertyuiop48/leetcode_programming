/*
 * @lc app=leetcode id=3943 lang=java
 *
 * [3943] Number of Pairs After Increment
 */

class Solution {
    public int[] numberOfPairs(int[] nums1, int[] nums2, int[][] queries) {
        return Optional.of(Math.max(1, (int) Math.sqrt(nums2.length))).map(bs ->
            Optional.of(Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()))).map(c1 ->
                Optional.of(c1.keySet().stream().mapToInt(Integer::intValue).toArray()).map(dv ->
                    Optional.of(Arrays.stream(dv).mapToLong(v -> c1.get(v)).toArray()).map(dcn ->
                        Optional.of(IntStream.range(0, (nums2.length + bs - 1) / bs)
                                .mapToObj(b -> IntStream.range(b * bs, Math.min(nums2.length, (b + 1) * bs)).boxed()
                                    .collect(Collectors.toMap(j -> nums2[j], j -> 1, Integer::sum, HashMap<Integer, Integer>::new)))
                                .toList()).map(freq ->
                            Optional.of(new int[freq.size()]).map(lazy ->
                                Optional.of(new int[1]).map(ver ->
                                    Optional.of(new HashMap<Long, Integer>()).map(cache ->
                                        Arrays.stream(queries)
                                            .peek(q -> IntStream.rangeClosed(q[0] == 1 ? q[1] / bs + 1 : 1, q[0] == 1 ? q[2] / bs - 1 : 0)
                                                .forEach(b -> lazy[b] += q[3]))
                                            .peek(q -> (q[0] == 1 ? IntStream.of(q[1] / bs, q[2] / bs).distinct() : IntStream.<Integer>empty().mapToInt(z -> z))
                                                .peek(b -> lazy[b] += q[1] <= b * bs && q[2] >= Math.min(nums2.length, (b + 1) * bs) - 1 ? q[3] : 0)
                                                .filter(b -> !(q[1] <= b * bs && q[2] >= Math.min(nums2.length, (b + 1) * bs) - 1))
                                                .forEach(b -> IntStream.rangeClosed(Math.max(q[1], b * bs), Math.min(q[2], Math.min(nums2.length, (b + 1) * bs) - 1))
                                                    .peek(j -> freq.get(b).merge(nums2[j], -1, (u, w) -> u + w == 0 ? null : u + w))
                                                    .peek(j -> nums2[j] += q[3])
                                                    .forEach(j -> freq.get(b).merge(nums2[j], 1, (u, w) -> u + w == 0 ? null : u + w))))
                                            .peek(q -> ver[0] += q[0] == 1 ? 1 : 0)
                                            .filter(q -> q[0] == 2)
                                            .mapToInt(q -> cache.computeIfAbsent(((long) ver[0] << 32) | (q[1] & 0xFFFFFFFFL),
                                                key -> (long) dv.length * freq.size() <= nums2.length
                                                    ? (int) IntStream.range(0, freq.size())
                                                        .mapToLong(b -> IntStream.range(0, dv.length)
                                                            .mapToLong(i -> dcn[i] * freq.get(b).getOrDefault(q[1] - dv[i] - lazy[b], 0)).sum())
                                                        .sum()
                                                    : (int) IntStream.range(0, freq.size())
                                                        .mapToLong(b -> freq.get(b).entrySet().stream()
                                                            .mapToLong(en -> (long) en.getValue() * c1.getOrDefault(q[1] - en.getKey() - lazy[b], 0L)).sum())
                                                        .sum()))
                                            .toArray())
                                        .get())
                                    .get())
                                .get())
                            .get())
                        .get())
                    .get())
                .get())
            .get();
    }
}
