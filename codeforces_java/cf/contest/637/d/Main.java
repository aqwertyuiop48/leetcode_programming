import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && Integer.valueOf(v[2]) instanceof Integer s && Integer.valueOf(v[3]) instanceof Integer d
            && IntStream.range(0, n).map(i -> v[4 + i]).sorted().toArray() instanceof int[] xs
            && new int[]{0, 0} instanceof int[] g && new StringBuilder() instanceof StringBuilder sb
            ? IntStream.range(0, n).allMatch(i -> (i != 0 && xs[i] - xs[i - 1] - 2 < s
                    || (g[1] = xs[i] - 1) - g[0] >= s && sb.append("RUN ").append(g[1] - g[0]).append('\n') != null)
                && (i != n - 1 && xs[i + 1] - xs[i] - 2 < s
                    || xs[i] + 1 - g[1] <= d && sb.append("JUMP ").append(xs[i] + 1 - g[1]).append('\n') != null && (g[0] = xs[i] + 1) > 0))
                && (g[0] >= m || sb.append("RUN ").append(m - g[0]).append('\n') != null) ? sb.toString().trim() : "IMPOSSIBLE"
            : "");
    }
}
