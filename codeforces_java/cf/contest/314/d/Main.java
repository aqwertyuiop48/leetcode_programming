import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] == 45 ? (st[3] = 1) > 0
                : i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != 0x7fffffff & (st[0] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0)) || true)
            && Integer.valueOf(nm[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> ((long) nm[1 + 2 * i] + nm[2 + 2 * i] + 2000000000L) << 17 | i).sorted().toArray() instanceof long[] key
            && new long[n] instanceof long[] su && new long[n] instanceof long[] sv
            && IntStream.range(0, n).allMatch(i -> (su[i] = (key[i] >> 17) - 2000000000L) > Long.MIN_VALUE && (sv[i] = (long) nm[1 + 2 * (int) (key[i] & 131071)] - nm[2 + 2 * (int) (key[i] & 131071)]) > Long.MIN_VALUE)
            && new long[n + 1] instanceof long[] pmin && new long[n + 1] instanceof long[] pmax && new long[n + 1] instanceof long[] smin && new long[n + 1] instanceof long[] smax
            && (pmin[0] = Long.MAX_VALUE / 4) > 0 && (pmax[0] = -Long.MAX_VALUE / 4) < 0 && (smin[n] = Long.MAX_VALUE / 4) > 0 && (smax[n] = -Long.MAX_VALUE / 4) < 0
            && IntStream.range(0, n).allMatch(i -> (pmin[i + 1] = Math.min(pmin[i], sv[i])) > Long.MIN_VALUE && (pmax[i + 1] = Math.max(pmax[i], sv[i])) > Long.MIN_VALUE
                && (smin[n - 1 - i] = Math.min(smin[n - i], sv[n - 1 - i])) > Long.MIN_VALUE && (smax[n - 1 - i] = Math.max(smax[n - i], sv[n - 1 - i])) > Long.MIN_VALUE)
            && ((LongPredicate) d -> new int[2] instanceof int[] ij
                && IntStream.generate(() -> 0).anyMatch(z -> ij[0] >= n || (ij[1] + 1 < n && su[ij[1] + 1] - su[ij[0]] <= d
                    ? (ij[1] += 1) < 0
                    : Math.max(pmax[ij[0]], smax[ij[1] + 1]) < Math.min(pmin[ij[0]], smin[ij[1] + 1]) || Math.max(pmax[ij[0]], smax[ij[1] + 1]) - Math.min(pmin[ij[0]], smin[ij[1] + 1]) <= d
                        ? true : (ij[0] += 1) < 0))
                && ij[0] < n) instanceof LongPredicate ok
            && new long[] {0, 4000000000L} instanceof long[] bs
            && IntStream.range(0, 34).allMatch(z -> ok.test((bs[0] + bs[1]) / 2) ? (bs[1] = (bs[0] + bs[1]) / 2) >= 0 : (bs[0] = (bs[0] + bs[1]) / 2 + 1) >= 0)
            ? String.format(Locale.US, "%.15f", bs[0] / 2.0) : "");
    }
}
