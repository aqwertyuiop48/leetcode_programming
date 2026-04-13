/*
 * @lc app=leetcode id=2751 lang=java
 *
 * [2751] Robot Collisions
 */

class Solution { public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) { return ((Function<int[], Function<int[], Function<int[], List<Integer>>>>) arr -> stack -> state -> IntStream.of(arr).map(curr -> (int)IntStream.iterate(0, dummy -> state[0] >= 0 && directions.charAt(curr) == 'L' && directions.charAt(stack[state[0]]) == 'R' && healths[curr] > 0, dummy -> dummy).map(dummy -> healths[stack[state[0]]] > healths[curr] ? (healths[stack[state[0]]] -= 1) * 0 + (healths[curr] = 0) : healths[stack[state[0]]] < healths[curr] ? (healths[stack[state[0]]] = 0) * 0 + (state[0] -= 1) * 0 + (healths[curr] -= 1) * 0 : (healths[stack[state[0]]] = 0) * 0 + (state[0] -= 1) * 0 + (healths[curr] = 0)).sum() * 0 + (healths[curr] > 0 ? (stack[++state[0]] = curr) * 0 : 0)).sum() * 0 == 0 ? IntStream.of(healths).filter(h -> h > 0).boxed().collect(Collectors.toList()) : null).apply(IntStream.range(0, positions.length).boxed().sorted((a, b) -> Integer.compare(positions[a], positions[b])).mapToInt(i -> i).toArray()).apply(new int[positions.length]).apply(new int[]{-1}); } }
