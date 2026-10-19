import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] == '-'
                    ? (ps[3] = 1) == 1 && (ps[2] = 1) == 1
                    : i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                        ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                        : (ps[2] != 1 || ((g0[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) != Integer.MIN_VALUE && (ps[0] = 0) == 0 && (ps[3] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer m
            && Arrays.stream(g0, 4, 4 + n).sorted().toArray() instanceof int[] x
            && Arrays.stream(g0, 4 + n, 4 + n + m).sorted().toArray() instanceof int[] c
            && new int[m] instanceof int[] md
            && new int[m] instanceof int[] cnt
            && IntStream.range(0, m).allMatch(i -> (md[i] = Integer.MAX_VALUE) > 0)
            && (m == 0 || IntStream.range(0, n).allMatch(i ->
                (Integer) Arrays.binarySearch(c, x[i]) instanceof Integer r
                && (Integer) (r >= 0 ? r : -r - 1) instanceof Integer j
                && (Integer) (j > 0 ? x[i] - c[j - 1] : Integer.MAX_VALUE) instanceof Integer dl
                && (Integer) (j < m ? c[j] - x[i] : Integer.MAX_VALUE) instanceof Integer dr
                && (Integer) (dl < dr ? j - 1 : dr < dl ? j : (md[j - 1] == Integer.MAX_VALUE || md[j - 1] == dl ? j - 1 : j)) instanceof Integer t
                && (Integer) Math.min(dl, dr) instanceof Integer d
                && (d < md[t] ? (md[t] = d) >= 0 && (cnt[t] = 1) > 0 : d != md[t] || ++cnt[t] > 0)))
            ? n - IntStream.of(cnt).sum()
            : 0);
    }
}
