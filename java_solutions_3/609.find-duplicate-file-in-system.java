/*
 * @lc app=leetcode id=609 lang=java
 *
 * [609] Find Duplicate File in System
 */

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        return java.util.Arrays.stream(paths).flatMap(p -> java.util.Arrays.stream(p.split(" ")).skip(1)
                .map(f -> new String[]{f.substring(f.indexOf('(') + 1, f.length() - 1), p.split(" ")[0] + "/" + f.substring(0, f.indexOf('('))}))
            .collect(java.util.stream.Collectors.groupingBy(a -> a[0], java.util.stream.Collectors.mapping(a -> a[1], java.util.stream.Collectors.toList())))
            .values().stream().filter(l -> l.size() > 1).toList();
    }
}
