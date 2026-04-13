/*
 * @lc app=leetcode id=745 lang=java
 *
 * [745] Prefix and Suffix Search
 */

class WordFilter {
    public WordFilter(String[] words) {
        if ((System.getProperties().get("WFK") == null ? System.getProperties().put("WFK", new long[4194304]) : null) == null | true) {
            if ((System.getProperties().get("WFV") == null ? System.getProperties().put("WFV", new int[4194304]) : null) == null | true) {
                if ((System.getProperties().get("WFTC") == null ? System.getProperties().put("WFTC", new int[4194304]) : null) == null | true) {
                    if ((System.getProperties().get("WFID") == null ? System.getProperties().put("WFID", new int[]{0}) : null) == null | true) {
                        if (System.getProperties().get("WFK") instanceof long[] K && System.getProperties().get("WFV") instanceof int[] V && System.getProperties().get("WFTC") instanceof int[] TC && new int[10] instanceof int[] v && new long[5] instanceof long[] lv) {
                            if (((v[9] = ++((int[])System.getProperties().get("WFID"))[0]) | 1) != 0 && (System.getProperties().put(System.identityHashCode(this) + "id", v[9]) != null | true)) {
                                while (v[0] < words.length) {
                                    if (((v[1] = 0) | 1) != 0) {}
                                    while (v[1] <= words[v[0]].length()) {
                                        if (((v[2] = 0) | 1) != 0) {}
                                        while (v[2] <= words[v[0]].length()) {
                                            if (((lv[0] = 0) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {}
                                            while (v[3] < words[v[0]].length()) {
                                                if (((lv[0] = lv[0] * 131L + (words[v[0]].charAt(v[3]) - 'a' + 1)) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                            }
                                            if (((lv[0] = lv[0] * 131L + 27) | 1) != 0 && ((v[3] = 0) | 1) != 0) {}
                                            while (v[3] < v[2]) {
                                                if (((lv[0] = lv[0] * 131L + (words[v[0]].charAt(v[3]) - 'a' + 1)) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                            }
                                            if (((v[4] = (int)(lv[0] & 4194303)) | 1) != 0) {}
                                            while (TC[v[4]] == v[9] && K[v[4]] != lv[0]) {
                                                if (((v[4] = (v[4] + 1) & 4194303) | 1) != 0) {}
                                            }
                                            if (((TC[v[4]] = v[9]) | 1) != 0 && ((K[v[4]] = lv[0]) | 1) != 0 && ((V[v[4]] = v[0]) | 1) != 0) {}
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                    if (((v[0] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public int f(String pref, String suff) {
        if (System.getProperties().get("WFK") instanceof long[] K && System.getProperties().get("WFV") instanceof int[] V && System.getProperties().get("WFTC") instanceof int[] TC && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "wfa", -1) != null | true)) {
            if (System.getProperties().get(System.identityHashCode(this) + "id") instanceof Integer ID) {
                if (((lv[0] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                while (v[0] < suff.length()) {
                    if (((lv[0] = lv[0] * 131L + (suff.charAt(v[0]) - 'a' + 1)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((lv[0] = lv[0] * 131L + 27) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                while (v[0] < pref.length()) {
                    if (((lv[0] = lv[0] * 131L + (pref.charAt(v[0]) - 'a' + 1)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[4] = (int)(lv[0] & 4194303)) | 1) != 0) {}
                while (TC[v[4]] == ID && (int) System.getProperties().get(Thread.currentThread().getId() + "wfa") == -1) {
                    if (K[v[4]] == lv[0]) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "wfa", V[v[4]]) != null | true) {}
                    }
                    if (((v[4] = (v[4] + 1) & 4194303) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "wfa");
    }
}
