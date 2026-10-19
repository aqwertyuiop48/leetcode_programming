import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new ArrayList<long[]>()).toList() instanceof List<ArrayList<long[]>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(sc.nextInt() - 1) instanceof Integer a && Integer.valueOf(sc.nextInt() - 1) instanceof Integer b && Long.valueOf(sc.nextLong()) instanceof Long w
                && adj.get(a).add(new long[]{b, w}) && adj.get(b).add(new long[]{a, w}))
            && new int[n] instanceof int[] par && new int[n] instanceof int[] ord && new int[n] instanceof int[] tin && new int[n] instanceof int[] sz0 && new long[n] instanceof long[] pw
            && new int[]{0} instanceof int[] cur && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> dq && (par[0] = -1) < 0
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> (tin[v] = cur[0]) >= 0 && (ord[cur[0]++] = v) >= 0 && (sz0[v] = 1) > 0
                && adj.get(v).stream().allMatch(e -> e[0] == par[v] || (par[(int) e[0]] = v) >= 0 && (pw[(int) e[0]] = e[1]) >= 0 && dq.offerFirst((int) e[0])))
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz0[par[ord[i]]] += sz0[ord[i]]) > 0)
            && new int[n] instanceof int[] cs && new long[n] instanceof long[] dn && new long[n] instanceof long[] tt && new long[4] instanceof long[] acc
            ? n == 1 ? 0 : IntStream.range(1, n).mapToLong(c -> Integer.valueOf(sz0[c]) instanceof Integer sa && Integer.valueOf(n - sz0[c]) instanceof Integer sb
                && IntStream.range(0, n).allMatch(v -> (cs[v] = 1) > 0 && (dn[v] = 0) == 0)
                && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> ord[i] == 0 || ord[i] == c || (cs[par[ord[i]]] += cs[ord[i]]) > 0 && (dn[par[ord[i]]] += dn[ord[i]] + cs[ord[i]] * pw[ord[i]]) >= 0)
                && (acc[0] = 0) == 0 && (acc[1] = Long.MAX_VALUE) > 0 && (acc[2] = 0) == 0 && (acc[3] = Long.MAX_VALUE) > 0
                && IntStream.range(0, n).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v && Boolean.valueOf(tin[v] >= tin[c] && tin[v] < tin[c] + sz0[c]) instanceof Boolean inA
                    && (tt[v] = v == 0 || v == c ? dn[v] : tt[par[v]] + pw[v] * ((inA ? sa : sb) - 2 * cs[v])) >= 0
                    && (inA ? (acc[0] += tt[v]) >= 0 && (acc[1] = Math.min(acc[1], tt[v])) >= 0 : (acc[2] += tt[v]) >= 0 && (acc[3] = Math.min(acc[3], tt[v])) >= 0))
                ? acc[0] / 2 + acc[2] / 2 + (long) sb * acc[1] + (long) sa * acc[3] + (long) sa * sb * pw[c] : Long.MAX_VALUE).min().getAsLong() : "");
    }
}
