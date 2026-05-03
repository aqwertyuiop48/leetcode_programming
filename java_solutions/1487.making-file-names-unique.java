/*
 * @lc app=leetcode id=1487 lang=java
 *
 * [1487] Making File Names Unique
 */

class Solution {
    public String[] getFolderNames(String[] names) {
        return java.util.Optional.of(new Object[]{new java.util.HashMap<String, Integer>(), new String[names.length], new int[]{0}, new java.util.function.Function[1]})
            .filter(s -> (((java.util.function.Function[]) s[3])[0] = (java.util.function.Function<Integer, String>) k -> !((java.util.Map<String, Integer>) s[0]).containsKey(k == 0 ? names[((int[]) s[2])[0]] : names[((int[]) s[2])[0]] + "(" + k + ")") ? ((((java.util.Map<String, Integer>) s[0]).put(names[((int[]) s[2])[0]], Math.max(1, k + 1)) == null || true) && (k > 0 ? ((java.util.Map<String, Integer>) s[0]).put(names[((int[]) s[2])[0]] + "(" + k + ")", 1) == null || true : true) ? (k == 0 ? names[((int[]) s[2])[0]] : names[((int[]) s[2])[0]] + "(" + k + ")") : "") : ((java.util.function.Function<Integer, String>) ((java.util.function.Function[]) s[3])[0]).apply(k + 1)) != null)
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(names.length, 0)).removeIf(dummy -> ((((String[]) s[1])[((int[]) s[2])[0]] = ((java.util.function.Function<Integer, String>) ((java.util.function.Function[]) s[3])[0]).apply(((java.util.Map<String, Integer>) s[0]).getOrDefault(names[((int[]) s[2])[0]], 0))) != null) && (((int[]) s[2])[0]++ >= 0) && false) || true)
            .map(s -> (String[]) s[1])
            .get();
    }
}
