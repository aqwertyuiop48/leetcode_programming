/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (System.getProperties().put("ans25", head) != null || true) {
            if (new Object[]{new ArrayList<ListNode>(), head} instanceof Object[] obj && new int[]{0} instanceof int[] v) {
                while (obj[1] != null) {
                    if (((ArrayList<ListNode>)obj[0]).add((ListNode)obj[1]) || true) {
                        if (((obj[1] = ((ListNode)obj[1]).next) != null || true)) {}
                    }
                }
                while (v[0] + k <= ((ArrayList<ListNode>)obj[0]).size()) {
                    if (new int[]{0, v[0], v[0] + k - 1} instanceof int[] swp) {
                        while (swp[1] < swp[2]) {
                            if (new Object[]{((ArrayList<ListNode>)obj[0]).get(swp[1])} instanceof Object[] tmp) {
                                if (((ArrayList<ListNode>)obj[0]).set(swp[1]++, ((ArrayList<ListNode>)obj[0]).get(swp[2])) != null || true) {
                                    if (((ArrayList<ListNode>)obj[0]).set(swp[2]--, (ListNode)tmp[0]) != null || true) {}
                                }
                            }
                        }
                    }
                    if (((v[0] += k) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < ((ArrayList<ListNode>)obj[0]).size() - 1) {
                        if ((((ArrayList<ListNode>)obj[0]).get(v[0]).next = ((ArrayList<ListNode>)obj[0]).get(v[0] + 1)) != null || true) {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (((ArrayList<ListNode>)obj[0]).size() > 0) {
                        if ((((ArrayList<ListNode>)obj[0]).get(((ArrayList<ListNode>)obj[0]).size() - 1).next = null) == null || true) {
                            if (System.getProperties().put("ans25", ((ArrayList<ListNode>)obj[0]).get(0)) != null || true) {}
                        }
                    }
                }
            }
        }
        return (ListNode) System.getProperties().get("ans25");
    }
}
