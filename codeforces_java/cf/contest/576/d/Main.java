import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sk && (Integer) Integer.parseInt(sk.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(sk.nextToken()) instanceof Integer m
            && LongStream.range(0, m).map(i -> ((Integer.parseInt(sk.nextToken()) - 1L) << 8) | (Integer.parseInt(sk.nextToken()) - 1L) | (Integer.parseInt(sk.nextToken()) * 65536L)).sorted().toArray() instanceof long[] ks
            && new long[n * 3] instanceof long[] A && new long[] {1, 0, 0} instanceof long[] cur && new long[1] instanceof long[] tm && new long[] {Long.MAX_VALUE} instanceof long[] best
            && new long[1][] instanceof long[][] P && new int[n] instanceof int[] dist && new int[n] instanceof int[] q && new int[1] instanceof int[] tail
            && ((BinaryOperator<long[]>) (X, Y) -> (new long[n * 3] instanceof long[] Z
                && IntStream.range(0, n).filter(i -> IntStream.range(0, n).filter(j -> (X[i * 3 + (j >> 6)] >>> j & 1) != 0
                    && ((Z[i * 3] |= Y[j * 3]) * 0 + (Z[i * 3 + 1] |= Y[j * 3 + 1]) * 0 + (Z[i * 3 + 2] |= Y[j * 3 + 2]) * 0) == 0).count() >= 0).count() >= 0) ? Z : null) instanceof BinaryOperator<long[]> mul
            && IntStream.range(0, m).filter(e -> (cur[0] | cur[1] | cur[2]) != 0 && best[0] > ks[e] >> 16
                && (Integer) (int) ((ks[e] >> 16) - tm[0]) instanceof Integer step && (P[0] = A.clone()) != null
                && IntStream.range(0, 31).filter(b -> (step >> b) > 0
                    && ((step >> b & 1) == 0 || (new long[3] instanceof long[] rs
                        && IntStream.range(0, n).filter(j -> (cur[j >> 6] >>> j & 1) != 0 && ((rs[0] |= P[0][j * 3]) * 0 + (rs[1] |= P[0][j * 3 + 1]) * 0 + (rs[2] |= P[0][j * 3 + 2]) * 0) == 0).count() >= 0
                        && (cur[0] = rs[0]) * 0 + (cur[1] = rs[1]) * 0 + (cur[2] = rs[2]) * 0 == 0))
                    && ((step >> (b + 1)) == 0 || (P[0] = mul.apply(P[0], P[0])) != null)).count() >= 0
                && (tm[0] = ks[e] >> 16) >= 0 && (A[(int) (ks[e] >> 8 & 255) * 3 + (int) ((ks[e] & 255) >> 6)] |= 1L << (ks[e] & 255)) != 0
                && ((cur[0] | cur[1] | cur[2]) == 0 || (tail[0] = 0) == 0
                    && IntStream.range(0, n).filter(x -> (dist[x] = (cur[x >> 6] >>> x & 1) != 0 ? 0 : -1) == 0 && (q[tail[0]++] = x) >= 0).count() >= 0
                    && IntStream.range(0, n).filter(h -> h < tail[0]).filter(h -> IntStream.range(0, n).filter(v -> (A[q[h] * 3 + (v >> 6)] >>> v & 1) != 0 && dist[v] < 0
                        && (dist[v] = dist[q[h]] + 1) > 0 && (q[tail[0]++] = v) >= 0).count() >= 0).count() >= 0
                    && (dist[n - 1] < 0 || (best[0] = Math.min(best[0], tm[0] + dist[n - 1])) >= 0))).count() >= 0
            ? (best[0] == Long.MAX_VALUE ? "Impossible" : String.valueOf(best[0])) : "");
    }
}
