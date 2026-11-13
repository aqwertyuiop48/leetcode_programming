import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && new int[]{1} instanceof int[] p && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, a[0]).allMatch(tc -> Integer.valueOf(a[p[0]]) instanceof Integer n && Integer.valueOf(a[p[0] + 1]) instanceof Integer m
                && Integer.valueOf(p[0] + 2) instanceof Integer base && (p[0] += 2 + 2 * m) > 0
                && new int[m + n + 1] instanceof int[] eu && new int[m + n + 1] instanceof int[] ev && new int[n + 1] instanceof int[] deg
                && IntStream.range(0, m).allMatch(e -> (eu[e] = a[base + 2 * e]) > 0 && (ev[e] = a[base + 2 * e + 1]) > 0 && ++deg[eu[e]] > 0 && ++deg[ev[e]] > 0)
                && new int[]{m} instanceof int[] ec
                && IntStream.rangeClosed(1, n).filter(v -> deg[v] % 2 == 1).allMatch(v -> (eu[ec[0]] = 0) == 0 && (ev[ec[0]++] = v) == v)
                && new int[n + 2] instanceof int[] st
                && IntStream.range(0, ec[0]).allMatch(e -> ++st[eu[e] + 1] > 0 && ++st[ev[e] + 1] > 0)
                && IntStream.rangeClosed(1, n + 1).allMatch(v -> (st[v] += st[v - 1]) >= 0)
                && st.clone() instanceof int[] ptr && st.clone() instanceof int[] w && new int[2 * ec[0]] instanceof int[] adj
                && IntStream.range(0, ec[0]).allMatch(e -> (adj[ptr[eu[e]]++] = e) >= 0 && (adj[ptr[ev[e]]++] = e) >= 0)
                && new boolean[ec[0]] instanceof boolean[] used && new int[ec[0]] instanceof int[] fr && new int[ec[0]] instanceof int[] to && new int[1] instanceof int[] last
                && ((IntUnaryOperator) c -> IntStream.range(w[c], st[c + 1]).filter(i -> !used[adj[i]]).findFirst() instanceof OptionalInt o && o.isPresent()
                    && (w[c] = o.getAsInt() + 1) > 0 && Integer.valueOf(adj[o.getAsInt()]) instanceof Integer e && (used[e] = true)
                    && (fr[e] = c) >= 0 && (last[0] = to[e] = eu[e] + ev[e] - c) >= 0 ? last[0] : -1) instanceof IntUnaryOperator step
                && IntStream.rangeClosed(0, n).allMatch(s -> IntStream.iterate(s, c -> c >= 0, c -> step.applyAsInt(c)).count() >= 0)
                && sb.append(n - (ec[0] - m)).append('\n') != null
                && IntStream.range(0, m).allMatch(e -> sb.append(fr[e]).append(' ').append(to[e]).append('\n') != null))
            ? sb.toString().trim() : "");
    }
}
