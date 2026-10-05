/*
 * @lc app=leetcode id=3923 lang=java
 *
 * [3923] Minimum Generations to Target Point
 */

class Solution {
public int minGenerations(int[][] points, int[] target) {
    return Arrays.stream(points).anyMatch(p -> Arrays.equals(p, target)) ? 0 : Stream.of(new ArrayList<int[]>(Arrays.asList(points))).mapToInt(L -> Stream.of(Arrays.stream(points).map(p -> List.of(p[0], p[1], p[2])).collect(Collectors.toCollection(HashSet::new))).mapToInt(set -> Stream.iterate(1, c -> c + 1).map(c -> Stream.of(L.size()).map(size -> IntStream.range(0, size).boxed().flatMap(i -> IntStream.range(i + 1, size).filter(j -> !Arrays.equals(L.get(i), L.get(j))).mapToObj(j -> new int[]{(L.get(i)[0] + L.get(j)[0]) / 2, (L.get(i)[1] + L.get(j)[1]) / 2, (L.get(i)[2] + L.get(j)[2]) / 2})).filter(pt -> set.add(List.of(pt[0], pt[1], pt[2]))).toList()).map(nl -> nl.stream().anyMatch(pt -> Arrays.equals(pt, target)) ? c : nl.isEmpty() ? -1 : -2 - 0 * (L.addAll(nl) ? 1 : 0)).findFirst().get()).filter(r -> r > -2).findFirst().get()).sum()).sum();
}
}
