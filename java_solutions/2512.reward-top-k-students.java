/*
 * @lc app=leetcode id=2512 lang=java
 *
 * [2512] Reward Top K Students
 */

class Solution {
    public java.util.List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        if (System.getProperties().put("rts_p", new java.util.HashSet<String>(java.util.Arrays.asList(positive_feedback))) != null | true && System.getProperties().put("rts_n", new java.util.HashSet<String>(java.util.Arrays.asList(negative_feedback))) != null | true && new int[10] instanceof int[] v && new Object[]{new java.util.ArrayList<int[]>()} instanceof Object[] o && o[0] instanceof java.util.List list) {
            if (System.getProperties().get("rts_p") instanceof java.util.Set p && System.getProperties().get("rts_n") instanceof java.util.Set n && ((v[0] = 0) | 1) != 0) {
                while (v[0] < report.length) {
                    if (new Object[]{report[v[0]].split(" ")} instanceof Object[] sp && sp[0] instanceof String[] w && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < w.length) {
                            if (p.contains(w[v[1]])) { if (((v[2] += 3) | 1) != 0) {} }
                            else if (n.contains(w[v[1]])) { if (((v[2] -= 1) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (list.add(new int[]{student_id[v[0]], v[2]}) | true && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("rts_ans", ((java.util.List<int[]>)list).stream().sorted((a, b) -> a[1] != b[1] ? b[1] - a[1] : a[0] - b[0]).limit(k).map(x -> x[0]).collect(java.util.stream.Collectors.toList())) != null | true) {}
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("rts_ans");
    }
}
