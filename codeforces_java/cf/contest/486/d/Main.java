import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer d
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, 2 * n - 2).map(i -> sc.nextInt() - 1).toArray() instanceof int[] e
            && new int[n + 1] instanceof int[] start
            && IntStream.range(0, 2 * n - 2).allMatch(i -> ++start[e[i] + 1] > 0)
            && IntStream.range(0, n).allMatch(i -> (start[i + 1] += start[i]) >= 0)
            && Arrays.copyOf(start, n) instanceof int[] pos
            && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(i -> (adj[pos[e[2 * i]]++] = e[2 * i + 1]) >= 0 && (adj[pos[e[2 * i + 1]]++] = e[2 * i]) >= 0)
            && new int[n] instanceof int[] stk
            && new int[n] instanceof int[] par
            && new int[n] instanceof int[] ptr
            && new long[n] instanceof long[] f
            && new int[1] instanceof int[] top
            && new long[1] instanceof long[] tot
            && IntStream.range(0, n).allMatch(r ->
                (stk[0] = r) == r && (top[0] = 0) == 0 && (par[r] = -1) < 0 && (f[r] = 1) > 0 && (ptr[r] = start[r]) >= 0
                && IntStream.range(0, 3 * n + 3).takeWhile(x -> top[0] >= 0).allMatch(x ->
                    Integer.valueOf(stk[top[0]]) instanceof Integer u
                    && (ptr[u] < start[u + 1]
                        ? Integer.valueOf(adj[ptr[u]++]) instanceof Integer w
                            && (w == par[u] || a[w] < a[r] || a[w] > a[r] + d || (a[w] == a[r] && w < r)
                                || ((par[w] = u) >= 0 && (f[w] = 1) > 0 && (ptr[w] = start[w]) >= 0 && (stk[++top[0]] = w) >= 0))
                        : (--top[0] < 0 || (f[par[u]] = f[par[u]] * (1 + f[u]) % 1000000007) >= 0)))
                && (tot[0] = (tot[0] + f[r]) % 1000000007) >= 0)
            ? tot[0]
            : -1);
    }
}
