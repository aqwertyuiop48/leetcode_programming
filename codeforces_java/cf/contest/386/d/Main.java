import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, 3).map(i -> sc.nextInt() - 1).toArray() instanceof int[] st
            && IntStream.range(0, n).mapToObj(i -> sc.next().toCharArray()).toArray(char[][]::new) instanceof char[][] col
            && Integer.valueOf(n * n * n) instanceof Integer N
            && new int[N] instanceof int[] dist && new int[N] instanceof int[] par && new int[N] instanceof int[] mv && new int[N] instanceof int[] q
            && IntStream.range(0, N).allMatch(i -> (dist[i] = -1) < 0)
            && new int[]{n * n, n, 1} instanceof int[] mul
            && Integer.valueOf(st[0] * mul[0] + st[1] * mul[1] + st[2]) instanceof Integer s0
            && (dist[s0] = 0) == 0 && (q[0] = s0) >= 0 && new int[]{0, 1} instanceof int[] ptr
            && (IntStream.iterate(0, z -> ptr[0] < ptr[1], z -> z + 1).allMatch(z -> Integer.valueOf(q[ptr[0]++]) instanceof Integer s
                && new int[]{s / mul[0], s / n % n, s % n} instanceof int[] p
                && IntStream.range(0, 3).allMatch(i -> IntStream.range(0, n).filter(y -> y != p[0] && y != p[1] && y != p[2]
                        && col[p[i]][y] == col[p[(i + 1) % 3]][p[(i + 2) % 3]]).allMatch(y -> Integer.valueOf(s + (y - p[i]) * mul[i]) instanceof Integer ns
                    && (dist[ns] >= 0 || (dist[ns] = dist[s] + 1) > 0 && (par[ns] = s) >= 0 && (mv[ns] = p[i] * n + y) >= 0 && (q[ptr[1]++] = ns) >= 0)))) || true)
            && Stream.of(new int[]{0, 1, 2}, new int[]{0, 2, 1}, new int[]{1, 0, 2}, new int[]{1, 2, 0}, new int[]{2, 0, 1}, new int[]{2, 1, 0})
                .map(p -> p[0] * mul[0] + p[1] * mul[1] + p[2]).filter(t -> dist[t] >= 0).min(Comparator.comparingInt(t -> dist[t])) instanceof Optional<Integer> best
            ? best.isEmpty() ? "-1" : Integer.valueOf(dist[best.get()]) instanceof Integer d
                && IntStream.iterate(best.get(), s -> par[s]).limit(d).toArray() instanceof int[] chain
                ? d + IntStream.range(0, d).mapToObj(j -> "\n" + (mv[chain[d - 1 - j]] / n + 1) + " " + (mv[chain[d - 1 - j]] % n + 1)).collect(Collectors.joining()) : "" : "");
    }
}
