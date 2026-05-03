/*
 * @lc app=leetcode id=3597 lang=java
 *
 * [3597] Partition String 
 */

class Solution {
    public java.util.List<String> partitionString(String s) {
        if (new java.util.ArrayList<String>() instanceof java.util.ArrayList al && new java.util.HashSet<String>() instanceof java.util.HashSet set && new StringBuilder() instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ps", al) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = s.charAt(v[0])) | 1) != 0) {
                        if (sb.length() > 0) {
                            if (sb.append((char)v[1]) != null | true) {
                                if (!set.contains(sb.toString())) {
                                    if (al.add(sb.toString()) | set.add(sb.toString()) | true && sb.delete(0, sb.length()) != null | true) {}
                                }
                            }
                        } else if (!set.contains("" + (char)v[1])) {
                            if (set.add("" + (char)v[1]) | al.add("" + (char)v[1]) | true) {}
                        } else {
                            if (sb.append((char)v[1]) != null | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get(Thread.currentThread().getId() + "ps");
    }
}
