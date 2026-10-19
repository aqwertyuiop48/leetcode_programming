import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && Long.valueOf(Long.parseLong(L.get(0).trim().split("\\s+")[1])) instanceof Long t
            && L.get(1).trim() instanceof String s
            && Long.valueOf(s.chars().filter(c -> c == 'H').count()) instanceof Long hc
            && Integer.valueOf(hc.intValue()) instanceof Integer h
            && Integer.valueOf(s.lastIndexOf('H') + 1) instanceof Integer lh
            && IntStream.rangeClosed(1, s.length()).filter(i -> s.charAt(i - 1) == 'S').toArray() instanceof int[] sp
            && ((IntToLongFunction) k -> Integer.valueOf(h - k <= 0 ? lh : h - k > sp.length ? -1 : Math.max(lh, sp[h - k - 1])) instanceof Integer R && R > 0
                && new long[]{k, 0, 0, Long.MAX_VALUE} instanceof long[] st
                && IntStream.rangeClosed(1, R).allMatch(i -> s.charAt(i - 1) == 'H' ? (st[0]-- == 0 ? (st[1] = i) > 0 : true)
                    : s.charAt(i - 1) == 'S' ? (++st[0] == 0 ? (st[3] = Math.min(st[3], 2 * R - 1 + 2 * st[2] - st[1])) > -1 && (st[2] += i - st[1]) > -1 : true) : true)
                ? Math.min(st[3], R - 1 + 2 * st[2]) : Long.MAX_VALUE) instanceof IntToLongFunction f
            && new int[]{0, h} instanceof int[] lo
            ? (f.applyAsLong(h) > t ? -1 : IntStream.range(0, 20).allMatch(it -> Integer.valueOf((lo[0] + lo[1]) / 2) instanceof Integer m
                && (f.applyAsLong(m) <= t ? (lo[1] = m) > -1 : (lo[0] = m + 1) > -1)) ? lo[0] : -2) : -3);
    }
}
