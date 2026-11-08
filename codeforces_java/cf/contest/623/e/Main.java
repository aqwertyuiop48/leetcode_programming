import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            ? n > k ? (Object) 0 : Integer.valueOf(Integer.highestOneBit(2 * k) * 2) instanceof Integer N
            && new long[]{998244353L, 167772161L, 469762049L} instanceof long[] PR
            && ((Function<long[], Long>) (a -> LongStream.range(0, 30).boxed()
                .reduce(1L, (r, bit) -> r * r % a[2] * ((a[1] >> (29 - bit) & 1) == 1 ? a[0] : 1L) % a[2], (x, y) -> x))) instanceof Function<long[], Long> pw
            && new int[N / 2] instanceof int[] dm
            && new long[6][17] instanceof long[][] wl
            && IntStream.range(0, 102).filter(z -> (wl[z / 17][z % 17] = z / 17 % 2 == 0
                ? pw.apply(new long[]{3, (PR[z / 34] - 1) / (2L << z % 17), PR[z / 34]})
                : pw.apply(new long[]{pw.apply(new long[]{3, (PR[z / 34] - 1) / (2L << z % 17), PR[z / 34]}), PR[z / 34] - 2, PR[z / 34]})) < 0).count() >= 0
            && new long[6][N] instanceof long[][] rt
            && IntStream.range(0, 6 * N).filter(t -> (rt[t / N][t % N] = t % N == 0 ? 0 : (t % N & (t % N - 1)) == 0 ? 1
                : rt[t / N][t % N - 1] * wl[t / N][31 - Integer.numberOfLeadingZeros(t % N)] % PR[t / N / 2]) < 0).count() >= 0
            && IntStream.range(0, 6 * N).filter(t -> (rt[t / N][t % N] = (rt[t / N][t % N] << 32) % PR[t / N / 2]) < 0).count() >= 0
            && IntStream.range(0, 3).mapToLong(pi -> -IntStream.range(0, 5).reduce((int) PR[pi], (x, z) -> x * (2 - (int) PR[pi] * x)) & 4294967295L).toArray() instanceof long[] NI
            && ((BiFunction<long[], Integer, long[]>) ((a, pi) -> rt[2 * pi] instanceof long[] w && Long.valueOf(PR[pi]) instanceof Long p && Long.valueOf(NI[pi]) instanceof Long ni ? Stream.of(a).peek(z -> IntStream.iterate(N / 2, h -> h >= 1, h -> h / 2)
                .forEach(h -> Arrays.setAll(dm, t -> ((a[(2 * t - (t & (h - 1)))] = a[(2 * t - (t & (h - 1)))] + a[(2 * t - (t & (h - 1))) + h] - (p & (p - 1 - a[(2 * t - (t & (h - 1)))] - a[(2 * t - (t & (h - 1))) + h]) >> 63)) < 0
                        | (a[(2 * t - (t & (h - 1))) + h] = ((a[(2 * t - (t & (h - 1)))] - 2 * a[(2 * t - (t & (h - 1))) + h] + 2 * p) * w[h + (t & (h - 1))]
                            + (((a[(2 * t - (t & (h - 1)))] - 2 * a[(2 * t - (t & (h - 1))) + h] + 2 * p) * w[h + (t & (h - 1))] * ni) & 4294967295L) * p) >>> 32) < 0
                        | (a[(2 * t - (t & (h - 1))) + h] -= p & (p - 1 - a[(2 * t - (t & (h - 1))) + h]) >> 63) < 0) ? 0 : 0)))
                .findFirst().get() : null)) instanceof BiFunction<long[], Integer, long[]> fwd
            && ((BiFunction<long[], Integer, long[]>) ((a, pi) -> rt[2 * pi + 1] instanceof long[] w && Long.valueOf(PR[pi]) instanceof Long p && Long.valueOf(NI[pi]) instanceof Long ni ? Stream.of(a).peek(z -> IntStream.iterate(1, h -> h < N, h -> h * 2)
                .forEach(h -> Arrays.setAll(dm, t -> ((a[(2 * t - (t & (h - 1))) + h] = (a[(2 * t - (t & (h - 1))) + h] * w[h + (t & (h - 1))]
                            + ((a[(2 * t - (t & (h - 1))) + h] * w[h + (t & (h - 1))] * ni) & 4294967295L) * p) >>> 32) < 0
                        | (a[(2 * t - (t & (h - 1))) + h] -= p & (p - 1 - a[(2 * t - (t & (h - 1))) + h]) >> 63) < 0
                        | (a[(2 * t - (t & (h - 1)))] += a[(2 * t - (t & (h - 1))) + h] - (p & (p - 1 - a[(2 * t - (t & (h - 1)))] - a[(2 * t - (t & (h - 1))) + h]) >> 63)) < 0
                        | (a[(2 * t - (t & (h - 1))) + h] = a[(2 * t - (t & (h - 1)))] - 2 * a[(2 * t - (t & (h - 1))) + h] + 2 * p) < 0
                        | (a[(2 * t - (t & (h - 1))) + h] -= 2 * p & (2 * p - 1 - a[(2 * t - (t & (h - 1))) + h]) >> 63) < 0
                        | (a[(2 * t - (t & (h - 1))) + h] -= p & (p - 1 - a[(2 * t - (t & (h - 1))) + h]) >> 63) < 0) ? 0 : 0)))
                .findFirst().get() : null)) instanceof BiFunction<long[], Integer, long[]> bwd
            && ((BiFunction<long[], Integer, long[]>) ((a, pi) -> fwd.apply(Arrays.stream(Arrays.copyOf(a, N)).map(v -> v % PR[pi]).toArray(), pi))) instanceof BiFunction<long[], Integer, long[]> prep
            && IntStream.range(0, 3).mapToLong(pi -> pw.apply(new long[]{N, PR[pi] - 2, PR[pi]}) * (4294967296L % PR[pi]) % PR[pi]).toArray() instanceof long[] iN
            && new long[]{pw.apply(new long[]{PR[0] % PR[1], PR[1] - 2, PR[1]}), pw.apply(new long[]{PR[0] * PR[1] % PR[2], PR[2] - 2, PR[2]}), PR[0] * PR[1] % 1000000007L} instanceof long[] cc
            && ((BinaryOperator<long[]>) ((A, B) -> IntStream.range(0, 3).mapToObj(pi -> prep.apply(A, pi) instanceof long[] fa && prep.apply(B, pi) instanceof long[] fb
                    ? bwd.apply(IntStream.range(0, N).mapToLong(i -> Long.valueOf((fa[i] * fb[i] + ((fa[i] * fb[i] * NI[pi]) & 4294967295L) * PR[pi]) >>> 32) instanceof Long r ? r - (PR[pi] & (PR[pi] - 1 - r) >> 63) : 0L).toArray(), pi) : null).toArray(long[][]::new) instanceof long[][] R
                ? IntStream.range(0, k + 1).mapToLong(i -> Long.valueOf(R[0][i] * iN[0] % PR[0]) instanceof Long x1
                    && Long.valueOf(((R[1][i] * iN[1] % PR[1]) - x1 % PR[1] + PR[1]) % PR[1] * cc[0] % PR[1]) instanceof Long x2
                    && Long.valueOf(((R[2][i] * iN[2] % PR[2]) - (x1 + x2 * PR[0]) % PR[2] + PR[2]) % PR[2] * cc[1] % PR[2]) instanceof Long x3
                    ? (x1 + x2 * PR[0] % 1000000007L + x3 * cc[2]) % 1000000007L : 0L).toArray() : null)) instanceof BinaryOperator<long[]> mul
            && ((BiFunction<long[], Long, long[]>) ((G, c) -> new long[k + 1] instanceof long[] pc && (pc[0] = 1) == 1
                && IntStream.range(1, k + 1).filter(j -> (pc[j] = pc[j - 1] * c % 1000000007L) < 0).count() >= 0
                ? IntStream.range(0, k + 1).mapToLong(j -> G[j] * pc[j] % 1000000007L).toArray() : null)) instanceof BiFunction<long[], Long, long[]> scl
            && new long[k + 1] instanceof long[] fct && (fct[0] = 1) == 1
            && IntStream.range(1, k + 1).filter(i -> (fct[i] = fct[i - 1] * i % 1000000007L) < 0).count() >= 0
            && new long[k + 1] instanceof long[] ifc && (ifc[k] = pw.apply(new long[]{fct[k], 1000000005L, 1000000007L})) > 0
            && IntStream.range(0, k).filter(t -> (ifc[k - 1 - t] = ifc[k - t] * (k - t) % 1000000007L) < 0).count() >= 0
            && new long[k + 1] instanceof long[] g1 && IntStream.rangeClosed(1, k).filter(j -> (g1[j] = ifc[j]) < 0).count() >= 0
            && new long[][]{g1} instanceof long[][] cur && new long[]{1} instanceof long[] mm
            && IntStream.iterate(62 - Long.numberOfLeadingZeros(n), b -> b >= 0, b -> b - 1)
                .filter(b -> (cur[0] = mul.apply(scl.apply(cur[0], pw.apply(new long[]{2, mm[0], 1000000007L})), cur[0])) == null
                    | (mm[0] *= 2) < 0
                    | ((n >> b & 1) == 1 ? (cur[0] = mul.apply(scl.apply(cur[0], 2L), g1)) == null | (mm[0] += 1) < 0 : false)).count() >= 0
            ? IntStream.range(0, k + 1).mapToLong(j -> cur[0][j] * ifc[k - j] % 1000000007L).reduce(0, (x, y) -> (x + y) % 1000000007L) * fct[k] % 1000000007L : ""
            : "");
    }
}
