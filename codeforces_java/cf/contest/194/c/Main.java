import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).collect(Collectors.joining()) instanceof String g
            && IntStream.range(0, n * m).filter(i -> g.charAt(i) == '#').toArray() instanceof int[] cells
            ? (cells.length <= 2 ? -1
                : new int[n * m] instanceof int[] tin && new int[n * m] instanceof int[] low && new int[n * m] instanceof int[] par && new int[n * m] instanceof int[] ptr && new int[n * m + 1] instanceof int[] stk && new int[]{1, 1, 0, 0} instanceof int[] st
                    && (tin[cells[0]] = low[cells[0]] = 1) == 1 && (stk[0] = cells[0]) >= 0 && (par[cells[0]] = -1) < 0
                    && IntStream.range(0, 6 * n * m + 6).anyMatch(z -> st[0] == 0 || !((Integer) stk[st[0] - 1] instanceof Integer v
                        && (ptr[v] < 4
                            ? (Integer) ptr[v]++ instanceof Integer d && (Integer) (d == 0 ? v - m : d == 1 ? v + m : d == 2 ? (v % m > 0 ? v - 1 : -1) : (v % m < m - 1 ? v + 1 : -1)) instanceof Integer u
                                && (u < 0 || u >= n * m || g.charAt(u) != '#' || (tin[u] == 0 ? (par[u] = v) >= 0 && (tin[u] = low[u] = ++st[1]) > 0 && (stk[st[0]++] = u) >= 0 && (v != cells[0] || ++st[3] > 0) : u == par[v] || (low[v] = Math.min(low[v], tin[u])) >= 0))
                            : --st[0] >= 0 && (st[0] == 0 || ((Integer) stk[st[0] - 1] instanceof Integer p && (low[p] = Math.min(low[p], low[v])) >= 0 && (low[v] < tin[p] || p == cells[0] || (st[2] = 1) > 0))))))
                    && (st[2] == 1 || st[3] >= 2) ? 1 : 2)
            : "");
    }
}
