import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && new int[30 * 30 * 51] instanceof int[] d
                && IntStream.range(0, 30 * 30 * 51).filter(idx -> (Integer) (idx / 1530 + 1) instanceof Integer n && (Integer) (idx / 51 % 30 + 1) instanceof Integer m && (Integer) (idx % 51) instanceof Integer k && (Integer) (k + 1) instanceof Integer K && k > 0 && k < n * m
                        && (d[idx] = n > m ? d[((m - 1) * 30 + n - 1) * 51 + k]
                        : Math.min(IntStream.range(0, (n / 2) * K).map(t -> t % K <= (t / K + 1) * m && k - t % K <= (n - t / K - 1) * m ? m * m + d[(t / K * 30 + m - 1) * 51 + t % K] + d[((n - t / K - 2) * 30 + m - 1) * 51 + k - t % K] : 1 << 29).min().orElse(1 << 29),
                                IntStream.range(0, (m / 2) * K).map(t -> t % K <= (t / K + 1) * n && k - t % K <= (m - t / K - 1) * n ? n * n + d[((n - 1) * 30 + t / K) * 51 + t % K] + d[((n - 1) * 30 + m - t / K - 2) * 51 + k - t % K] : 1 << 29).min().orElse(1 << 29))) >= 0).count() >= 0
                ? IntStream.range(0, o[0]).mapToObj(j -> String.valueOf(d[((o[1 + 3 * j] - 1) * 30 + o[2 + 3 * j] - 1) * 51 + o[3 + 3 * j]])).collect(Collectors.joining("\n")) : "");
    }
}
