/*
 * @lc app=leetcode id=2508 lang=java
 *
 * [2508] Add Edges to Make Degrees of All Nodes Even
 */

class Solution { public boolean isPossible(int n, List<List<Integer>> edges) { return ((Function<List<Set<Integer>>, Boolean>) adj -> edges.stream().mapToInt(e -> (adj.get(e.get(0)).add(e.get(1)) ? 1 : 1) * (adj.get(e.get(1)).add(e.get(0)) ? 1 : 1)).sum() * 0 == 0 ? ((Function<int[], Boolean>) o -> o.length == 0 ? true : o.length == 2 ? (!adj.get(o[0]).contains(o[1]) || IntStream.rangeClosed(1, n).anyMatch(i -> i != o[0] && i != o[1] && !adj.get(o[0]).contains(i) && !adj.get(o[1]).contains(i))) : o.length == 4 ? (!adj.get(o[0]).contains(o[1]) && !adj.get(o[2]).contains(o[3])) || (!adj.get(o[0]).contains(o[2]) && !adj.get(o[1]).contains(o[3])) || (!adj.get(o[0]).contains(o[3]) && !adj.get(o[1]).contains(o[2])) : false).apply(IntStream.rangeClosed(1, n).filter(i -> adj.get(i).size() % 2 != 0).toArray()) : false).apply(IntStream.rangeClosed(0, n).mapToObj(i -> (Set<Integer>) new HashSet<Integer>()).collect(Collectors.toList())); } }
