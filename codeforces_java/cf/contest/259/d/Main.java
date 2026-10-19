import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next().chars().map(c -> c - '0').toArray() instanceof int[] dg && Long.valueOf(1000000007L) instanceof Long P
            && Integer.valueOf(dg.length) instanceof Integer L
            && new long[12][12] instanceof long[][] C && IntStream.range(0, 12).allMatch(i -> (C[i][0] = 1) > 0 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = C[i - 1][j - 1] + C[i - 1][j]) > 0))
            && new long[12] instanceof long[] cnt
            && IntStream.range(0, L).allMatch(i -> IntStream.range(0, dg[i]).allMatch(x -> Integer.valueOf((int) IntStream.range(0, i).filter(q -> dg[q] == 4 || dg[q] == 7).count() + (x == 4 || x == 7 ? 1 : 0)) instanceof Integer pre
                && Integer.valueOf(L - i - 1) instanceof Integer r
                && IntStream.rangeClosed(0, r).allMatch(j -> (cnt[pre + j] += C[r][j] * (1L << j) * (long) Math.pow(8, r - j)) >= 0)))
            && (cnt[(int) IntStream.range(0, L).filter(q -> dg[q] == 4 || dg[q] == 7).count()] += 1) >= 0 && cnt[0]-- > 0
            && new AtomicReference<BiFunction<Integer, Integer, Long>>() instanceof AtomicReference<BiFunction<Integer, Integer, Long>> f
            && f.compareAndSet(null, (i, rem) -> i == 6 ? 1L : IntStream.rangeClosed(0, rem).mapToLong(k -> cnt[k] <= 0 ? 0 : new long[]{cnt[k]} instanceof long[] c && cnt[k]-- >= 0
                && (c[0] = c[0] % P * f.get().apply(i + 1, rem - k) % P) >= 0 && cnt[k]++ >= 0 ? c[0] : 0).sum() % P)
            ? IntStream.rangeClosed(1, 10).mapToLong(a -> cnt[a] <= 0 ? 0 : new long[]{cnt[a] % P} instanceof long[] c && cnt[a]-- >= 0
                && (c[0] = c[0] * f.get().apply(0, a - 1) % P) >= 0 && cnt[a]++ >= 0 ? c[0] : 0).sum() % P : "");
    }
}
