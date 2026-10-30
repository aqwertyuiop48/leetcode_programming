import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Long) Long.parseLong(tk.nextToken()) instanceof Long K && (Long) Long.parseLong(tk.nextToken()) instanceof Long P
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer N && IntStream.range(0, N).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] base
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer M && new HashMap<Long, Long>() instanceof HashMap<Long, Long> exc
            && IntStream.range(0, M).filter(i -> (Long) Long.parseLong(tk.nextToken()) instanceof Long j && exc.put(j, Long.parseLong(tk.nextToken())) == null && false).count() >= 0
            && (Integer) Integer.highestOneBit(Math.max(1, 2 * N - 1)) instanceof Integer sz && new long[8 * sz] instanceof long[] T
            && IntStream.range(0, sz).filter(r -> (T[4 * (sz + r)] = r < N ? 0L : 1L % P) >= 0 && (T[4 * (sz + r) + 1] = r < N ? 1L % P : 0L) >= 0
                && (T[4 * (sz + r) + 2] = r < N ? base[(r + N - 1) % N] % P : 0L) >= 0 && (T[4 * (sz + r) + 3] = r < N ? base[r] % P : 1L % P) >= 0 && false).count() >= 0
            && IntStream.iterate(sz - 1, k -> k >= 1, k -> k - 1).filter(k -> (T[4 * k] = (T[8 * k + 4] * T[8 * k] + T[8 * k + 5] * T[8 * k + 2]) % P) >= 0 && (T[4 * k + 1] = (T[8 * k + 4] * T[8 * k + 1] + T[8 * k + 5] * T[8 * k + 3]) % P) >= 0
                && (T[4 * k + 2] = (T[8 * k + 6] * T[8 * k] + T[8 * k + 7] * T[8 * k + 2]) % P) >= 0 && (T[4 * k + 3] = (T[8 * k + 6] * T[8 * k + 1] + T[8 * k + 7] * T[8 * k + 3]) % P) >= 0 && false).count() >= 0
            && new long[61 * 4] instanceof long[] PW && IntStream.range(0, 4).filter(e -> (PW[e] = T[4 + e]) < 0).count() >= 0
            && IntStream.range(1, 61).filter(e -> (PW[4 * e] = (PW[4 * e - 4] * PW[4 * e - 4] + PW[4 * e - 3] * PW[4 * e - 2]) % P) >= 0 && (PW[4 * e + 1] = (PW[4 * e - 4] * PW[4 * e - 3] + PW[4 * e - 3] * PW[4 * e - 1]) % P) >= 0
                && (PW[4 * e + 2] = (PW[4 * e - 2] * PW[4 * e - 4] + PW[4 * e - 1] * PW[4 * e - 2]) % P) >= 0 && (PW[4 * e + 3] = (PW[4 * e - 2] * PW[4 * e - 3] + PW[4 * e - 1] * PW[4 * e - 1]) % P) >= 0 && false).count() >= 0
            && new long[]{0L, 1L % P} instanceof long[] v
            && ((IntUnaryOperator) k -> (Long) v[0] instanceof Long x && (Long) v[1] instanceof Long y && (v[0] = (T[4 * k] * x + T[4 * k + 1] * y) % P) >= 0 && (v[1] = (T[4 * k + 2] * x + T[4 * k + 3] * y) % P) >= 0 ? 0 : 1) instanceof IntUnaryOperator an
            && new ToIntFunction[1] instanceof ToIntFunction[] fh
            && (fh[0] = (ToIntFunction<int[]>) a -> a[3] > a[2] || a[4] < a[1] ? 0 : a[3] <= a[1] && a[2] <= a[4] ? an.applyAsInt(a[0])
                : fh[0].applyAsInt(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4]}) + fh[0].applyAsInt(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4]})) != null
            && ((LongBinaryOperator) (lo, hi) -> (Long) (lo / N) instanceof Long bl && (Long) (hi / N) instanceof Long br
                && (bl - br == 0 ? fh[0].applyAsInt(new int[]{1, 0, sz - 1, (int) (lo % N), (int) (hi % N)}) == 0
                    : fh[0].applyAsInt(new int[]{1, 0, sz - 1, (int) (lo % N), N - 1}) == 0
                        && LongStream.range(0, 61).filter(e -> ((br - bl - 1) >> e & 1) == 1 && (Long) v[0] instanceof Long x && (Long) v[1] instanceof Long y
                            && (v[0] = (PW[(int) (4 * e)] * x + PW[(int) (4 * e) + 1] * y) % P) >= 0 && (v[1] = (PW[(int) (4 * e) + 2] * x + PW[(int) (4 * e) + 3] * y) % P) >= 0 && false).count() >= 0
                        && fh[0].applyAsInt(new int[]{1, 0, sz - 1, 0, (int) (hi % N)}) == 0) ? 0L : 1L) instanceof LongBinaryOperator range
            && exc.keySet().stream().flatMapToLong(j -> LongStream.of(j, j + 1)).filter(x -> x >= 1 && x <= K - 1).sorted().distinct().toArray() instanceof long[] sp
            && new long[]{1L} instanceof long[] cur
            && IntStream.range(0, sp.length).filter(idx -> (sp[idx] - 1 < cur[0] || range.applyAsLong(cur[0], sp[idx] - 1) == 0)
                && (Long) exc.getOrDefault(sp[idx] - 1, base[(int) ((sp[idx] - 1) % N)]) instanceof Long sa && (Long) exc.getOrDefault(sp[idx], base[(int) (sp[idx] % N)]) instanceof Long sb
                && (Long) v[0] instanceof Long x && (Long) v[1] instanceof Long y && (v[0] = y) >= 0 && (v[1] = (sa % P * x + sb % P * y) % P) >= 0 && (cur[0] = sp[idx] + 1) > 0 && false).count() >= 0
            && (cur[0] > K - 1 || range.applyAsLong(cur[0], K - 1) == 0)
            ? (K == 0 ? 0L : v[1]) : -1L);
    }
}
