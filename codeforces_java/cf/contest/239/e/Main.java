import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && adj.get(a).add(new int[]{b, 0}) && adj.get(b).add(new int[]{a, 1}))
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] fd && new int[n + 1] instanceof int[] ord && new int[]{0} instanceof int[] cnt
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> (ord[cnt[0]++] = v) > 0
                && adj.get(v).stream().filter(e -> e[0] != par[v]).allMatch(e -> (par[e[0]] = v) > 0 && (fd[e[0]] = e[1]) >= 0 && dq.add(e[0])))
            && new int[n + 1] instanceof int[] t1 && new int[n + 1] instanceof int[] t2 && new int[n + 1] instanceof int[] arg
            && new int[n + 1] instanceof int[] up && new int[n + 1] instanceof int[] cost
            && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer c && Integer.valueOf(par[c]) instanceof Integer p
                && Integer.valueOf(2 * fd[c] - 1 + t1[c]) instanceof Integer md
                && (md > t1[p] ? (t2[p] = t1[p]) >= 0 && (t1[p] = md) > 0 && (arg[p] = c) > 0 : md <= t2[p] || (t2[p] = md) > 0))
            && (cost[1] = IntStream.rangeClosed(2, n).map(v -> fd[v]).sum()) >= 0
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer c && Integer.valueOf(par[c]) instanceof Integer p
                && (up[c] = 1 - 2 * fd[c] + Math.max(Math.max(0, up[p]), arg[p] == c ? t2[p] : t1[p])) > -n - 5
                && (cost[c] = cost[p] + 1 - 2 * fd[c]) > -n - 5)
            ? IntStream.rangeClosed(1, n).map(u -> Integer.valueOf(Math.max(0, up[u])) instanceof Integer w
                ? cost[u] - (t1[u] + t2[u] + w - Math.min(w, Math.min(t1[u], t2[u]))) : 0).min().getAsInt() : "");
    }
}
