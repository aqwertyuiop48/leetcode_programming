/*
 * @lc app=leetcode id=3102 lang=java
 *
 * [3102] Minimize Manhattan Distances
 */

class Solution { public int minimumDistance(int[][] points) { return ((Function<BiFunction<Integer, Integer, Integer>, Integer>) manh -> ((Function<Function<Integer, int[]>, Integer>) maxManh -> ((Function<int[], Integer>) m -> Math.min(manh.apply(maxManh.apply(m[0])[0], maxManh.apply(m[0])[1]), manh.apply(maxManh.apply(m[1])[0], maxManh.apply(m[1])[1]))).apply(maxManh.apply(-1))).apply((Integer rm) -> ((Function<int[], int[]>) acc -> acc[0] - acc[1] >= acc[2] - acc[3] ? new int[]{acc[4], acc[5]} : new int[]{acc[6], acc[7]}).apply(IntStream.range(0, points.length).filter(i -> i != rm).boxed().reduce(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, -1, -1, -1, -1}, (acc, i) -> ((BiFunction<Integer, Integer, int[]>) (sum, diff) -> (sum > acc[0] ? (acc[0] = sum) * 0 + (acc[4] = i) * 0 : 0) + (sum < acc[1] ? (acc[1] = sum) * 0 + (acc[5] = i) * 0 : 0) + (diff > acc[2] ? (acc[2] = diff) * 0 + (acc[6] = i) * 0 : 0) + (diff < acc[3] ? (acc[3] = diff) * 0 + (acc[7] = i) * 0 : 0) == 0 ? acc : acc).apply(points[i][0] + points[i][1], points[i][0] - points[i][1]), (a, b) -> a)))).apply((i, j) -> Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1])); } }
