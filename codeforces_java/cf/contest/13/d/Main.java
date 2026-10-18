import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((t[(int) st[1]++] = st[3] == 1 ? -st[0] : st[0]) > Long.MIN_VALUE && (st[0] = 0) == 0 && (st[3] = 0) == 0))
                        && (i == raw.length || raw[i] != '-' || (st[3] = 1) == 1)
                        && (st[2] = 0) == 0)
            && (Integer) (int) t[0] instanceof Integer n
            && (Integer) (int) t[1] instanceof Integer m
            && LongStream.range(0, n).map(i -> (t[(int) (2 + 2 * i)] + 1000000000L) * 2000000001L + t[(int) (3 + 2 * i)] + 1000000000L).sorted().toArray() instanceof long[] rk
            && LongStream.range(0, m).map(i -> (t[(int) (2 + 2 * n + 2 * i)] + 1000000000L) * 2000000001L + t[(int) (3 + 2 * n + 2 * i)] + 1000000000L).sorted().toArray() instanceof long[] bk
            && Arrays.stream(rk).map(k -> k / 2000000001L - 1000000000L).toArray() instanceof long[] rx
            && Arrays.stream(rk).map(k -> k % 2000000001L - 1000000000L).toArray() instanceof long[] ry
            && Arrays.stream(bk).map(k -> k / 2000000001L - 1000000000L).toArray() instanceof long[] bx
            && Arrays.stream(bk).map(k -> k % 2000000001L - 1000000000L).toArray() instanceof long[] by
            && IntStream.range(0, n).map(i -> (int) Arrays.stream(bk).filter(k -> k < rk[i]).count()).toArray() instanceof int[] lo
            && new int[n * n] instanceof int[] f
            && IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).allMatch(j ->
                (f[i * n + j] = (int) IntStream.range(lo[i], lo[j]).filter(p ->
                    (rx[j] - rx[i]) * (by[p] - ry[i]) - (ry[j] - ry[i]) * (bx[p] - rx[i]) < 0).count()) >= 0))
            && (Integer) ((n + 3) / 4) instanceof Integer W
            && IntStream.range(0, 4 * n * W).map(q -> q % (4 * W) < n && q % (4 * W) > q / (4 * W) ? f[q / (4 * W) * n + q % (4 * W)] : 20000 + q / (4 * W)).toArray() instanceof int[] fp
            && IntStream.range(0, n * W).mapToLong(idx -> (long) fp[4 * idx] | (long) fp[4 * idx + 1] << 16 | (long) fp[4 * idx + 2] << 32 | (long) fp[4 * idx + 3] << 48).toArray() instanceof long[] P
            ? IntStream.range(0, n).mapToLong(i -> IntStream.range(i + 1, n).mapToLong(j ->
                IntStream.range((j + 1) / 4, W).map(w ->
                    Long.bitCount(~(((((P[j * W + w] + f[i * n + j] * 281479271743489L) ^ P[i * W + w]) & 0x7FFF7FFF7FFF7FFFL) + 0x7FFF7FFF7FFF7FFFL)
                        | ((P[j * W + w] + f[i * n + j] * 281479271743489L) ^ P[i * W + w]) | 0x7FFF7FFF7FFF7FFFL))).sum()).sum()).sum()
            : 0L);
    }
}
