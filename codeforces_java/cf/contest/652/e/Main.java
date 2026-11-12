import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[(int) IntStream.range(0, raw.length).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).count()] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> (ps[1] = raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) : (i > 0 && raw[i - 1] > 47 ? 0 * (t[ps[2]++] = ps[0]) + (ps[0] = 0) : 0)) < 0).count() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(t[2 + 3 * m]) instanceof Integer a && Integer.valueOf(t[3 + 3 * m]) instanceof Integer b
            && new int[m] instanceof int[] eu && new int[m] instanceof int[] ev && new int[m] instanceof int[] ez
            && IntStream.range(0, m).filter(e -> (eu[e] = t[2 + 3 * e]) + (ev[e] = t[3 + 3 * e]) + (ez[e] = t[4 + 3 * e]) < 0).count() == 0
            && new int[n + 2] instanceof int[] start && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).filter(e -> ++start[eu[e] + 1] + ++start[ev[e] + 1] < 0).count() == 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (start[i] += start[i - 1]) < 0).count() == 0
            && start.clone() instanceof int[] fp
            && IntStream.range(0, m).filter(e -> (adj[fp[eu[e]]++] = e) + (adj[fp[ev[e]]++] = e) < 0).count() == 0
            && new int[n + 1] instanceof int[] vis && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] pe && new int[n + 1] instanceof int[] dep
            && new int[n] instanceof int[] q && new int[m] instanceof int[] tree && new int[]{1} instanceof int[] tl
            && (q[0] = 1) + (vis[1] = 1) + (pe[1] = 0) > 0
            && IntStream.range(0, n).takeWhile(i -> i < tl[0]).filter(i -> Integer.valueOf(q[i]) instanceof Integer u
                && IntStream.range(start[u], start[u + 1]).filter(k -> Integer.valueOf(adj[k]) instanceof Integer e && Integer.valueOf(eu[e] ^ ev[e] ^ u) instanceof Integer w
                    && vis[w] == 0 && ((vis[w] = 1) + (par[w] = u) + (pe[w] = e) + (dep[w] = dep[u] + 1) + (q[tl[0]++] = w) + (tree[e] = 1)) < 0).count() < 0).count() == 0
            && new long[n + 1] instanceof long[] h && new SplittableRandom(System.nanoTime()) instanceof SplittableRandom rnd
            && IntStream.range(0, m).filter(e -> tree[e] == 0 && Long.valueOf(rnd.nextLong()) instanceof Long rv && ((h[eu[e]] ^= rv) + (h[ev[e]] ^= rv)) == 1L).count() == 0
            && new int[m] instanceof int[] br
            && IntStream.range(0, n - 1).filter(j -> Integer.valueOf(q[n - 1 - j]) instanceof Integer c && (br[pe[c]] = h[c] == 0 ? 1 : 0) + (h[par[c]] ^= h[c]) == 12345L).count() == 0
            && new int[n + 1] instanceof int[] comp && new int[n + 1] instanceof int[] art
            && IntStream.range(0, n).filter(i -> Integer.valueOf(q[i]) instanceof Integer c && (comp[c] = i == 0 ? c : br[pe[c]] == 1 ? c : comp[par[c]]) < 0).count() == 0
            && IntStream.range(0, m).filter(e -> ez[e] == 1 && br[e] == 0 && (art[comp[eu[e]]] = 1) < 0).count() == 0
            && new int[]{a, b, art[comp[a]] | art[comp[b]]} instanceof int[] s
            && IntStream.range(0, 2 * n + 2).takeWhile(i -> s[0] != s[1])
                .filter(i -> (s[2] |= dep[s[0]] >= dep[s[1]] ? ez[pe[s[0]]] | art[comp[s[0] = par[s[0]]]] : ez[pe[s[1]]] | art[comp[s[1] = par[s[1]]]]) < 0).count() == 0
            ? (s[2] == 1 ? "YES" : "NO") : "");
    }
}
