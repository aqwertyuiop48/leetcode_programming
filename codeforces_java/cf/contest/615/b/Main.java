import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && new long[m] instanceof long[] ed && new int[n + 1] instanceof int[] deg && new long[n + 1] instanceof long[] dp
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(Math.min(v[2 + 2 * i], v[3 + 2 * i])) instanceof Integer lo && Integer.valueOf(Math.max(v[2 + 2 * i], v[3 + 2 * i])) instanceof Integer hi
                && ++deg[lo] > 0 && ++deg[hi] > 0 && (ed[i] = ((long) hi << 20) | lo) > 0)
            && Stream.of(0).peek(z -> Arrays.sort(ed)).findFirst().isPresent()
            && IntStream.rangeClosed(1, n).allMatch(i -> (dp[i] = 1) > 0)
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf((int) (ed[i] >> 20)) instanceof Integer hi && Integer.valueOf((int) (ed[i] & 1048575)) instanceof Integer lo
                && (dp[hi] = Math.max(dp[hi], dp[lo] + 1)) > 0)
            ? IntStream.rangeClosed(1, n).mapToLong(i -> dp[i] * deg[i]).max().getAsLong() : "");
    }
}
