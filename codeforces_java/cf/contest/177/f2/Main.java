import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Long) Long.parseLong(tk.nextToken()) instanceof Long t
            && IntStream.range(0, k).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken())}).sorted(Comparator.comparingInt((int[] e) -> e[2])).toArray(int[][]::new) instanceof int[][] e
            && IntStream.range(0, k).map(j -> e[j][2]).toArray() instanceof int[] er && IntStream.range(0, k).mapToLong(j -> (1L << (20 + e[j][0])) | (1L << e[j][1])).toArray() instanceof long[] add
            && new long[]{0} instanceof long[] cnt && new long[]{0} instanceof long[] bound && new AtomicReference<LongPredicate>() instanceof AtomicReference<LongPredicate> dfs
            && dfs.compareAndSet(null, s -> ++cnt[0] < t
                && IntStream.range((int) (s >>> 55), k).takeWhile(j -> (s >>> 40 & 32767) + er[j] <= bound[0]).filter(j -> (s & add[j]) == 0)
                    .allMatch(j -> dfs.get().test(((long) (j + 1) << 55) | ((s & ((1L << 55) - 1)) + ((long) er[j] << 40)) | add[j])))
            && new long[]{0, IntStream.of(er).sum()} instanceof long[] r
            && IntStream.range(0, 40).allMatch(i -> r[0] >= r[1] || ((bound[0] = (r[0] + r[1]) / 2) >= 0 && (cnt[0] = 0) == 0 && (dfs.get().test(0L) || true)
                && (cnt[0] >= t ? (r[1] = bound[0]) >= 0 : (r[0] = bound[0] + 1) >= 0)))
            ? r[0]
            : 0);
    }
}
