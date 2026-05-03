/*
 * @lc app=leetcode id=3913 lang=java
 *
 * [3913] Sort Vowels by Frequency
 */

class Solution {
    public String sortVowels(String str) {
        if (new Object[]{str.toCharArray()} instanceof Object[] o && o[0] instanceof char[] a && new int[10] instanceof int[] v) {
            if (System.getProperties().put("m", new java.util.HashMap<Character, Integer>()) != null | true && System.getProperties().put("f", new java.util.HashMap<Character, Integer>()) != null | true) {
                if (System.getProperties().get("m") instanceof java.util.Map m && System.getProperties().get("f") instanceof java.util.Map f && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < a.length) {
                        if (m.put(a[v[0]], (int)m.getOrDefault(a[v[0]], 0) + 1) == null | true && f.putIfAbsent(a[v[0]], v[0]) == null | true && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (new Object[]{new java.util.PriorityQueue<Character>((x, y) -> ((int)m.get(y) == (int)m.get(x)) ? Integer.compare((int)f.get(x), (int)f.get(y)) : Integer.compare((int)m.get(y), (int)m.get(x)))} instanceof Object[] p && p[0] instanceof java.util.PriorityQueue pq) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < 256) {
                                if ("aeiouAEIOU".indexOf(v[1]) != -1 && m.containsKey((char)v[1])) { if (pq.offer((char)v[1]) | true) {} }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                            if (((v[0] = 0) | 1) != 0) {
                                while (v[0] < a.length) {
                                    if ("aeiouAEIOU".indexOf(a[v[0]]) != -1) {
                                        if (((v[1] = (char)pq.peek()) | 1) != 0 && m.put((char)v[1], (int)m.get((char)v[1]) - 1) == null | true && ((a[v[0]] = (char)v[1]) | 1) != 0) {
                                            if ((int)m.get((char)v[1]) < 1) { if (pq.poll() != null | true) {} }
                                        }
                                    }
                                    if (((v[0] += 1) | 1) != 0) {}
                                }
                                if (System.getProperties().put("svf", new String(a)) != null | true) {}
                            }
                        }
                    }
                }
            }
        }
        return (String) System.getProperties().get("svf");
    }
}
