import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> Integer.valueOf(i < raw.length ? raw[i] : 32) instanceof Integer ch
                && (ch >= 48 ? (st[0] = Math.max(st[0], 0) * 10 + ch - 48) >= 0 : st[0] < 0 || ((v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0))).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
            && LongStream.range(0, n).map(i -> ((long) v[2 + 2 * (int) i] << 18) | i).sorted().toArray() instanceof long[] ordF
            && LongStream.of(ordF).map(kk -> kk >> 18).toArray() instanceof long[] xs
            && IntStream.range(0, n).mapToLong(r -> v[3 + 2 * (int) (ordF[r] & 262143)]).toArray() instanceof long[] tl
            && new int[n] instanceof int[] ct && new int[n] instanceof int[] rk
            && IntStream.range(0, n).filter(r -> (rk[(int) (ordF[r] & 262143)] = r) >= 0).count() >= 0
            && Integer.valueOf(Integer.highestOneBit(2 * n - 1)) instanceof Integer N
            && Integer.valueOf(Integer.numberOfTrailingZeros(N)) instanceof Integer LOG
            && LongStream.generate(() -> -1L).limit(2L * N).toArray() instanceof long[] seg
            && IntStream.range(0, n).filter(r -> (seg[N + r] = xs[r] + tl[r]) >= 0).count() >= 0
            && IntStream.range(1, N).map(j -> N - j).filter(nd -> (seg[nd] = Math.max(seg[2 * nd], seg[2 * nd + 1])) >= -1).count() >= 0
            && new TreeSet<Long>() instanceof TreeSet<Long> W
            && IntStream.range(0, m).filter(j -> Long.valueOf(v[2 + 2 * n + 2 * j]) instanceof Long pm
                && (seg[1] >= pm && Integer.valueOf(IntStream.range(0, LOG).reduce(1, (nd, z) -> seg[2 * nd] >= pm ? 2 * nd : 2 * nd + 1) - N) instanceof Integer r && xs[r] <= pm
                    ? (tl[r] += v[3 + 2 * n + 2 * j]) >= 0 && ++ct[r] > 0
                        && IntStream.range(0, m + 1).takeWhile(z -> W.ceiling(xs[r] << 18) instanceof Long key && (key >> 18) <= xs[r] + tl[r] && W.remove(key)
                            && (tl[r] += v[3 + 2 * n + 2 * (int) (key & 262143)]) >= 0 && ++ct[r] > 0).count() >= 0
                        && IntStream.iterate(N + r, nd -> nd >= 1, nd -> nd / 2).filter(nd -> (seg[nd] = Math.max(seg[nd], xs[r] + tl[r])) >= 0).count() >= 0
                    : W.add((pm << 18) | j))).count() >= 0
            ? IntStream.range(0, n).mapToObj(i -> ct[rk[i]] + " " + tl[rk[i]]).collect(Collectors.joining("\n")) : "");
    }
}
