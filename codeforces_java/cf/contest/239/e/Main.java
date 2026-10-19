import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && adj.get(a).add(new int[]{b, 0}) && adj.get(b).add(new int[]{a, 1}))
            ? IntStream.rangeClosed(1, n).map(r -> new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] g && new int[]{0, 0} instanceof int[] acc
                && new ArrayDeque<Integer>(List.of(r)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> adj.get(v).stream().filter(e -> e[0] != par[v]).allMatch(e -> (par[e[0]] = v) > 0 && (acc[0] += e[1] == 1 ? 1 : 0) >= 0 && (g[e[0]] = (e[1] == 1 ? 1 : -1) + Math.max(0, g[v])) > -5 && (acc[1] = Math.max(acc[1], g[e[0]])) >= 0 && dq.add(e[0]))).count() >= 0
                ? acc[0] - acc[1] : 0).min().getAsInt() : "");
    }
}
