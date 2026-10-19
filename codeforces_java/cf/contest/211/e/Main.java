import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer b && adj.get(a).add(b) && adj.get(b).add(a))
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] sz
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> adj.get(v).stream().filter(u -> u != par[v]).allMatch(u -> (par[u] = v) > 0 && dq.add(u))).toList() instanceof List<Integer> order
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (sz[order.get(i)] += 1) > 0 && (par[order.get(i)] == 0 || (sz[par[order.get(i)]] += sz[order.get(i)]) > 0))
            && new boolean[n + 1] instanceof boolean[] ok
            && IntStream.rangeClosed(1, n).allMatch(v -> Stream.concat(adj.get(v).stream().filter(u -> u != par[v]).map(u -> sz[u]), par[v] == 0 ? Stream.<Integer>empty() : Stream.of(n - sz[v])).toList() instanceof List<Integer> comps
                && new boolean[n + 1] instanceof boolean[] dp && (dp[0] = true)
                && comps.stream().allMatch(s -> IntStream.iterate(n - s, j -> j >= 0, j -> j - 1).allMatch(j -> !dp[j] || (dp[j + s] = true)))
                && IntStream.rangeClosed(1, n - 2).allMatch(a -> !dp[a] || (ok[a] = true)))
            ? IntStream.rangeClosed(1, n - 2).filter(a -> ok[a]).mapToObj(a -> a + " " + (n - 1 - a)).toList() instanceof List<String> res ? res.size() + "\n" + String.join("\n", res) : "" : "");
    }
}
