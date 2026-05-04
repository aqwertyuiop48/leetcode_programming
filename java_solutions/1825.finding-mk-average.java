/*
 * @lc app=leetcode id=1825 lang=java
 *
 * [1825] Finding MK Average
 */

record MKAverage(int m, int k, Object... s) {
    public MKAverage {
        if ((s = new Object[]{new int[100005], new int[100005], new int[100005], new int[1]}) != null) {}
    }
    public void addElement(int num) {
        if (java.util.Optional.of(((int[])s[2])[((int[])s[3])[0]++] = num).map(dummy -> java.util.stream.IntStream.iterate(num, i -> i < 100005, i -> i + (i & -i)).map(i -> (((int[])s[0])[i]++) * 0 + (((int[])s[1])[i] += num)).count()).filter(dummy -> ((int[])s[3])[0] > m).map(dummy -> java.util.stream.IntStream.iterate(((int[])s[2])[((int[])s[3])[0] - m - 1], i -> i < 100005, i -> i + (i & -i)).map(i -> (((int[])s[0])[i]--) * 0 + (((int[])s[1])[i] -= ((int[])s[2])[((int[])s[3])[0] - m - 1])).count()).isPresent() || true) {}
    }
    public int calculateMKAverage() {
        return ((int[])s[3])[0] < m ? -1 : (int)(java.util.stream.Stream.of(m - k, k).mapToLong(tK -> java.util.Optional.of(java.util.stream.Stream.of(16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0).reduce(new int[]{0, tK}, (st, i) -> st[0] + (1 << i) < 100005 && ((int[])s[0])[st[0] + (1 << i)] < st[1] ? new int[]{st[0] + (1 << i), st[1] - ((int[])s[0])[st[0] + (1 << i)]} : st, (a, b) -> a)[0] + 1).map(val -> java.util.stream.IntStream.iterate(val, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> ((int[])s[1])[i]).sum() - (java.util.stream.IntStream.iterate(val, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> ((int[])s[0])[i]).sum() - tK) * (long)val).get()).reduce((a, b) -> a - b).getAsLong() / (m - 2 * k));
    }
}