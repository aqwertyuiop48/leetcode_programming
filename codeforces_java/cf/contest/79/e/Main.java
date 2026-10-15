import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                Long.valueOf(sc.nextLong()) instanceof Long n
                && Long.valueOf(sc.nextLong()) instanceof Long t
                && Long.valueOf(sc.nextLong()) instanceof Long a
                && Long.valueOf(sc.nextLong()) instanceof Long b
                && Long.valueOf(sc.nextLong() - 1) instanceof Long L
                && new long[]{a, a + L, a, a + L} instanceof long[] U
                && new long[]{b, b, b + L, b + L} instanceof long[] V
                && ((LongBinaryOperator) (u, v) -> (u - 1) * u / 2 + (n - u) * (n - u + 1) / 2 + (v - 1) * v / 2 + (n - v) * (n - v + 1) / 2
                    + (n - u) * n - (u - 1) + v * (u - 1) - v * (n - u) - (u - 1) - (v - 1)) instanceof LongBinaryOperator cs
                && IntStream.range(0, 4).mapToLong(k -> Math.floorDiv(t - cs.applyAsLong(U[k], V[k]), 2)).toArray() instanceof long[] cap
                && ((Function<long[], long[]>) in -> LongStream.range(0, 4).map(k -> in[(int) k + 2] + (in[0] < U[(int) k] ? Math.max(0, in[1] - V[(int) k]) : Math.max(0, V[(int) k] - in[1]))).toArray() instanceof long[] A
                    && Long.valueOf(Math.max(0, a - 1 - in[0])) instanceof Long nA
                    && Long.valueOf(Math.max(0, a + L - 1 - Math.max(in[0], a - 1))) instanceof Long nM
                    && Long.valueOf(Math.max(0, in[1] - b)) instanceof Long r
                    && Long.valueOf(Math.max(0, in[1] - b - L)) instanceof Long s
                    && Long.valueOf(A[1] + nA * r) instanceof Long brb
                    && Long.valueOf(A[2] + nA * s) instanceof Long tlb
                    ? new long[]{A[0] + nA * r - cap[0], brb + nM * (Math.max(in[1], b) - b) - cap[1], tlb - cap[2], brb + tlb + nM * L - cap[1] - cap[2], A[3] + (nA + nM) * s - cap[3]}
                    : null) instanceof Function<long[], long[]> G
                && Stream.iterate(new long[]{1, 1, 0, 0, 0, 0}, st -> st[0] <= n, st -> Long.valueOf(IntStream.range(0, 20).boxed()
                    .reduce(new long[]{st[1], n}, (rg, i) -> rg[0] < rg[1]
                        ? (G.apply(new long[]{st[0], (rg[0] + rg[1]) / 2, st[2], st[3], st[4], st[5]}) instanceof long[] g0
                            && G.apply(new long[]{st[0], (rg[0] + rg[1]) / 2 + 1, st[2], st[3], st[4], st[5]}) instanceof long[] g1
                            && IntStream.range(0, 5).anyMatch(k -> g0[k] > 0 && g1[k] < g0[k])
                            ? new long[]{(rg[0] + rg[1]) / 2 + 1, rg[1]}
                            : new long[]{rg[0], (rg[0] + rg[1]) / 2})
                        : rg, (p, q) -> p)[0]) instanceof Long y
                    ? new long[]{st[0] + 1, y,
                        st[2] + (st[0] < U[0] ? Math.max(0, y - V[0]) : Math.max(0, V[0] - y)),
                        st[3] + (st[0] < U[1] ? Math.max(0, y - V[1]) : Math.max(0, V[1] - y)),
                        st[4] + (st[0] < U[2] ? Math.max(0, y - V[2]) : Math.max(0, V[2] - y)),
                        st[5] + (st[0] < U[3] ? Math.max(0, y - V[3]) : Math.max(0, V[3] - y))}
                    : st).toList() instanceof List<long[]> sts
                ? LongStream.of(G.apply(new long[]{1, sts.get(1)[1], 0, 0, 0, 0})).allMatch(v -> v <= 0)
                    ? IntStream.range(0, (int) (n - 1)).mapToObj(i -> "U".repeat((int) (sts.get(i + 1)[1] - sts.get(i)[1])) + "R").collect(Collectors.joining())
                        + "U".repeat((int) (n - sts.get((int) (n - 1))[1]))
                    : "Impossible"
                : ""));
    }
}

