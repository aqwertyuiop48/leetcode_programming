import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b
            && new int[2 * n + 2][2 * n + 2] instanceof int[][] cap
            && IntStream.range(0, n).allMatch(i -> (cap[2 * n][i] = a[i]) >= 0 && (cap[n + i][2 * n + 1] = b[i]) >= 0 && (cap[i][n + i] = 1000000) > 0)
            && IntStream.range(0, m).allMatch(i -> (Integer) (s.nextInt() - 1) instanceof Integer x && (Integer) (s.nextInt() - 1) instanceof Integer y && (cap[x][n + y] = 1000000) > 0 && (cap[y][n + x] = 1000000) > 0)
            && new int[2 * n + 2] instanceof int[] par
            && Stream.generate(() -> 0).takeWhile(z -> IntStream.range(0, 2 * n + 2).allMatch(i -> (par[i] = -1) < 0) && (par[2 * n] = 2 * n) >= 0 && new ArrayDeque<Integer>(List.of(2 * n)) instanceof ArrayDeque<Integer> q
                    && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.range(0, 2 * n + 2).filter(v -> par[v] < 0 && cap[u][v] > 0).allMatch(v -> (par[v] = u) >= 0 && q.add(v))) && par[2 * n + 1] >= 0)
                .allMatch(z -> (Integer) Stream.iterate(2 * n + 1, v -> v != 2 * n, v -> par[v]).mapToInt(v -> cap[par[v]][v]).min().getAsInt() instanceof Integer f
                    && Stream.iterate(2 * n + 1, v -> v != 2 * n, v -> par[v]).allMatch(v -> (cap[par[v]][v] -= f) >= 0 && (cap[v][par[v]] += f) > 0))
            ? IntStream.range(0, n).allMatch(i -> cap[2 * n][i] == 0) && IntStream.range(0, n).allMatch(i -> cap[n + i][2 * n + 1] == 0)
                ? "YES\n" + IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> String.valueOf(cap[n + j][i])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "NO" : "");
    }
}
