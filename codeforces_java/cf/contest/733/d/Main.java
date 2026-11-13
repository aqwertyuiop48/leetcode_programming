import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(k -> Integer.valueOf(k < raw.length ? raw[k] : 32) instanceof Integer c
                && 0 * (c > 64 ? (v[(int) st[3]++] = c) : c > 47 ? (st[0] = st[0] * 10 + c - 48) + (st[2] = 1) : c == 45 ? (st[1] = -1) : st[2] == 1 ? (v[(int) st[3]++] = st[0] * st[1]) + (st[0] = 0) + (st[1] = 1) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && new long[n] instanceof long[] x && new long[n] instanceof long[] y && new long[n] instanceof long[] key
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(Math.min(v[1 + 3 * i], Math.min(v[2 + 3 * i], v[3 + 3 * i]))) instanceof Long lo
                && Long.valueOf(Math.max(v[1 + 3 * i], Math.max(v[2 + 3 * i], v[3 + 3 * i]))) instanceof Long hi
                && (x[i] = lo) >= 0 && (y[i] = v[1 + 3 * i] + v[2 + 3 * i] + v[3 + 3 * i] - lo - hi) >= 0 && (key[i] = (y[i] << 30) | hi) >= 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> key[i]).thenComparingLong((Integer i) -> -x[i])).mapToInt(Integer::intValue).toArray() instanceof int[] o
            && IntStream.range(0, n).boxed().max(Comparator.comparingLong((Integer i) -> x[i])).get() instanceof Integer s
            && new long[]{x[s], s, -1} instanceof long[] best
            && IntStream.range(1, n).allMatch(k -> key[o[k]] != key[o[k - 1]] || Math.min(x[o[k]] + x[o[k - 1]], y[o[k]]) <= best[0]
                || (best[0] = Math.min(x[o[k]] + x[o[k - 1]], y[o[k]])) + (best[1] = o[k - 1]) + (best[2] = o[k]) != 0)
            ? (best[2] < 0 ? "1\n" + (best[1] + 1) : "2\n" + (best[1] + 1) + " " + (best[2] + 1)) : "");
    }
}
