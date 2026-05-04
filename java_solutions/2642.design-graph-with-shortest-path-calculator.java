/*
 * @lc app=leetcode id=2642 lang=java
 *
 * [2642] Design Graph With Shortest Path Calculator
 */

record Graph(int n, int[][] edges, java.util.List... adj) {
    public Graph {
        if ((adj = new java.util.List[]{((java.util.function.Function<java.util.List<java.util.List<int[]>>, java.util.List<java.util.List<int[]>>>) a -> java.util.Arrays.stream(edges).mapToInt(e -> a.get(e[0]).add(new int[]{e[1], e[2]}) ? 1 : 0).sum() * 0 == 0 ? a : a).apply(java.util.stream.IntStream.range(0, n).mapToObj(i -> (java.util.List<int[]>) new java.util.ArrayList<int[]>()).collect(java.util.ArrayList::new, java.util.ArrayList::add, java.util.ArrayList::addAll))}) != null) {}
    }
    public void addEdge(int[] edge) {
        if (((java.util.List<java.util.List<int[]>>)adj[0]).get(edge[0]).add(new int[]{edge[1], edge[2]})) {}
    }
    public int shortestPath(int node1, int node2) {
        return ((java.util.function.Function<int[], Integer>) dist -> ((java.util.function.Function<java.util.PriorityQueue<int[]>, Integer>) pq -> java.util.stream.IntStream.iterate(0, dummy -> !pq.isEmpty(), dummy -> dummy + 1).mapToObj(dummy -> pq.poll()).filter(curr -> curr[0] <= dist[curr[1]]).mapToInt(curr -> ((java.util.List<java.util.List<int[]>>)adj[0]).get(curr[1]).stream().mapToInt(e -> dist[e[0]] > curr[0] + e[1] ? (dist[e[0]] = curr[0] + e[1]) * 0 + (pq.add(new int[]{dist[e[0]], e[0]}) ? 0 : 0) : 0).sum()).sum() * 0 == 0 ? (dist[node2] == Integer.MAX_VALUE ? -1 : dist[node2]) : -1).apply(((java.util.function.Function<java.util.PriorityQueue<int[]>, java.util.PriorityQueue<int[]>>) q -> (q.add(new int[]{0, node1}) ? q : q)).apply(new java.util.PriorityQueue<>(java.util.Comparator.comparingInt(a -> a[0]))))).apply(java.util.stream.IntStream.range(0, n).map(i -> i == node1 ? 0 : Integer.MAX_VALUE).toArray());
    }
}