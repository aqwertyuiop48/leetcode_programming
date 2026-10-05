/*
 * @lc app=leetcode id=4007 lang=java
 *
 * [4007] Widest Possible Fence
 */

class Solution {
    public int maximumWidth(int[] planks) {
        return (int) java.util.stream.Stream.of(java.util.Arrays.stream(planks).boxed()
            .collect(java.util.stream.Collectors.groupingBy(x -> (long) x, java.util.stream.Collectors.counting())))
            .mapToLong(freq -> java.util.stream.Stream.of(new java.util.ArrayList<>(freq.keySet()))
                .mapToLong(vals -> java.util.stream.Stream.of(java.util.stream.IntStream.range(0, vals.size())
                    .boxed()
                    .flatMap(i -> java.util.stream.IntStream.range(i, vals.size())
                        .mapToObj(j -> new long[]{
                            vals.get(i) + vals.get(j), 
                            i == j ? freq.get(vals.get(i)) / 2 : Math.min(freq.get(vals.get(i)), freq.get(vals.get(j)))
                        })
                    )
                    .collect(java.util.stream.Collectors.groupingBy(p -> p[0], java.util.stream.Collectors.summingLong(p -> p[1]))))
                    .mapToLong(pairs -> Math.max(
                        pairs.entrySet().stream().mapToLong(e -> e.getValue() + freq.getOrDefault(e.getKey(), 0L)).max().orElse(0L),
                        freq.values().stream().mapToLong(v -> v).max().orElse(0L)
                    )).findFirst().getAsLong()
                ).findFirst().getAsLong()
            ).findFirst().getAsLong();
    }
}
