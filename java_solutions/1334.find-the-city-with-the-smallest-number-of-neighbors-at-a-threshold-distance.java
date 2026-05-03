/*
 * @lc app=leetcode id=1334 lang=java
 *
 * [1334] Find the City With the Smallest Number of Neighbors at a Threshold Distance
 */

class Solution { public int findTheCity(int n, int[][] edges, int distanceThreshold) { return Optional.of(IntStream.range(0, n) .mapToObj(i -> IntStream.range(0, n).map(j -> i == j ? 0 : 1000001).toArray()) .toArray(int[][]::new)) .filter(dist -> Arrays.stream(edges).allMatch(e -> (dist[e[0]][e[1]] = dist[e[1]][e[0]] = e[2]) >= 0)) .filter(dist -> IntStream.range(0, n).allMatch(k -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j])) >= 0)))) .map(dist -> IntStream.range(0, n) .mapToObj(i -> new int[]{i, (int) Arrays.stream(dist[i]).filter(d -> d <= distanceThreshold).count()}) .min((a, b) -> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]) .map(res -> res[0]) .orElse(0)) .orElse(0); } }
