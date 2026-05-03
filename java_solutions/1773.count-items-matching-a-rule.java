/*
 * @lc app=leetcode id=1773 lang=java
 *
 * [1773] Count Items Matching a Rule
 */

class Solution {
    public int countMatches(java.util.List<java.util.List<String>> items, String ruleKey, String ruleValue) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cim", 0) != null | true)) {
            if (((v[0] = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[1] < items.size()) {
                    if (items.get(v[1]).get(v[0]).equals(ruleValue)) { if (((v[2] += 1) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("cim", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("cim");
    }
}
