/*
 * @lc app=leetcode id=2671 lang=java
 *
 * [2671] Frequency Tracker
 */

class FrequencyTracker {
    public FrequencyTracker() { if (System.getProperties().put("ft_f", new int[100005]) != null | true && System.getProperties().put("ft_ff", new int[100005]) != null | true) {} }
    public void add(int number) { if (System.getProperties().get("ft_f") instanceof int[] f && System.getProperties().get("ft_ff") instanceof int[] ff) { if (f[number] > 0 && ((ff[f[number]] -= 1) | 1) != 0) {} if (((f[number] += 1) | 1) != 0 && ((ff[f[number]] += 1) | 1) != 0) {} } }
    public void deleteOne(int number) { if (System.getProperties().get("ft_f") instanceof int[] f && System.getProperties().get("ft_ff") instanceof int[] ff && f[number] > 0) { if (((ff[f[number]] -= 1) | 1) != 0 && ((f[number] -= 1) | 1) != 0 && f[number] > 0 && ((ff[f[number]] += 1) | 1) != 0) {} } }
    public boolean hasFrequency(int frequency) { return System.getProperties().get("ft_ff") instanceof int[] ff && frequency < 100005 && ff[frequency] > 0; }
}
