import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier rd
            && IntStream.generate(rd).limit(3).toArray() instanceof int[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer v
            && IntStream.generate(rd).limit(n).toArray() instanceof int[] a
            && IntStream.generate(rd).limit(n).toArray() instanceof int[] b
            && new boolean[n][n] instanceof boolean[][] g
            && IntStream.range(0, h[2]).mapToObj(i -> IntStream.generate(rd).limit(2).toArray()).filter(e -> (g[e[0] - 1][e[1] - 1] = g[e[1] - 1][e[0] - 1] = true)).count() >= 0
            && new int[n] instanceof int[] vis && new int[n] instanceof int[] prev && new int[n + 1] instanceof int[] qu
            && new int[n + 1] instanceof int[] pa && new int[4] instanceof int[] sv && new StringBuilder() instanceof StringBuilder sb
            && ((IntBinaryOperator) (i, d) -> d <= 0 ? 0
                : (a[pa[i]] -= d) * 0 + (a[pa[i + 1]] += d) * 0 + (sb.append(pa[i] + 1).append(' ').append(pa[i + 1] + 1).append(' ').append(d).append('\n') == null ? 1 : 0) + (sv[3]++) * 0) instanceof IntBinaryOperator pour
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> r
            && r.getAndSet((i, d) -> i == sv[0] ? 0
                : Integer.valueOf(Math.min(d, v - a[pa[i + 1]])) instanceof Integer cn
                ? pour.applyAsInt(i, cn) + r.get().applyAsInt(i + 1, d) + pour.applyAsInt(i, d - cn) : 0) == null
            && ((IntUnaryOperator) s -> IntStream.range(0, n).map(i -> vis[i] = 0).sum() * 0 + (vis[s] = 1) * 0 + (qu[0] = s) * 0 + (sv[1] = 1) * 0 + (sv[2] = -1) * 0
                + IntStream.iterate(0, hh -> hh < sv[1] && sv[2] < 0, hh -> hh + 1).map(hh -> Integer.valueOf(qu[hh]) instanceof Integer u
                    ? IntStream.range(0, n).filter(w -> g[u][w] && vis[w] == 0).map(w -> (vis[w] = 1) * 0 + (prev[w] = u) * 0 + (qu[sv[1]++] = w) * 0
                        + (b[w] > a[w] && sv[2] < 0 ? (sv[2] = w) * 0 : 0)).sum() : 0).sum() * 0 + sv[2]) instanceof IntUnaryOperator bfs
            && IntStream.range(0, n).map(s -> IntStream.iterate(0, i -> a[s] > b[s] && sv[2] != -2, i -> i + 1).map(i -> Integer.valueOf(bfs.applyAsInt(s)) instanceof Integer t
                ? t < 0 ? (sv[2] = -2) * 0
                : Integer.valueOf(Math.min(a[s] - b[s], b[t] - a[t])) instanceof Integer d
                && IntStream.iterate(t, w -> w != -1, w -> w == s ? -1 : prev[w]).toArray() instanceof int[] rev
                ? IntStream.range(0, rev.length).map(j -> pa[j] = rev[rev.length - 1 - j]).sum() * 0 + (sv[0] = rev.length - 1) * 0 + r.get().applyAsInt(0, d) : 0 : 0).sum()).sum() >= 0
            ? sv[2] != -2 && IntStream.range(0, n).allMatch(i -> a[i] == b[i]) ? sv[3] + "\n" + sb : "NO" : "");
    }
}
