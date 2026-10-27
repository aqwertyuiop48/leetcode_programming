import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.print(new boolean[n][n] instanceof boolean[][] g && new int[n] instanceof int[] deg && new int[n] instanceof int[] par && new int[n] instanceof int[] dist && new boolean[n] instanceof boolean[] rem && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> q && new ArrayList<Integer>() instanceof ArrayList<Integer> ord && IntStream.range(0, n).allMatch(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1} instanceof int[] e && (g[e[0]][e[1]] = g[e[1]][e[0]] = true) && ++deg[e[0]] > 0 && ++deg[e[1]] > 0) && IntStream.range(0, n).filter(v -> deg[v] == 1).allMatch(v -> q.add(v)) && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(v -> (rem[v] = true) && ord.add(v) && IntStream.range(0, n).filter(u -> g[v][u] && !rem[u]).allMatch(u -> (par[v] = u) >= 0 && (--deg[u] != 1 || q.add(u)))) && IntStream.range(0, ord.size()).map(i -> ord.get(ord.size() - 1 - i)).allMatch(v -> (dist[v] = dist[par[v]] + 1) > 0) ? IntStream.range(0, n).mapToObj(v -> String.valueOf(dist[v])).collect(Collectors.joining(" ")) : "")));
    }
}

