import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(n * m) instanceof Integer nm
            && String.join("", Arrays.copyOfRange(t, 2, 2 + n)).getBytes() instanceof byte[] g
            ? IntStream.range(0, nm).map(s ->
                IntStream.range(0, nm).map(c -> c == s ? 0 : 1 << 20).toArray() instanceof int[] d
                && new int[4 * nm + 8] instanceof int[] dq
                && new int[]{2 * nm + 2, 2 * nm + 2} instanceof int[] st
                && (dq[st[1]++] = s) >= 0
                && IntStream.range(0, 3 * nm + 8).filter(step ->
                    st[0] < st[1]
                    && (Integer) dq[st[0]++] instanceof Integer u
                    && (Integer) (u % m) instanceof Integer col
                    && ((u >= m && d[u] + (g[u - m] == g[u] ? 0 : 1) < d[u - m] && (d[u - m] = d[u] + (g[u - m] == g[u] ? 0 : 1)) >= 0 && (g[u - m] == g[u] ? (dq[--st[0]] = u - m) >= 0 : (dq[st[1]++] = u - m) >= 0))
                        | (u + m < nm && d[u] + (g[u + m] == g[u] ? 0 : 1) < d[u + m] && (d[u + m] = d[u] + (g[u + m] == g[u] ? 0 : 1)) >= 0 && (g[u + m] == g[u] ? (dq[--st[0]] = u + m) >= 0 : (dq[st[1]++] = u + m) >= 0))
                        | (col > 0 && d[u] + (g[u - 1] == g[u] ? 0 : 1) < d[u - 1] && (d[u - 1] = d[u] + (g[u - 1] == g[u] ? 0 : 1)) >= 0 && (g[u - 1] == g[u] ? (dq[--st[0]] = u - 1) >= 0 : (dq[st[1]++] = u - 1) >= 0))
                        | (col < m - 1 && d[u] + (g[u + 1] == g[u] ? 0 : 1) < d[u + 1] && (d[u + 1] = d[u] + (g[u + 1] == g[u] ? 0 : 1)) >= 0 && (g[u + 1] == g[u] ? (dq[--st[0]] = u + 1) >= 0 : (dq[st[1]++] = u + 1) >= 0)))
                    && false).count() >= 0
                && (Integer) IntStream.of(d).max().getAsInt() instanceof Integer e
                ? e + ((g[s] == 'B') == (e % 2 == 0) ? 1 : 0)
                : 0).min().getAsInt()
            : 0);
    }
}

