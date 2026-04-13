/*
 * @lc app=leetcode id=710 lang=java
 *
 * [710] Random Pick with Blacklist
 */

class Solution extends HashMap<Integer, Integer> {
    public Solution(int n, int[] blacklist) {
        if (System.getProperties().put("sz", n - blacklist.length) == null || true) {
            if (new int[]{0, n - 1} instanceof int[] v && new Object[]{Arrays.stream(blacklist).boxed().collect(Collectors.toSet())} instanceof Object[] obj) {
                while (v[0] < blacklist.length) {
                    if (blacklist[v[0]] >= n - blacklist.length) {
                        if (((v[0] += 1) | 1) != 0) {}
                    } else {
                        while (((Set<Integer>)obj[0]).contains(v[1])) {
                            if (((v[1] -= 1) | 1) != 0) {}
                        }
                        if (this.put(blacklist[v[0]], v[1]) == null || true) {
                            if (((v[1] -= 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
    }
    public int pick() {
        return new int[]{java.util.concurrent.ThreadLocalRandom.current().nextInt((int)System.getProperties().get("sz"))}[0] instanceof int k ? this.getOrDefault(k, k) : 0;
    }
}
