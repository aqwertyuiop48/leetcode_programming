import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long k
            && new int[][]{IntStream.range(0, n).map(v -> (int) t[2 + v]).toArray()} instanceof int[][] up
            && new long[][]{IntStream.range(0, n).mapToLong(v -> t[2 + n + v]).toArray()} instanceof long[][] sm
            && new int[][]{IntStream.range(0, n).map(v -> (int) t[2 + n + v]).toArray()} instanceof int[][] mn
            && IntStream.range(0, n).toArray() instanceof int[] pos && new long[n] instanceof long[] rs && new int[n] instanceof int[] rm
            && IntStream.range(0, n).filter(v -> (rm[v] = Integer.MAX_VALUE) < 0).count() == 0
            && IntStream.rangeClosed(0, 34).allMatch(j ->
                IntStream.range(0, n).filter(v -> (k >> j & 1) == 1 && (rs[v] += sm[0][pos[v]]) + (rm[v] = Math.min(rm[v], mn[0][pos[v]])) + (pos[v] = up[0][pos[v]]) < 0).count() == 0
                && up[0] instanceof int[] u && sm[0] instanceof long[] s && mn[0] instanceof int[] m
                && IntStream.range(0, n).map(v -> u[u[v]]).toArray() instanceof int[] nu
                && IntStream.range(0, n).mapToLong(v -> s[v] + s[u[v]]).toArray() instanceof long[] ns
                && IntStream.range(0, n).map(v -> Math.min(m[v], m[u[v]])).toArray() instanceof int[] nm
                && (up[0] = nu) != null && (sm[0] = ns) != null && (mn[0] = nm) != null)
            ? IntStream.range(0, n).mapToObj(v -> rs[v] + " " + rm[v]).collect(Collectors.joining("\n")) : "");
    }
}
