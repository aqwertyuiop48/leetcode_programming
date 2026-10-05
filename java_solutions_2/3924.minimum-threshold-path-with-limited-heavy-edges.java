/*
 * @lc app=leetcode id=3924 lang=java
 *
 * [3924] Minimum Threshold Path With Limited Heavy Edges
 */

class Solution {
public int minimumThreshold(int n, int[][] edges, int source, int target, int k) {
    return Stream.of(Arrays.stream(edges).flatMap(e -> Stream.of(new int[]{e[0], e[1], e[2]}, new int[]{e[1], e[0], e[2]})).collect(Collectors.groupingBy(e -> e[0]))).mapToInt(adj -> Stream.<IntPredicate>of(thr -> Stream.of(new int[n]).peek(dist -> Arrays.fill(dist, Integer.MAX_VALUE)).peek(dist -> dist[source] = 0).peek(dist -> Stream.of(new ArrayDeque<int[]>()).peek(dq -> dq.offer(new int[]{source, 0})).forEach(dq -> Stream.generate(dq::pollFirst).takeWhile(Objects::nonNull).filter(cur -> cur[1] == dist[cur[0]]).forEach(cur -> adj.getOrDefault(cur[0], List.<int[]>of()).stream().filter(e -> cur[1] + (e[2] > thr ? 1 : 0) < dist[e[1]]).forEach(e -> (e[2] > thr ? (Consumer<int[]>) dq::offerLast : (Consumer<int[]>) dq::offerFirst).accept(new int[]{e[1], dist[e[1]] = cur[1] + (e[2] > thr ? 1 : 0)}))))).anyMatch(dist -> dist[target] <= k)).mapToInt(chk -> Stream.iterate(new int[]{0, Arrays.stream(edges).mapToInt(e -> e[2]).max().orElse(0), -1}, s -> IntStream.of(s[0] + (s[1] - s[0]) / 2).mapToObj(mid -> chk.test(mid) ? new int[]{s[0], mid - 1, mid} : new int[]{mid + 1, s[1], s[2]}).findFirst().get()).dropWhile(s -> s[0] <= s[1]).findFirst().get()[2]).sum()).sum();
}
}
