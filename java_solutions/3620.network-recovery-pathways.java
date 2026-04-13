/*
 * @lc app=leetcode id=3620 lang=java
 *
 * [3620] Network Recovery Pathways
 */

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        return ((Function<Object[], Integer>) s ->
            // 1. Initialize Adjacency List s[0] (Build ONCE)
            ((s[0] = new ArrayList<List<int[]>>()) != null) &&
            IntStream.range(0, online.length).allMatch(i -> ((List)s[0]).add(new ArrayList<>())) &&
            // Populate Graph
            Arrays.stream(edges).allMatch(e -> 
                !(online[e[0]] && online[e[1]]) || 
                ((List<List<int[]>>)s[0]).get(e[0]).add(new int[]{e[1], e[2]})
            ) &&

            // 2. Initialize Helpers
            ((s[1] = new long[online.length]) != null) &&
            ((s[2] = new PriorityQueue<long[]>(Comparator.comparingLong(a -> a[0]))) != null) &&

            // 3. Define Check Function s[3] (Dijkstra)
            ((s[3] = (LongFunction<Boolean>) mid -> 
                // Reset Distances
                (IntStream.range(0, online.length).allMatch(i -> (((long[])s[1])[i] = Long.MAX_VALUE / 4) > 0)) &&
                (((long[])s[1])[0] = 0) == 0 &&
                // Reset PQ
                (((PriorityQueue)s[2]).removeIf(x -> true) || true) &&
                (((PriorityQueue<long[]>)s[2]).offer(new long[]{0, 0}) || true) &&
                
                // Run Dijkstra
                Stream.iterate(((PriorityQueue<long[]>)s[2]).poll(), Objects::nonNull, t -> ((PriorityQueue<long[]>)s[2]).poll())
                    .filter(top -> top[0] <= ((long[])s[1])[(int)top[1]]) // Skip stale
                    .map(top -> 
                        // THE FIX: Boolean Expression Chain inside removeIf
                        (!((List<List<int[]>>)s[0]).get((int)top[1]).removeIf(e -> 
                            (e[1] >= mid && // Check threshold
                             ((long[])s[1])[e[0]] > top[0] + e[1] && // Check shorter path
                             (((long[])s[1])[e[0]] = top[0] + e[1]) > -1 && // Update distance
                             ((PriorityQueue<long[]>)s[2]).offer(new long[]{((long[])s[1])[e[0]], e[0]}) // Push to PQ
                            ) && false // Always return false (don't remove edges)
                        ) || true) && 
                        // Termination Check
                        ((int)top[1] == online.length - 1 && top[0] <= k)
                    )
                    .anyMatch(found -> found) // Stop if target found
            ) != null) &&

            // 4. Define Binary Search s[4]
            ((s[4] = (BiFunction<Integer, Integer, Integer>) (l, h) -> 
                l > h ? h : 
                ((LongFunction<Boolean>)s[3]).apply((long)(l + (h - l) / 2))
                    ? ((BiFunction<Integer, Integer, Integer>)s[4]).apply(l + (h - l) / 2 + 1, h)
                    : ((BiFunction<Integer, Integer, Integer>)s[4]).apply(l, l + (h - l) / 2 - 1)
            ) != null) ?

            // 5. Execute Binary Search
            ((BiFunction<Integer, Integer, Integer>)s[4]).apply(0, 1000000001) : 0
        ).apply(new Object[10]);
    }
}
