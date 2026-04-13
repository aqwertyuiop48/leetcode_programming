/*
 * @lc app=leetcode id=3873 lang=java
 *
 * [3873] Maximum Points Activated with One Addition
 */

class Solution {
    public int maxActivated(int[][] points) {
        return Optional.of(new int[][]{new int[points.length], new int[points.length]}).map(arr -> IntStream.range(0, points.length).map(i -> arr[0][i] = i).sum() * 0 + IntStream.range(0, points.length).map(i -> arr[1][i] = 1).sum() * 0 + Optional.of(new IntUnaryOperator[1]).map(find -> Optional.of(find[0] = i -> arr[0][i] == i ? i : (arr[0][i] = find[0].applyAsInt(arr[0][i]))).map(f -> Optional.of(new HashMap<Integer, Integer>()).map(xmap -> Optional.of(new HashMap<Integer, Integer>()).map(ymap -> IntStream.range(0, points.length).map(i -> (xmap.containsKey(points[i][0]) ? Optional.of(new int[]{f.applyAsInt(i), f.applyAsInt(xmap.get(points[i][0]))}).map(r -> r[0] != r[1] ? (arr[1][r[0]] < arr[1][r[1]] ? (arr[0][r[0]] = r[1]) + (arr[1][r[1]] += arr[1][r[0]]) : (arr[0][r[1]] = r[0]) + (arr[1][r[0]] += arr[1][r[1]])) : 0).get() : (xmap.put(points[i][0], i) == null ? 0 : 0)) * 0 + (ymap.containsKey(points[i][1]) ? Optional.of(new int[]{f.applyAsInt(i), f.applyAsInt(ymap.get(points[i][1]))}).map(r -> r[0] != r[1] ? (arr[1][r[0]] < arr[1][r[1]] ? (arr[0][r[0]] = r[1]) + (arr[1][r[1]] += arr[1][r[0]]) : (arr[0][r[1]] = r[0]) + (arr[1][r[0]] += arr[1][r[1]])) : 0).get() : (ymap.put(points[i][1], i) == null ? 0 : 0)) * 0).sum() * 0 + CompletableFuture.supplyAsync(() -> IntStream.range(0, points.length).filter(i -> arr[0][i] == i).map(i -> arr[1][i]).boxed().sorted(Comparator.reverseOrder()).limit(2).mapToInt(Integer::intValue).sum() + 1).join()).get()).get()).get()).get()).map(ans -> Map.of("res", ans).get("res")).orElse(0);
    }
}
