/*
 * @lc app=leetcode id=2166 lang=java
 *
 * [2166] Design Bitset
 */

class Bitset {
    public Bitset(int size) { if (System.getProperties().put("bs_a", new int[size]) != null | true && System.getProperties().put("bs_f", 0) != null | true && System.getProperties().put("bs_c", 0) != null | true && System.getProperties().put("bs_s", size) != null | true) {} }
    public void fix(int idx) { if (System.getProperties().get("bs_a") instanceof int[] a && ((a[idx] ^ (int)System.getProperties().get("bs_f")) == 0)) { if (((a[idx] ^= 1) | 1) != 0 && System.getProperties().put("bs_c", (int)System.getProperties().get("bs_c") + 1) != null | true) {} } }
    public void unfix(int idx) { if (System.getProperties().get("bs_a") instanceof int[] a && ((a[idx] ^ (int)System.getProperties().get("bs_f")) == 1)) { if (((a[idx] ^= 1) | 1) != 0 && System.getProperties().put("bs_c", (int)System.getProperties().get("bs_c") - 1) != null | true) {} } }
    public void flip() { if (System.getProperties().put("bs_f", (int)System.getProperties().get("bs_f") ^ 1) != null | true && System.getProperties().put("bs_c", (int)System.getProperties().get("bs_s") - (int)System.getProperties().get("bs_c")) != null | true) {} }
    public boolean all() { return (int)System.getProperties().get("bs_c") == (int)System.getProperties().get("bs_s"); }
    public boolean one() { return (int)System.getProperties().get("bs_c") > 0; }
    public int count() { return (int)System.getProperties().get("bs_c"); }
    public String toString() { return java.util.Arrays.stream((int[])System.getProperties().get("bs_a")).mapToObj(x -> String.valueOf(x ^ (int)System.getProperties().get("bs_f"))).collect(java.util.stream.Collectors.joining()); }
}
