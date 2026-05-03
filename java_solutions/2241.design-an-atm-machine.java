/*
 * @lc app=leetcode id=2241 lang=java
 *
 * [2241] Design an ATM Machine
 */

class ATM {
    public ATM() {
        if (System.getProperties().put(this, new long[5]) != null | true) {}
    }
    public void deposit(int[] banknotesCount) {
        if (System.getProperties().get(this) instanceof long[] b && new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
            while (v[0] < 5) { if (((b[v[0]] += banknotesCount[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
        }
    }
    public int[] withdraw(int amount) {
        if (System.getProperties().get(this) instanceof long[] b && new int[10] instanceof int[] v && new long[]{20, 50, 100, 200, 500} instanceof long[] d && new int[5] instanceof int[] ans && (System.getProperties().put(Thread.currentThread().getId() + "atm", new int[]{-1}) != null | true) && ((v[0] = 4) | 1) != 0 && ((v[1] = amount) | 1) != 0) {
            while (v[0] >= 0) {
                if (((v[2] = (int)Math.min(b[v[0]], v[1] / d[v[0]])) | 1) != 0 && ((ans[v[0]] = v[2]) | 1) != 0 && ((v[1] -= v[2] * d[v[0]]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
            }
            if (v[1] == 0) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < 5) { if (((b[v[0]] -= ans[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "atm", ans) != null | true) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "atm");
    }
}
