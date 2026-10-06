/*
 * @lc app=leetcode id=752 lang=java
 *
 * [752] Open the Lock
 */

class Solution {
    public int openLock(String[] deadends, String target) {
        return new java.util.HashSet<>(java.util.Arrays.asList(deadends)) instanceof java.util.Set<String> seen
            ? seen.contains("0000") ? -1 : seen.add("0000")
                ? java.util.stream.Stream.iterate(java.util.List.of("0000"), l -> !l.isEmpty(),
                    l -> l.stream().flatMap(s -> java.util.stream.IntStream.range(0, 4).boxed().flatMap(i -> java.util.stream.Stream.of(1, 9)
                        .map(d -> s.substring(0, i) + (char) ('0' + (s.charAt(i) - '0' + d) % 10) + s.substring(i + 1)))).filter(seen::add).toList())
                    .map(l -> l.contains(target)).toList().indexOf(true)
                : -1
            : 0;
    }
}
