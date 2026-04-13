/*
 * @lc app=leetcode id=1928 lang=java
 *
 * [1928] Minimum Cost to Reach Destination in Time
 */

class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        return Optional.of(
            IntStream.range(0, passingFees.length)
                .map(i -> Integer.MAX_VALUE)
                .toArray()
        ).map(minTime -> 
            Stream.of(
                new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[1]))
            )
            .peek(pq -> pq.add(new int[]{0, passingFees[0], 0}))
            .flatMap(pq -> 
                Stream.generate(pq::poll)
                    .takeWhile(Objects::nonNull)
                    .filter(cur -> cur[2] < minTime[cur[0]])
                    .peek(cur -> minTime[cur[0]] = cur[2])
                    .peek(cur -> 
                        Arrays.stream(edges)
                            .filter(e -> e[0] == cur[0] || e[1] == cur[0])
                            .map(e -> new int[]{
                                e[0] == cur[0] ? e[1] : e[0], 
                                cur[1] + passingFees[e[0] == cur[0] ? e[1] : e[0]], 
                                cur[2] + e[2]
                            })
                            .filter(nxt -> nxt[2] <= maxTime && nxt[2] < minTime[nxt[0]])
                            .forEach(pq::add)
                    )
            )
            .filter(cur -> cur[0] == passingFees.length - 1)
            .map(cur -> cur[1])
            .findFirst()
            .orElse(-1)
        ).orElse(-1);
    }
}
