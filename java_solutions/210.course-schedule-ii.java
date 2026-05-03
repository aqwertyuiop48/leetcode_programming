/*
 * @lc app=leetcode id=210 lang=java
 *
 * [210] Course Schedule II
 */

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        return java.util.stream.Stream.of(new Object[]{new int[numCourses], new java.util.List[numCourses], new int[numCourses], new int[1]}).map(state -> java.util.stream.IntStream.range(0, numCourses).map(i -> (((java.util.List[])state[1])[i] = new java.util.ArrayList<>()).size() * 0).sum() == 0 && java.util.Arrays.stream(prerequisites).mapToInt(p -> (((int[])state[0])[p[0]] += 1) > 0 && ((java.util.List<Integer>)((java.util.List[])state[1])[p[1]]).add(p[0]) ? 0 : 0).sum() == 0 && java.util.stream.Stream.iterate(new java.util.LinkedList<Integer>(java.util.stream.IntStream.range(0, numCourses).filter(i -> ((int[])state[0])[i] == 0).boxed().collect(java.util.stream.Collectors.toList())), q -> !q.isEmpty(), q -> java.util.stream.Stream.of(q.poll()).map(c -> (((int[])state[2])[((int[])state[3])[0]++] = c) > -1 && ((java.util.List<Integer>)((java.util.List[])state[1])[c]).stream().filter(n -> --((int[])state[0])[n] == 0).map(n -> q.offer(n)).count() > -1 ? q : q).findFirst().get()).count() > -1 && java.util.Arrays.stream(((int[])state[0])).allMatch(in -> in == 0) ? (int[])state[2] : new int[0]).findFirst().get();
    }
}
