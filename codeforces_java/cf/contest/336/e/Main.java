import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long M
            && IntStream.range(0, 8).map(i -> i < 4 ? 1 << i : (1 << (i - 4)) | (1 << ((i - 3) % 4))).toArray() instanceof int[] pm
            && new long[16][16] instanceof long[][] B
            && IntStream.range(0, 256).filter(s -> IntStream.range(0, 8).allMatch(i -> (s >> i & 1) == 0 || IntStream.range(i + 1, 8).allMatch(j -> (s >> j & 1) == 0 || (pm[i] & pm[j]) == 0)))
                .allMatch(s -> ++B[IntStream.range(0, 8).filter(i -> (s >> i & 1) == 1).map(i -> pm[i]).reduce(0, (x, y) -> x | y)][Integer.bitCount(s)] > 0)
            && new long[16][16] instanceof long[][] A
            && ((IntBinaryOperator) (v, d) -> (d == 1 || d >= 3 ? 1 << v : 0) | (d >= 2 ? 1 << ((v + 1) % 4) : 0)) instanceof IntBinaryOperator fm
            && ((IntUnaryOperator) d -> d == 0 ? 0 : d == 3 ? 2 : 1) instanceof IntUnaryOperator fc
            && IntStream.range(0, 16 * 625).allMatch(z -> Integer.valueOf(z % 16) instanceof Integer cs && Integer.valueOf(z / 16) instanceof Integer vo
                && ++A[cs | fm.applyAsInt(0, vo % 5) | fm.applyAsInt(1, vo / 5 % 5) | fm.applyAsInt(2, vo / 25 % 5) | fm.applyAsInt(3, vo / 125)]
                    [Integer.bitCount(cs) + fc.applyAsInt(vo % 5) + fc.applyAsInt(vo / 5 % 5) + fc.applyAsInt(vo / 25 % 5) + fc.applyAsInt(vo / 125)] > 0)
            && new long[256] instanceof long[] TH
            && Stream.of(0).peek(x -> IntStream.range(0, 4096).filter(z -> (z >> 4 & 15) == (z >> 4 & 15 & z >> 8))
                .forEach(z -> TH[z >> 8 << 4 | z & 15] += A[z >> 4 & 15][z & 15])).findFirst().isPresent()
            && IntStream.range(0, 4096).filter(z -> B[z >> 4 & 15][z & 15] != 0 && (z & 15) <= k && (z >> 8 & z >> 4 & 15) == 0).toArray() instanceof int[] nzB
            && ((BiFunction<long[], Boolean, long[]>) (f, big) -> big
                ? new long[4096] instanceof long[] g
                    && Stream.of(0).peek(x -> Arrays.stream(nzB)
                        .forEach(z -> IntStream.rangeClosed(0, k - (z & 15)).forEach(t -> g[(z >> 8 | z >> 4 & 15) << 8 | t + (z & 15)] += f[z >> 8 << 8 | t] * B[z >> 4 & 15][z & 15]))).findFirst().isPresent()
                    && IntStream.range(0, 4096).allMatch(i -> (g[i] %= M) >= 0)
                    ? g : null
                : f.clone() instanceof long[] Fh && new long[4096] instanceof long[] P
                    && IntStream.range(0, 4).allMatch(b -> Integer.valueOf((256 << b) - 1) instanceof Integer lo
                        && IntStream.range(0, 2048).allMatch(q -> Integer.valueOf((q & lo) | ((q & ~lo) << 1) | (256 << b)) instanceof Integer z && (Fh[z] += Fh[z ^ (256 << b)]) >= 0))
                    && Stream.of(0).peek(x -> IntStream.range(0, 256).filter(z -> (z & 15) <= k && TH[z] != 0)
                        .forEach(z -> IntStream.rangeClosed(0, k - (z & 15)).forEach(t -> P[z >> 4 << 8 | t + (z & 15)] += TH[z] * Fh[z >> 4 << 8 | t]))).findFirst().isPresent()
                    && IntStream.range(0, 4).allMatch(b -> Integer.valueOf((256 << b) - 1) instanceof Integer lo
                        && IntStream.range(0, 2048).allMatch(q -> Integer.valueOf((q & lo) | ((q & ~lo) << 1) | (256 << b)) instanceof Integer z && (P[z] -= P[z ^ (256 << b)]) > Long.MIN_VALUE))
                    && IntStream.range(0, 4096).allMatch(i -> (P[i] = (P[i] % M + M) % M) >= 0)
                    ? P : null) instanceof BiFunction<long[], Boolean, long[]> step
            && new long[4096] instanceof long[] init && (init[0] = 1) == 1
            && new long[][]{init} instanceof long[][] cur
            && IntStream.rangeClosed(0, n).allMatch(j -> (cur[0] = step.apply(cur[0], true)) != null && (j == n || (cur[0] = step.apply(cur[0], false)) != null))
            ? IntStream.range(0, 16).mapToLong(mask -> cur[0][mask << 8 | k]).sum() % M * LongStream.rangeClosed(1, k).reduce(1, (x, y) -> x * y % M) % M : "");
    }
}

