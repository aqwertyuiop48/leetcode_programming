import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer m
            && (Integer) IntStream.range(0, n).map(i -> a[2 + i]).sum() instanceof Integer S
            && new double[S] instanceof double[] dp && new double[S + 1] instanceof double[] pre
            && (dp[0] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> (Integer) a[2 + i] instanceof Integer x
                && IntStream.range(0, S).allMatch(s -> (pre[s + 1] = pre[s] + dp[s]) > -1)
                && IntStream.range(0, S).map(t -> S - 1 - t).allMatch(s -> (dp[s] = (pre[s] - pre[Math.max(0, s - m)] - (s >= x ? dp[s - x] : 0)) / (m - 1)) > -1))
            ? String.format(Locale.US, "%.16f", m == 1 ? 1.0 : 1 + (m - 1) * Arrays.stream(dp).sum()) : "1.0000000000000000");
    }
}
