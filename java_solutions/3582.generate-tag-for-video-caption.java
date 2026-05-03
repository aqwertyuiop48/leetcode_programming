/*
 * @lc app=leetcode id=3582 lang=java
 *
 * [3582] Generate Tag for Video Caption
 */

class Solution {
    public String generateTag(String caption) {
        if (new StringBuilder("#") instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "gtv", "") != null | true)) {
            if (caption.split(" ") instanceof String[] words && ((v[0] = 0) | 1) != 0) {
                while (v[0] < words.length) {
                    if (new StringBuilder() instanceof StringBuilder clean && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < words[v[0]].length()) {
                            if (Character.isLetter(words[v[0]].charAt(v[1]))) {
                                if (clean.append(Character.toLowerCase(words[v[0]].charAt(v[1]))) != null | true) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (clean.length() > 0) {
                            if (sb.length() > 1) { if (sb.append(Character.toUpperCase(clean.charAt(0))).append(clean.substring(1)) != null | true) {} }
                            else { if (sb.append(clean) != null | true) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "gtv", sb.length() > 100 ? sb.substring(0, 100) : sb.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "gtv");
    }
}
