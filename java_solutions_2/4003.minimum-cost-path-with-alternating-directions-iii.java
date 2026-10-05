/*
 * @lc app=leetcode id=4003 lang=java
 *
 * [4003] Minimum Cost Path with Alternating Directions III
 */

class Solution {
    public long minCost(int m, int n, int[][] penalty) {
        return Stream.of(new int[][][]{{{0, 0, -1}, {0, 1, 0}, {1, 0, 0}, {0, -1, 1}, {-1, 0, 1}}})
            .mapToLong(DIRS -> Stream.<PriorityQueue<Long>>of(new PriorityQueue<>())
                .mapToLong(q -> Stream.<long[]>of(new long[m * n * 2])
                    .peek(d -> Arrays.fill(d, Long.MAX_VALUE / 2))
                    .peek(d -> d[0] = 1L)
                    .peek(d -> q.offer(1L << 21))
                    .mapToLong(d -> Stream.generate(() -> q.isEmpty() ? -1L : q.poll())
                        .takeWhile(val -> val != -1L)
                        .filter(val -> (val >>> 21) <= d[(int)(val & 0x1FFFFFL)])
                        .peek(val -> Stream.of(new long[]{ val >>> 21, (val & 0x1FFFFFL) & 1, ((val & 0x1FFFFFL) >> 1) / n, ((val & 0x1FFFFFL) >> 1) % n })
                            .filter(st -> ((int)(val & 0x1FFFFFL) >> 1) != m * n - 1)
                            .forEach(st -> Arrays.stream(DIRS)
                                .map(dir -> dir[2] == -1 
                                    ? new long[]{ st[2], st[3], st[0] + penalty[(int)st[2]][(int)st[3]], 1L }
                                    : new long[]{
                                        st[2] + dir[0], 
                                        st[3] + dir[1], 
                                        st[0] + (long)(st[2] + dir[0] + 1) * (st[3] + dir[1] + 1) + (st[1] == dir[2] ? 0 : penalty[(int)st[2]][(int)st[3]]),
                                        (st[2] + dir[0] >= 0 && st[2] + dir[0] < m && st[3] + dir[1] >= 0 && st[3] + dir[1] < n) ? 1L : 0L
                                    }
                                )
                                .filter(arr -> arr[3] == 1L)
                                .map(arr -> new long[]{ arr[2], (((int)arr[0] * n + (int)arr[1]) << 1) | ((int)st[1] ^ 1) })
                                .filter(arr -> arr[0] < d[(int)arr[1]])
                                .peek(arr -> d[(int)arr[1]] = arr[0])
                                .forEach(arr -> q.offer((arr[0] << 21) | arr[1]))
                            )
                        )
                        .filter(val -> ((int)(val & 0x1FFFFFL) >> 1) == m * n - 1)
                        .mapToLong(val -> val >>> 21)
                        .findFirst()
                        .orElse(-1L)
                    ).findFirst().getAsLong()
                ).findFirst().getAsLong()
            ).findFirst().getAsLong();
    }
}
