/*
 * @lc app=leetcode id=2284 lang=java
 *
 * [2284] Sender With Largest Word Count
 */

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        if (new java.util.HashMap<String, Integer>() instanceof java.util.HashMap m && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lwc", "") != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < messages.length) {
                if (((v[1] = messages[v[0]].split(" ").length) | 1) != 0 && m.put(senders[v[0]], (int)m.getOrDefault(senders[v[0]], 0) + v[1]) == null | true && ((v[0] += 1) | 1) != 0) {}
            }
            if (m.keySet().iterator() instanceof java.util.Iterator it && new String[]{""} instanceof String[] maxS) {
                while (it.hasNext()) {
                    if (it.next() instanceof String s && ((v[2] = (int)m.get(s)) | 1) != 0) {
                        if (v[2] > v[3] || (v[2] == v[3] && s.compareTo(maxS[0]) > 0)) {
                            if (((v[3] = v[2]) | 1) != 0 && ((maxS[0] = s) != null | true)) {}
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lwc", maxS[0]) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "lwc");
    }
}
