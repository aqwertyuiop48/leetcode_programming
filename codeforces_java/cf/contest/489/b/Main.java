import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[n + 1]) instanceof Integer m
            && Arrays.stream(g0, 1, n + 1).sorted().toArray() instanceof int[] a
            && Arrays.stream(g0, n + 2, n + 2 + m).sorted().toArray() instanceof int[] b
            && new int[3] instanceof int[] st
            && IntStream.range(0, n + m).allMatch(step ->
                st[0] >= n || st[1] >= m
                || (Math.abs(a[st[0]] - b[st[1]]) <= 1
                    ? st[2]++ >= 0 && st[0]++ >= 0 && st[1]++ >= 0
                    : a[st[0]] < b[st[1]] ? st[0]++ >= 0 : st[1]++ >= 0))
            ? "" + st[2]
            : "");
    }
}
