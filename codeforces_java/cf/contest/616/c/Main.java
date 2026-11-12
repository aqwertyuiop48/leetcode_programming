import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(k -> raw[k] == 10).boxed().findFirst().get() instanceof Integer nl
            && new String(raw, 0, nl).trim().split(" ") instanceof String[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer m
            && Integer.valueOf(m + (raw[nl - 1] == 13 ? 2 : 1)) instanceof Integer w && Integer.valueOf(nl + 1) instanceof Integer base
            && Integer.valueOf(m + 2) instanceof Integer W
            && new byte[(n + 2) * W] instanceof byte[] g && new int[(n + 2) * W] instanceof int[] comp
            && new int[n * m + 2] instanceof int[] sz && new int[n * m + 1] instanceof int[] q && new int[2] instanceof int[] st
            && IntStream.range(0, n * m).allMatch(k -> (g[(k / m + 1) * W + k % m + 1] = raw[base + k / m * w + k % m]) > 0)
            && ((IntPredicate) v -> g[v] == 46 && comp[v] == 0 && (comp[v] = st[0]) > 0 && (q[st[1]++] = v) > 0 && ++sz[st[0]] > 0) instanceof IntPredicate vis
            && IntStream.range(0, (n + 2) * W).filter(c -> g[c] == 46 && comp[c] == 0).allMatch(c -> ++st[0] > 0 && (st[1] = 0) == 0 && vis.test(c)
                && IntStream.iterate(0, i -> i < st[1], i -> i + 1).allMatch(i -> (vis.test(q[i] + 1) | vis.test(q[i] - 1) | vis.test(q[i] + W) | vis.test(q[i] - W)) || true))
            && new byte[n * (m + 1)] instanceof byte[] out
            && IntStream.range(0, n * (m + 1)).allMatch(k -> Integer.valueOf((k / (m + 1) + 1) * W + k % (m + 1) + 1) instanceof Integer c
                && Integer.valueOf(comp[c - 1]) instanceof Integer a && Integer.valueOf(comp[c + 1]) instanceof Integer b
                && Integer.valueOf(comp[c - W]) instanceof Integer d && Integer.valueOf(comp[c + W]) instanceof Integer e
                && (out[k] = (byte) (k % (m + 1) == m ? 10 : g[c] == 46 ? 46
                    : 48 + (1 + sz[a] + (b - a != 0 ? sz[b] : 0) + (d - a != 0 && d - b != 0 ? sz[d] : 0) + (e - a != 0 && e - b != 0 && e - d != 0 ? sz[e] : 0)) % 10)) > 0)
            ? new String(out, 0, out.length - 1) : "");
    }
}
