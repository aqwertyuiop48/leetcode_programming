/*
 * @lc app=leetcode id=2642 lang=java
 *
 * [2642] Design Graph With Shortest Path Calculator
 */

record Graph(List<List<int[]>> adj) {
    public Graph(int n, int[][] edges) {
        this(((Function<List<List<int[]>>, List<List<int[]>>>) a -> Arrays.stream(edges).mapToInt(e -> a.get(e[0]).add(new int[]{e[1], e[2]}) ? 1 : 0).sum() * 0 == 0 ? a : a).apply(IntStream.range(0, n).mapToObj(i -> (List<int[]>) new ArrayList<int[]>()).collect(ArrayList::new, ArrayList::add, ArrayList::addAll)));
    }
    
    public void addEdge(int[] edge) {
        if (adj.get(edge[0]).add(new int[]{edge[1], edge[2]})) {}
    }
    
    public int shortestPath(int node1, int node2) {
        return ((Function<int[], Integer>) dist -> ((Function<PriorityQueue<int[]>, Integer>) pq -> IntStream.iterate(0, dummy -> !pq.isEmpty(), dummy -> dummy + 1).mapToObj(dummy -> pq.poll()).filter(curr -> curr[0] <= dist[curr[1]]).mapToInt(curr -> adj.get(curr[1]).stream().mapToInt(e -> dist[e[0]] > curr[0] + e[1] ? (dist[e[0]] = curr[0] + e[1]) * 0 + (pq.add(new int[]{dist[e[0]], e[0]}) ? 0 : 0) : 0).sum()).sum() * 0 == 0 ? (dist[node2] == Integer.MAX_VALUE ? -1 : dist[node2]) : -1).apply(((Function<PriorityQueue<int[]>, PriorityQueue<int[]>>) q -> (q.add(new int[]{0, node1}) ? q : q)).apply(new PriorityQueue<>(Comparator.comparingInt(a -> a[0]))))).apply(IntStream.range(0, adj.size()).map(i -> i == node1 ? 0 : Integer.MAX_VALUE).toArray());
    }
}
