import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[(int) IntStream.range(0, raw.length).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).count()] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> (ps[1] = raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) : (i > 0 && raw[i - 1] > 47 ? 0 * (t[ps[2]++] = ps[0]) + (ps[0] = 0) : 0)) < 0).count() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[n + 2] instanceof int[] st && new int[m] instanceof int[] adj && new int[n + 1] instanceof int[] indeg
            && IntStream.range(0, m).filter(e -> ++st[t[2 + 2 * e] + 1] + ++indeg[t[3 + 2 * e]] < 0).count() == 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (st[i] += st[i - 1]) < 0).count() == 0
            && st.clone() instanceof int[] fp
            && IntStream.range(0, m).filter(e -> (adj[fp[t[2 + 2 * e]]++] = e) < 0).count() == 0
            && new int[n] instanceof int[] q && new int[]{0, 0} instanceof int[] qs
            && IntStream.rangeClosed(1, n).filter(v -> indeg[v] == 0 && (q[qs[1]++] = v) < 0).count() == 0
            && IntStream.range(0, n).takeWhile(i -> i < qs[1]).filter(i -> Integer.valueOf(q[i]) instanceof Integer u
                && IntStream.range(st[u], st[u + 1]).filter(j -> --indeg[t[3 + 2 * adj[j]]] == 0 && (q[qs[1]++] = t[3 + 2 * adj[j]]) < 0).count() < 0).count() == 0
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> mp
            && IntStream.range(0, m).filter(e -> mp.putIfAbsent(t[2 + 2 * e] * 1000000L + t[3 + 2 * e], e + 1) != null).count() >= 0
            && IntStream.range(0, n - 1).map(i -> mp.getOrDefault(q[i] * 1000000L + q[i + 1], -1)).toArray() instanceof int[] need
            ? (IntStream.of(need).anyMatch(x -> x < 0) || qs[1] < n ? -1 : IntStream.of(need).max().orElse(0)) : "");
    }
}
