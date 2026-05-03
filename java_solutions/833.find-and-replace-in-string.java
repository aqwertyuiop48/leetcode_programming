/*
 * @lc app=leetcode id=833 lang=java
 *
 * [833] Find And Replace in String
 */

record Solution() {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        return java.util.stream.IntStream.range(0, indices.length).boxed().sorted((a, b) -> indices[b] - indices[a]).reduce(new StringBuilder(s), (sb, i) -> s.startsWith(sources[i], indices[i]) ? sb.replace(indices[i], indices[i] + sources[i].length(), targets[i]) : sb, (a, b) -> a).toString();
    }
}
