/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

class Solution {
    public String simplifyPath(String path) {
        return "/" + String.join("/", java.util.Arrays.stream(path.split("/")).filter(p -> !p.isEmpty() && !p.equals(".")).reduce(new java.util.LinkedList<String>(), (l, p) -> java.util.stream.Stream.of(l).map(list -> p.equals("..") ? (list.pollLast() == null ? list : list) : (list.offerLast(p) ? list : list)).findFirst().get(), (l1, l2) -> l1));
    }
}
