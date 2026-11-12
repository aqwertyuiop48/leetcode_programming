import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && Integer.valueOf(tk.nextToken()) instanceof Integer m && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && new int[m] instanceof int[] eu && new int[m] instanceof int[] ev
            && IntStream.range(0, m).filter(e -> (eu[e] = Integer.parseInt(tk.nextToken())) + (ev[e] = Integer.parseInt(tk.nextToken())) < 0).count() == 0
            && new int[n + 2] instanceof int[] fs && new int[2 * m] instanceof int[] fa
            && IntStream.range(0, m).filter(e -> ++fs[eu[e] + 1] + ++fs[ev[e] + 1] < 0).count() == 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (fs[i] += fs[i - 1]) < 0).count() == 0
            && fs.clone() instanceof int[] fp
            && IntStream.range(0, m).filter(e -> (fa[fp[eu[e]]++] = ev[e]) + (fa[fp[ev[e]]++] = eu[e]) < 0).count() == 0
            && new int[n + 1] instanceof int[] f1 && new int[n + 1] instanceof int[] stamp && new int[n + 1] instanceof int[] ok && new int[n] instanceof int[] q && new int[n] instanceof int[] rem
            && IntStream.range(fs[1], fs[2]).filter(j -> (f1[fa[j]] = 1) < 0).count() == 0
            && IntStream.rangeClosed(2, n).filter(v -> (rem[v - 2] = v) < 0).count() == 0
            && new int[]{0, 0, n - 1, 0, 0} instanceof int[] st
            && IntStream.range(0, n + 1).takeWhile(i -> st[0] < st[1] || st[2] > 0).filter(i ->
                (st[0] == st[1] ? (q[st[1]++] = rem[--st[2]]) + (++st[3]) : 0) >= 0
                && Integer.valueOf(q[st[0]++]) instanceof Integer u
                && (f1[u] == 0 ? (ok[st[3]] = 1) : 0) >= 0
                && IntStream.range(fs[u], fs[u + 1]).filter(j -> (stamp[fa[j]] = u) < 0).count() == 0
                && IntStream.range(0, st[2]).filter(j -> stamp[rem[j]] != u).peek(j -> q[st[1]++] = rem[j]).count() >= 0
                && (st[4] = 0) == 0
                && IntStream.range(0, st[2]).filter(j -> stamp[rem[j]] == u).peek(j -> rem[st[4]++] = rem[j]).count() >= 0
                && (st[2] = st[4]) < 0).count() == 0
            ? (IntStream.rangeClosed(1, st[3]).allMatch(c -> ok[c] == 1) && st[3] <= k && k <= n - 1 - IntStream.rangeClosed(2, n).filter(v -> f1[v] == 1).count() ? "possible" : "impossible") : "");
    }
}
