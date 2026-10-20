import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(n * m) instanceof Integer N
            && IntStream.range(0, N).map(v -> "DIMA".indexOf(t[2 + v / m].charAt(v % m))).toArray() instanceof int[] c
            && ((java.util.function.IntBinaryOperator) (v, d) -> d == 0 ? (v >= m ? v - m : -1) : d == 1 ? (v < N - m ? v + m : -1) : d == 2 ? (v % m > 0 ? v - 1 : -1) : (v % m < m - 1 ? v + 1 : -1)) instanceof java.util.function.IntBinaryOperator nx
            && ((java.util.function.IntFunction<IntStream>) v -> IntStream.range(0, 4).map(d -> nx.applyAsInt(v, d)).filter(u -> u >= 0 && c[u] == (c[v] + 1) % 4)) instanceof java.util.function.IntFunction<IntStream> nb
            && new int[N] instanceof int[] deg
            && IntStream.range(0, N).allMatch(v -> nb.apply(v).map(u -> ++deg[u]).sum() >= 0)
            && new int[N] instanceof int[] ord && new int[]{0} instanceof int[] tl
            && IntStream.range(0, N).allMatch(v -> deg[v] > 0 || (ord[tl[0]++] = v) >= 0)
            && IntStream.iterate(0, i -> i < tl[0], i -> i + 1).allMatch(i -> nb.apply(ord[i]).allMatch(u -> --deg[u] > 0 || (ord[tl[0]++] = u) >= 0))
            ? tl[0] < N ? "Poor Inna!" : new int[N] instanceof int[] lp
                && IntStream.iterate(N - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (lp[ord[i]] = 1 + nb.apply(ord[i]).map(u -> lp[u]).max().orElse(0)) > 0)
                ? Integer.valueOf(IntStream.range(0, N).filter(v -> c[v] == 0).map(v -> lp[v] / 4).max().orElse(0)) instanceof Integer r && r > 0 ? String.valueOf(r) : "Poor Dima!" : "" : "");
    }
}
