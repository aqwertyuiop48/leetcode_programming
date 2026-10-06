/*
 * @lc app=leetcode id=497 lang=java
 *
 * [497] Random Point in Non-overlapping Rectangles
 */

class Solution extends java.util.concurrent.atomic.AtomicReference<java.util.function.Supplier<int[]>> {
    public Solution(int[][] rects) {
        if (new java.util.TreeMap<Integer, int[]>() instanceof java.util.TreeMap<Integer, int[]> tm && new int[]{0} instanceof int[] tot
            && java.util.Arrays.stream(rects).allMatch(r -> tm.put(tot[0], r) == null && (tot[0] += (r[2] - r[0] + 1) * (r[3] - r[1] + 1)) > 0)
            && compareAndSet(null, () -> java.util.stream.IntStream.of(java.util.concurrent.ThreadLocalRandom.current().nextInt(tot[0]))
                .mapToObj(k -> java.util.stream.Stream.of(tm.floorEntry(k))
                    .map(e -> new int[]{e.getValue()[0] + (k - e.getKey()) % (e.getValue()[2] - e.getValue()[0] + 1), e.getValue()[1] + (k - e.getKey()) / (e.getValue()[2] - e.getValue()[0] + 1)})
                    .findFirst().get()).findFirst().get())) {}
    }

    public int[] pick() {
        return get().get();
    }
}
