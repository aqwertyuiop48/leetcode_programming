import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && Integer.valueOf(v[2]) instanceof Integer k
            && new long[m + 2] instanceof long[] c
            && IntStream.range(0, k).allMatch(q -> (c[v[3 + n + 3 * m + 2 * q] - 1]++) >= Long.MIN_VALUE && (c[v[4 + n + 3 * m + 2 * q]]--) <= Long.MAX_VALUE)
            && new long[n + 2] instanceof long[] d && new long[]{0} instanceof long[] run
            && IntStream.range(0, m).allMatch(i -> (run[0] += c[i]) > Long.MIN_VALUE
                && (d[v[3 + n + 3 * i] - 1] += run[0] * v[5 + n + 3 * i]) > Long.MIN_VALUE && (d[v[4 + n + 3 * i]] -= run[0] * v[5 + n + 3 * i]) < Long.MAX_VALUE)
            && new long[]{0} instanceof long[] acc && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n).allMatch(i -> sb.append(v[3 + i] + (acc[0] += d[i])).append(' ') != null)
            ? sb : "");
    }
}
