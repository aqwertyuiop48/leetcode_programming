import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && new long[n + 1] instanceof long[] c0
            && new long[n + 1] instanceof long[] c1
            && new long[n + 1] instanceof long[] e0
            && new long[n + 1] instanceof long[] e1
            && new long[n + 1] instanceof long[] d1
            && new long[1] instanceof long[] ans
            && IntStream.rangeClosed(1, n).allMatch(v -> (c1[v] = 1) > 0 && (e0[v] = 1) > 0 && (d1[v] = 1) > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (Integer) (n + 1 - i) instanceof Integer v
                && (Long) ((2 * c1[v] - d1[v] + 1000000007L) % 1000000007L) instanceof Long f1
                && (Long) ((2 * c0[v] - e1[v] + 1000000007L) % 1000000007L) instanceof Long f0
                && (v == 1 ? (ans[0] = (f0 + f1) % 1000000007L) >= 0
                    : (Integer) g0[v - 1] instanceof Integer q
                        && (Long) c0[q] instanceof Long a0
                        && (Long) c1[q] instanceof Long a1
                        && (Long) e0[q] instanceof Long b0
                        && (Long) e1[q] instanceof Long b1
                        && (c0[q] = (a0 + a0 * f0 + a1 * f1) % 1000000007L) >= 0
                        && (c1[q] = (a1 + a0 * f1 + a1 * f0) % 1000000007L) >= 0
                        && (e0[q] = (b0 + b1 * f1) % 1000000007L) >= 0
                        && (e1[q] = (b1 + b0 * f1) % 1000000007L) >= 0
                        && (d1[q] = d1[q] * (1 + f0) % 1000000007L) >= 0))
            ? ans[0] : 0);
    }
}
