import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long k
            && new long[]{k} instanceof long[] rem
            && LongStream.rangeClosed(2, 1000000).filter(p -> rem[0] % p == 0).mapToObj(p -> new long[]{p, LongStream.iterate(rem[0], x -> x % p == 0, x -> x / p).count(),
                (rem[0] = LongStream.iterate(rem[0], x -> x % p == 0, x -> x / p).reduce((a, b) -> b).getAsLong() / p)}).collect(Collectors.toList()) instanceof List<long[]> pl
            && Stream.concat(pl.stream().map(x -> new long[]{x[0], x[1]}), rem[0] > 1 ? Stream.of(new long[]{rem[0], 1}) : Stream.<long[]>empty()).toArray(long[][]::new) instanceof long[][] pe
            && Integer.valueOf(pe.length) instanceof Integer P
            && new int[P + 1] instanceof int[] mult && (mult[0] = 1) == 1
            && IntStream.range(0, P).filter(j -> (mult[j + 1] = mult[j] * (int) (pe[j][1] + 1)) < 0).count() == 0
            && Integer.valueOf(mult[P]) instanceof Integer D
            && IntStream.range(0, D).map(r -> r == 0 ? 0 : IntStream.range(0, P).filter(j -> mult[j] <= r).max().getAsInt()).toArray() instanceof int[] hj
            && IntStream.range(0, D).map(r -> r / mult[hj[r]]).toArray() instanceof int[] hx
            && IntStream.range(0, D).map(r -> r - hx[r] * mult[hj[r]]).toArray() instanceof int[] low
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, P).map(j -> (int) Math.min(pe[j][1], LongStream.iterate(t[2 + i], x -> x % pe[j][0] == 0, x -> x / pe[j][0]).count())).toArray()).toArray(int[][]::new) instanceof int[][] g
            && new long[D] instanceof long[] f && IntStream.range(1, D).filter(r -> (f[r] = 1L << 60) < 0).count() == 0
            && new boolean[n * D] instanceof boolean[] took && new int[D] instanceof int[] red
            && IntStream.range(0, n).allMatch(i ->
                (red[0] = 0) == 0 && IntStream.range(1, D).filter(r -> (red[r] = red[low[r]] + Math.max(0, hx[r] - g[i][hj[r]]) * mult[hj[r]]) < 0).count() == 0
                && IntStream.range(0, D).map(x -> D - 1 - x).filter(r -> f[red[r]] + (1L << 46) + t[2 + i] < f[r] && (f[r] = f[red[r]] + (1L << 46) + t[2 + i]) > 0 && (took[i * D + r] = true)).count() >= 0)
            ? (k == 1 ? "1\n" + (1 + IntStream.range(0, n).boxed().min(Comparator.comparingLong(i -> t[2 + i])).get())
                : f[D - 1] >= (1L << 59) ? "-1"
                : (f[D - 1] >> 46) + "\n" + new int[]{D - 1} .getClass().getSimpleName().substring(0, 0)
                    + (new int[]{D - 1} instanceof int[] cur
                        ? IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> took[i * D + cur[0]]
                            && IntStream.range(1, D).filter(r -> (red[r] = red[low[r]] + Math.max(0, hx[r] - g[i][hj[r]]) * mult[hj[r]]) < 0).count() == 0 && (cur[0] = red[cur[0]]) >= 0).mapToObj(i -> Integer.toString(i + 1)).collect(Collectors.joining(" "))
                        : "")) : "");
    }
}
