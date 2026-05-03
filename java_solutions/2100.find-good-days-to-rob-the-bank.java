/*
 * @lc app=leetcode id=2100 lang=java
 *
 * [2100] Find Good Days to Rob the Bank
 */

class Solution {
    public java.util.List<Integer> goodDaysToRobBank(int[] security, int time) {
        if (new int[security.length] instanceof int[] d && new int[security.length] instanceof int[] i && new int[10] instanceof int[] v && (System.getProperties().put("gdrb", new java.util.ArrayList<Integer>()) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < security.length) {
                    if (security[v[0]] <= security[v[0] - 1]) { if (((d[v[0]] = d[v[0] - 1] + 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = security.length - 2) | 1) != 0) {
                    while (v[0] >= 0) {
                        if (security[v[0]] <= security[v[0] + 1]) { if (((i[v[0]] = i[v[0] + 1] + 1) | 1) != 0) {} }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                    if (System.getProperties().get("gdrb") instanceof java.util.List res && ((v[0] = time) | 1) != 0 && ((v[1] = security.length - time) | 1) != 0) {
                        while (v[0] < v[1]) {
                            if (d[v[0]] >= time && i[v[0]] >= time) { if (res.add(v[0]) | true) {} }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("gdrb");
    }
}
