/*
 * @lc app=leetcode id=2456 lang=java
 *
 * [2456] Most Popular Video Creator
 */

class Solution {
    public java.util.List<java.util.List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        if (System.getProperties().put("mpvc_sv", new java.util.HashMap<String, Long>()) != null | true && System.getProperties().put("mpvc_mid", new java.util.HashMap<String, String>()) != null | true && System.getProperties().put("mpvc_mv", new java.util.HashMap<String, Integer>()) != null | true && new int[10] instanceof int[] v && new long[5] instanceof long[] lv) {
            if (System.getProperties().get("mpvc_sv") instanceof java.util.Map sv && System.getProperties().get("mpvc_mid") instanceof java.util.Map mid && System.getProperties().get("mpvc_mv") instanceof java.util.Map mv && ((v[0] = 0) | 1) != 0 && ((lv[0] = -1L) | 1) != 0) {
                while (v[0] < creators.length) {
                    if (sv.put(creators[v[0]], (long)sv.getOrDefault(creators[v[0]], 0L) + views[v[0]]) == null | true) {
                        if ((long)sv.get(creators[v[0]]) > lv[0]) { if (((lv[0] = (long)sv.get(creators[v[0]])) | 1) != 0) {} }
                        if (!mv.containsKey(creators[v[0]]) || views[v[0]] > (int)mv.get(creators[v[0]]) || (views[v[0]] == (int)mv.get(creators[v[0]]) && ids[v[0]].compareTo((String)mid.get(creators[v[0]])) < 0)) {
                            if (mv.put(creators[v[0]], views[v[0]]) == null | true && mid.put(creators[v[0]], ids[v[0]]) == null | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mpvc_ans", new java.util.ArrayList<java.util.List<String>>()) != null | true && System.getProperties().get("mpvc_ans") instanceof java.util.List ans && ((v[0] = 0) | 1) != 0 && new Object[]{sv.keySet().toArray(new String[0])} instanceof Object[] k && k[0] instanceof String[] keys) {
                    while (v[0] < keys.length) {
                        if ((long)sv.get(keys[v[0]]) == lv[0]) { if (ans.add(java.util.Arrays.asList(keys[v[0]], (String)mid.get(keys[v[0]]))) | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<java.util.List<String>>) System.getProperties().get("mpvc_ans");
    }
}
