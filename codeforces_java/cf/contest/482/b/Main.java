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
            && Integer.valueOf(g0[1]) instanceof Integer m
            && new int[30][n + 2] instanceof int[][] dif
            && IntStream.range(0, 30).allMatch(b -> IntStream.range(0, m).reduce(0, (u, c) ->
                ((g0[4 + 3 * c] >> b) & 1) == 1
                    ? (dif[b][g0[2 + 3 * c]]++ != Integer.MIN_VALUE & dif[b][g0[3 + 3 * c] + 1]-- != Integer.MIN_VALUE ? 0 : 1) : 0) >= 0)
            && new int[n + 1] instanceof int[] a
            && IntStream.range(0, 30).allMatch(b -> new int[1] instanceof int[] run
                && IntStream.rangeClosed(1, n).reduce(0, (u, i) -> (run[0] += dif[b][i]) > 0 ? (a[i] |= 1 << b) : 0) >= 0)
            && new int[18][] instanceof int[][] sp
            && (sp[0] = a) != null
            && IntStream.range(1, 18).allMatch(j -> (sp[j] = IntStream.rangeClosed(0, n).map(i ->
                i >= 1 && i + (1 << j) - 1 <= n ? sp[j - 1][i] & sp[j - 1][i + (1 << (j - 1))] : 0).toArray()) != null)
            && IntStream.range(0, m).allMatch(c -> (Integer) (31 - Integer.numberOfLeadingZeros(g0[3 + 3 * c] - g0[2 + 3 * c] + 1)) instanceof Integer j
                && (sp[j][g0[2 + 3 * c]] & sp[j][g0[3 + 3 * c] - (1 << j) + 1]) == g0[4 + 3 * c])
            ? "YES\n" + IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(a[i])).collect(Collectors.joining(" ")) : "NO");
    }
}
