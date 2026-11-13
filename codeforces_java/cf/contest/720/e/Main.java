import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            ? CompletableFuture.supplyAsync((Supplier<String>) () -> Integer.valueOf(tk.nextToken()) instanceof Integer tc
                && new long[19] instanceof long[] p10 && (p10[0] = 1) == 1
                && IntStream.range(1, 19).allMatch(i -> (p10[i] = p10[i - 1] * 10) > 0)
                ? IntStream.range(0, tc).mapToObj(ti -> Integer.valueOf(tk.nextToken()) instanceof Integer n && Long.valueOf(Long.parseLong(tk.nextToken())) instanceof Long x
                    && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).toArray(String[]::new) instanceof String[] lines
                    && Long.valueOf(p10[n]) instanceof Long zz && new long[]{0} instanceof long[] best
                    && ((LongBinaryOperator) (j, yy) -> new long[]{0, -1} instanceof long[] st
                        && IntStream.range(0, 40).anyMatch(it -> st[1] >= 0 ? true
                            : lines[n - 1 - (int) j].charAt((int) (((x + st[0]) / p10[(int) j]) % 10)) != lines[n - 1 - (int) j].charAt((int) (((yy + st[0]) / p10[(int) j]) % 10))
                                ? (st[1] = st[0]) >= 0
                                : (st[0] += Math.min(p10[(int) j] - (x + st[0]) % p10[(int) j], p10[(int) j] - (yy + st[0]) % p10[(int) j])) >= p10[(int) j + 1]
                                    && (st[1] = Long.MAX_VALUE / 4) > 0)
                        ? st[1] : 0L) instanceof LongBinaryOperator fm
                    && new AtomicReference<Function<long[], Long>>() instanceof AtomicReference<Function<long[], Long>> dfs
                    && dfs.updateAndGet(zq -> v -> v[0] >= n ? 0L
                        : IntStream.range(0, 10).allMatch(d -> Long.valueOf(v[1] + d * p10[(int) v[0]]) instanceof Long y2
                            && Long.valueOf(Math.min(v[2], fm.applyAsLong(v[0], y2))) instanceof Long nb
                            && (v[0] == n - 1 ? (y2.equals(x) || (best[0] = Math.max(best[0], Math.min(nb, zz - Math.max(x, y2)))) < 0 || true)
                                : (Math.min(nb, zz - Math.max(x, y2)) <= best[0] || dfs.get().apply(new long[]{v[0] + 1, y2, nb}) >= 0 || true)) || true) ? 0L : 0L) != null
                    && dfs.get().apply(new long[]{0, 0, Long.MAX_VALUE / 4}) >= 0
                    ? String.valueOf(best[0]) : "").collect(Collectors.joining("\n")) : "", r -> new Thread(null, r, "t", 1L << 28).start()).join() : "");
    }
}
