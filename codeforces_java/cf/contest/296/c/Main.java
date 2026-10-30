import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[(int) st[1]++] = (int) st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && Integer.valueOf(v[2]) instanceof Integer k
            && new long[m + 2] instanceof long[] c
            && IntStream.range(0, k).allMatch(i -> ++c[v[3 + n + 3 * m + 2 * i] - 1] > Long.MIN_VALUE && --c[v[4 + n + 3 * m + 2 * i]] < Long.MAX_VALUE)
            && new long[n + 2] instanceof long[] d && new long[1] instanceof long[] run
            && IntStream.range(0, m).allMatch(i -> (run[0] += c[i]) > Long.MIN_VALUE && (d[v[3 + n + 3 * i] - 1] += run[0] * v[5 + n + 3 * i]) > Long.MIN_VALUE && (d[v[4 + n + 3 * i]] -= run[0] * v[5 + n + 3 * i]) < Long.MAX_VALUE)
            && new long[1] instanceof long[] acc
            ? IntStream.range(0, n).mapToObj(i -> "" + (v[3 + i] + (acc[0] += d[i]))).collect(Collectors.joining(" ")) : "");
    }
}
