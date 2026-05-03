/*
 * @lc app=leetcode id=1488 lang=java
 *
 * [1488] Avoid Flood in The City
 */

class Solution {
    public int[] avoidFlood(int[] rains) {
        return java.util.Optional.of(new Object[]{new java.util.HashMap<Integer, Integer>(), new java.util.TreeSet<Integer>(), new int[rains.length], new int[]{0, 1}})
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(rains.length, 0)).removeIf(dummy -> 
                rains[((int[]) s[3])[0]] == 0 ? 
                    (((java.util.TreeSet<Integer>) s[1]).add(((int[]) s[3])[0]) || true) && (((int[]) s[2])[((int[]) s[3])[0]] = 1) >= 0 && (((int[]) s[3])[0]++ >= 0) && false :
                    ((((int[]) s[2])[((int[]) s[3])[0]] = -1) < 0 && ((java.util.Map<Integer, Integer>) s[0]).containsKey(rains[((int[]) s[3])[0]]) ?
                        (((java.util.TreeSet<Integer>) s[1]).higher(((java.util.Map<Integer, Integer>) s[0]).get(rains[((int[]) s[3])[0]])) != null ?
                            (((int[]) s[2])[((java.util.TreeSet<Integer>) s[1]).higher(((java.util.Map<Integer, Integer>) s[0]).get(rains[((int[]) s[3])[0]]))] = rains[((int[]) s[3])[0]]) >= 0 && (((java.util.TreeSet<Integer>) s[1]).remove(((java.util.TreeSet<Integer>) s[1]).higher(((java.util.Map<Integer, Integer>) s[0]).get(rains[((int[]) s[3])[0]]))) || true) && (((java.util.Map<Integer, Integer>) s[0]).put(rains[((int[]) s[3])[0]], ((int[]) s[3])[0]) == null || true)
                        : (((int[]) s[3])[1] = 0) == 0)
                    : (((java.util.Map<Integer, Integer>) s[0]).put(rains[((int[]) s[3])[0]], ((int[]) s[3])[0]) == null || true)) && (((int[]) s[3])[0]++ >= 0) && false
            ) || true)
            .map(s -> ((int[]) s[3])[1] == 1 ? (int[]) s[2] : new int[0])
            .get();
    }
}
