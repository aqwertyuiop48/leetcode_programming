/*
 * @lc app=leetcode id=1948 lang=java
 *
 * [1948] Delete Duplicate Folders in System
 */

class Solution {
    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) {
        return ((Function<Object[], Function<Map<String, Integer>, Function<List<String>, Function<List<List<String>>, List<List<String>>>>>>) root -> countMap -> currPath -> res -> 
            paths.stream().mapToInt(p -> ((Function<Object[][], Integer>) ptr -> p.stream().mapToInt(f -> (ptr[0] = (Object[]) ((Map<String, Object[]>)ptr[0][1]).computeIfAbsent(f, k -> new Object[]{f, new TreeMap<>(), ""})).hashCode() * 0).sum()).apply(new Object[][]{root})).sum() * 0 == 0 &&
            ((Function<Function[], Integer>) dfs1Arr -> (dfs1Arr[0] = (Function<Object[], String>) node -> 
                (node[2] = ((Map<String, Object[]>)node[1]).isEmpty() ? "" : ((Map<String, Object[]>)node[1]).values().stream().map(c -> (((Function<Object[], String>)dfs1Arr[0]).apply((Object[])c).isEmpty() ? "" : "") + (String)((Object[])c)[0] + "(" + (String)((Object[])c)[2] + ")").reduce("", String::concat)) instanceof String ? 
                (((String)node[2]).isEmpty() ? "" : (countMap.merge((String)node[2], 1, Integer::sum) * 0 == 0 ? (String)node[2] : "")) : ""
            ).apply(root).hashCode() * 0).apply(new Function[1]) == 0 &&
            ((Function<Function[], Integer>) dfs2Arr -> (dfs2Arr[0] = (Function<Object[], Integer>) node -> 
                (((Map<String, Object[]>)node[1]).isEmpty() || countMap.getOrDefault((String)node[2], 0) < 2 ? 
                    (((String)node[0]).isEmpty() ? 0 : currPath.add((String)node[0]) ? 1 : 1) * 0 +
                    (((String)node[0]).isEmpty() ? 0 : res.add(new ArrayList<>(currPath)) ? 1 : 1) * 0 +
                    ((Map<String, Object[]>)node[1]).values().stream().mapToInt(child -> (Integer)((Function<Object[], Integer>)dfs2Arr[0]).apply((Object[])child)).sum() * 0 +
                    (((String)node[0]).isEmpty() ? 0 : currPath.remove(currPath.size() - 1) != null ? 1 : 1) * 0
                : 0)
            ).apply(root).hashCode() * 0).apply(new Function[1]) == 0 ? res : res
        ).apply(new Object[]{"", new TreeMap<>(), ""}).apply(new HashMap<>()).apply(new ArrayList<>()).apply(new ArrayList<>());
    }
}
