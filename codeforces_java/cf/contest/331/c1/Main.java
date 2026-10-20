import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().map(String::trim).filter(l -> !l.isEmpty()).findFirst().map(Long::parseLong) instanceof Optional<Long> in
            && in.isPresent()
            && new HashMap<String, long[]>() instanceof HashMap<String, long[]> memo
            && new AtomicReference<Function<long[], long[]>>() instanceof AtomicReference<Function<long[], long[]>> R
            && R.compareAndSet(null, a -> (a[0] + "," + a[1] + "," + a[2]) instanceof String key
                ? (memo.get(key) instanceof long[] hit ? hit
                    : (a[0] == 1
                        ? Long.valueOf(Math.max(a[1], a[2])) instanceof Long m ? (m == 0 ? new long[]{0, 0} : a[2] < m ? new long[]{0, m - a[2]} : new long[]{1, a[1]}) : null
                        : Long.valueOf(LongStream.range(0, a[0] - 1).reduce(1L, (u, v) -> u * 10)) instanceof Long p && new long[]{0, a[2] / p, a[2] % p, 0} instanceof long[] st && new boolean[]{true} instanceof boolean[] go
                        && IntStream.iterate(0, i -> go[0], i -> i + 1).allMatch(i -> R.get().apply(new long[]{a[0] - 1, Math.max(a[1], st[1]), st[2]}) instanceof long[] sub
                            && (st[0] += sub[0]) >= 0 && (st[3] = sub[1]) >= 0
                            && (sub[1] == 0 || st[1] == 0 ? !(go[0] = false) : st[0]++ >= 0 && st[1]-- >= 0 && (st[2] = p - sub[1]) >= 0))
                        ? new long[]{st[0], st[3]} : null) instanceof long[] r
                    && memo.put(key, r) == null ? r : null)
                : null)
            ? R.get().apply(new long[]{19, 0, in.get()})[0] : "");
    }
}
