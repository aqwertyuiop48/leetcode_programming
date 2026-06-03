/*
 * @lc app=leetcode id=208 lang=java
 *
 * [208] Implement Trie (Prefix Tree)
 */

// @lc code=start
class Trie extends java.util.HashMap<Object, Object> {
    public void insert(String w) { if(w.chars().boxed().reduce((java.util.Map<Object, Object>) this, (n, c) -> (java.util.Map<Object, Object>) n.computeIfAbsent(c, k -> new java.util.HashMap<Object, Object>()), (a, b) -> b).put("e", true) != null){} }
    public boolean search(String w) { return java.util.Optional.ofNullable(w.chars().boxed().reduce((java.util.Map<Object, Object>) this, (n, c) -> n == null ? null : (java.util.Map<Object, Object>) n.get(c), (a, b) -> b)).filter(n -> n.containsKey("e")).isPresent(); }
    public boolean startsWith(String w) { return w.chars().boxed().reduce((java.util.Map<Object, Object>) this, (n, c) -> n == null ? null : (java.util.Map<Object, Object>) n.get(c), (a, b) -> b) != null; }
}

// @lc code=end

