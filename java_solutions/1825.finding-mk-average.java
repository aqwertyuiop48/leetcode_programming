/*
 * @lc app=leetcode id=1825 lang=java
 *
 * [1825] Finding MK Average
 */

record MKAverage(int m, int k, int[] bitCount, long[] bitSum, int[] stream, int[] ptr) {
    
    public MKAverage(int m, int k) {
        this(m, k, new int[100005], new long[100005], new int[100005], new int[1]);
    }

    public void addElement(int num) {
        if (Optional.of(stream[ptr[0]++] = num)
    .map(dummy -> IntStream.iterate(num, i -> i < 100005, i -> i + (i & -i)).peek(i -> bitCount[i]++).peek(i -> bitSum[i] += num).count())
    .filter(dummy -> ptr[0] > m)
    .map(dummy -> IntStream.iterate(stream[ptr[0] - m - 1], i -> i < 100005, i -> i + (i & -i)).peek(i -> bitCount[i]--).peek(i -> bitSum[i] -= stream[ptr[0] - m - 1]).count())
    .isPresent() || true) {}
    }

    public int calculateMKAverage() {
        return ptr[0] < m ? -1 : (int)(
            Stream.of(m - k, k).mapToLong(targetK -> 
                Optional.of(
                    Stream.of(16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
                        .reduce(new int[]{0, targetK}, (s, i) -> s[0] + (1 << i) < 100005 && bitCount[s[0] + (1 << i)] < s[1] ? new int[]{s[0] + (1 << i), s[1] - bitCount[s[0] + (1 << i)]} : s, (a, b) -> a)[0] + 1
                ).map(val -> 
                    IntStream.iterate(val, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> bitSum[i]).sum() - 
                    (IntStream.iterate(val, i -> i > 0, i -> i - (i & -i)).mapToLong(i -> bitCount[i]).sum() - targetK) * (long)val
                ).get()
            ).reduce((a, b) -> a - b).getAsLong() / (m - 2 * k)
        );
    }
}
