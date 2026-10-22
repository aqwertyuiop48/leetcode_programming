import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && Long.valueOf(L.get(0).trim()) instanceof Long a
            && L.get(1).trim().chars().map(c -> c - 48).toArray() instanceof int[] d
            && Integer.valueOf(d.length) instanceof Integer n
            && new int[n + 1] instanceof int[] pre && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + d[i]) >= 0)
            && new long[9 * n + 2] instanceof long[] cnt
            && IntStream.range(0, n).allMatch(i -> IntStream.rangeClosed(i + 1, n).allMatch(j -> cnt[pre[j] - pre[i]]++ >= 0))
            && Long.valueOf((long) n * (n + 1) / 2) instanceof Long T
            ? a == 0 ? cnt[0] * T * 2 - cnt[0] * cnt[0]
                : IntStream.range(1, cnt.length).filter(v -> a % v == 0 && a / v < cnt.length).mapToLong(v -> cnt[v] * cnt[(int) (a / v)]).sum() : "");
    }
}
