import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((nums[(int) st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Long.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && Integer.valueOf((int) nums[1 + 5 * n]) instanceof Integer m
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> nums[5 + 5 * i])).mapToInt(i -> i).toArray() instanceof int[] byZ
            && LongStream.range(0, m).map(t -> nums[2 + 5 * n + 2 * (int) t]).toArray() instanceof long[] sx
            && LongStream.range(0, m).map(t -> nums[3 + 5 * n + 2 * (int) t]).toArray() instanceof long[] sy
            && LongStream.range(0, m).map(t -> ((sx[(int) t] + (1L << 31)) << 17) | t).sorted().toArray() instanceof long[] keysX
            && Arrays.stream(keysX).mapToInt(k -> (int) (k & 131071)).toArray() instanceof int[] tOf
            && Arrays.stream(keysX).mapToDouble(k -> (k >> 17) - (1L << 31)).toArray() instanceof double[] xsD
            && Arrays.stream(sy).sorted().asDoubleStream().toArray() instanceof double[] ysD
            && new int[m] instanceof int[] posOf
            && IntStream.range(0, m).allMatch(p -> (posOf[tOf[p]] = p) >= 0)
            && new boolean[m] instanceof boolean[] dead
            && ((ToIntBiFunction<double[], Double>) (arr, v) -> -Arrays.binarySearch(arr, v) - 1) instanceof ToIntBiFunction<double[], Double> lb
            && LongStream.range(0, Math.max(16, Integer.highestOneBit(Math.max(1, m - 1)) * 2)).map(p ->
                p < m ? ((long) lb.applyAsInt(ysD, (double) sy[tOf[(int) p]] - 0.5) << 17) | tOf[(int) p]
                      : ((long) m << 17) | 131071).toArray() instanceof long[] ky
            && Integer.valueOf(ky.length) instanceof Integer N
            && Integer.valueOf(Integer.numberOfTrailingZeros(N)) instanceof Integer LOG
            && IntStream.rangeClosed(0, LOG).mapToObj(L -> L < 4 ? new long[0] : LongStream.range(0, N).map(p -> ((p >> L) << 36) | ky[(int) p]).sorted().toArray()).toArray(long[][]::new) instanceof long[][] K
            && IntStream.rangeClosed(0, LOG).mapToObj(L -> new int[L < 4 ? 0 : N]).toArray(int[][]::new) instanceof int[][] loc
            && IntStream.rangeClosed(4, LOG).allMatch(L -> IntStream.range(0, N).allMatch(i ->
                (K[L][i] & 131071) >= m || (loc[L][posOf[(int) (K[L][i] & 131071)]] = i) >= 0))
            && IntStream.rangeClosed(0, LOG).mapToObj(L -> new int[L < 4 ? 0 : 2 * N]).toArray(int[][]::new) instanceof int[][] seg
            && IntStream.rangeClosed(4, LOG).allMatch(L ->
                IntStream.range(0, N).allMatch(i -> (seg[L][N + i] = (K[L][i] & 131071) >= m ? Integer.MAX_VALUE : (int) (K[L][i] & 131071)) >= 0)
                && IntStream.iterate(N - 1, j -> j >= 1, j -> j - 1).allMatch(j -> (seg[L][j] = Math.min(seg[L][2 * j], seg[L][2 * j + 1])) >= 0))
            && ((ToIntFunction<int[]>) q ->
                    (Integer) (-Arrays.binarySearch(K[q[0]], ((long) q[1] << 36 | (long) q[2] << 17) - 1) - 1) instanceof Integer a
                    && (Integer) (-Arrays.binarySearch(K[q[0]], ((long) q[1] << 36 | (long) q[3] << 17) - 1) - 1) instanceof Integer b
                    ? Stream.iterate(new int[]{a + N, b + N}, s -> s[0] < s[1], s -> new int[]{(s[0] + (s[0] & 1)) >> 1, (s[1] - (s[1] & 1)) >> 1})
                        .mapToInt(s -> Math.min((s[0] & 1) == 1 ? seg[q[0]][s[0]] : Integer.MAX_VALUE, (s[1] & 1) == 1 ? seg[q[0]][s[1] - 1] : Integer.MAX_VALUE))
                        .min().orElse(Integer.MAX_VALUE)
                    : Integer.MAX_VALUE) instanceof ToIntFunction<int[]> bm
            && new int[m] instanceof int[] hit
            && Arrays.stream(byZ).allMatch(r ->
                (Integer) lb.applyAsInt(xsD, (double) nums[1 + 5 * r] - 0.5) instanceof Integer lo
                && (Integer) lb.applyAsInt(xsD, (double) nums[2 + 5 * r] + 0.5) instanceof Integer hi
                && (Integer) lb.applyAsInt(ysD, (double) nums[3 + 5 * r] - 0.5) instanceof Integer yl
                && (Integer) lb.applyAsInt(ysD, (double) nums[4 + 5 * r] + 0.5) instanceof Integer yh
                && (Integer) ((lo + 15) >> 4) instanceof Integer bl
                && (Integer) (hi >> 4) instanceof Integer bh
                && (Integer) Math.min(
                    IntStream.concat(IntStream.range(lo, bl < bh ? bl << 4 : hi), IntStream.range(bl < bh ? bh << 4 : hi, hi))
                        .map(p -> tOf[p]).filter(t -> !dead[t] && sy[t] >= nums[3 + 5 * r] && sy[t] <= nums[4 + 5 * r]).min().orElse(Integer.MAX_VALUE),
                    bl >= bh ? Integer.MAX_VALUE
                    : Stream.iterate(new int[]{bl, bh, 4}, s -> s[0] < s[1], s -> new int[]{(s[0] + (s[0] & 1)) >> 1, (s[1] - (s[1] & 1)) >> 1, s[2] + 1})
                        .mapToInt(s -> Math.min(
                            (s[0] & 1) == 1 ? bm.applyAsInt(new int[]{s[2], s[0], yl, yh}) : Integer.MAX_VALUE,
                            (s[1] & 1) == 1 ? bm.applyAsInt(new int[]{s[2], s[1] - 1, yl, yh}) : Integer.MAX_VALUE))
                        .min().orElse(Integer.MAX_VALUE)) instanceof Integer t
                && (t == Integer.MAX_VALUE
                    || ((hit[t] = r + 1) > 0
                        && (dead[t] = true)
                        && IntStream.rangeClosed(4, LOG).allMatch(L ->
                            (seg[L][N + loc[L][posOf[t]]] = Integer.MAX_VALUE) > 0
                            && IntStream.iterate((N + loc[L][posOf[t]]) >> 1, j -> j >= 1, j -> j >> 1).allMatch(j -> (seg[L][j] = Math.min(seg[L][2 * j], seg[L][2 * j + 1])) >= 0)))))
            ? Arrays.stream(hit).mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}




