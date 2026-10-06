/*
 * @lc app=leetcode id=721 lang=java
 *
 * [721] Accounts Merge
 */

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        return new java.util.HashMap<String, String>() instanceof java.util.HashMap<String, String> p && new java.util.HashMap<String, String>() instanceof java.util.HashMap<String, String> nm
            && ((java.util.function.UnaryOperator<String>) e -> java.util.stream.Stream.iterate(e, x -> p.get(x)).filter(x -> p.get(x).equals(x)).findFirst().get()) instanceof java.util.function.UnaryOperator<String> find
            && accounts.stream().allMatch(a -> a.stream().skip(1).allMatch(e -> (p.putIfAbsent(e, e) == null || true) && (nm.put(e, a.get(0)) == null || true)
                && p.put(find.apply(e), find.apply(a.get(1))) != null))
            ? p.keySet().stream().collect(java.util.stream.Collectors.groupingBy(e -> find.apply(e), java.util.stream.Collectors.toCollection(java.util.TreeSet::new))).values().stream()
                .map(s -> java.util.stream.Stream.concat(java.util.stream.Stream.of(nm.get(s.first())), s.stream()).toList()).toList()
            : null;
    }
}
