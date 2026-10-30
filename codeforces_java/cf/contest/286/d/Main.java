import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) == 1 : ps[2] == 0 || (v[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0)
            ? CompletableFuture.supplyAsync(() -> Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m
                && IntStream.concat(IntStream.range(0, n).map(i -> v[2 + 3 * i]), IntStream.range(0, n).map(i -> v[3 + 3 * i])).sorted().distinct().toArray() instanceof int[] ys
                && Integer.valueOf(ys.length) instanceof Integer K
                && IntStream.rangeClosed(0, K).toArray() instanceof int[] nxt
                && LongStream.generate(() -> Long.MAX_VALUE).limit(K).toArray() instanceof long[] T
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
                && fr.compareAndSet(null, x -> nxt[x] == x ? x : (nxt[x] = fr.get().applyAsInt(nxt[x]))) && fr.get() instanceof IntUnaryOperator find
                && IntStream.range(0, n).mapToLong(i -> ((long) v[4 + 3 * i] << 17) | i).sorted().toArray() instanceof long[] order
                && Arrays.stream(order).allMatch(o -> Integer.valueOf((int) (o & 131071)) instanceof Integer i && Integer.valueOf(Arrays.binarySearch(ys, v[3 + 3 * i])) instanceof Integer e
                    && IntStream.iterate(find.applyAsInt(Arrays.binarySearch(ys, v[2 + 3 * i])), k -> k < e, k -> find.applyAsInt(k + 1)).allMatch(k -> (T[k] = v[4 + 3 * i]) >= 0 && (nxt[k] = k + 1) > 0))
                && IntStream.range(0, K - 1).filter(k -> T[k] != Long.MAX_VALUE).mapToLong(k -> 2 * (T[k] - ys[k + 1])).sorted().toArray() instanceof long[] U
                && IntStream.range(0, K - 1).filter(k -> T[k] != Long.MAX_VALUE).mapToLong(k -> 2 * (T[k] - ys[k])).sorted().toArray() instanceof long[] V
                && new long[U.length + 1] instanceof long[] pu && IntStream.range(0, U.length).allMatch(i -> (pu[i + 1] = pu[i] + U[i] / 2) > Long.MIN_VALUE)
                && new long[V.length + 1] instanceof long[] pv && IntStream.range(0, V.length).allMatch(i -> (pv[i + 1] = pv[i] + V[i] / 2) > Long.MIN_VALUE)
                && new StringBuilder() instanceof StringBuilder sb
                && IntStream.range(0, m).allMatch(j -> Long.valueOf(v[2 + 3 * n + j]) instanceof Long q && Integer.valueOf(-Arrays.binarySearch(U, 2 * q - 1) - 1) instanceof Integer cu && Integer.valueOf(-Arrays.binarySearch(V, 2 * q - 1) - 1) instanceof Integer cv
                    && sb.append(j == 0 ? "" : "\n").append(cu * q - pu[cu] - (cv * q - pv[cv])) != null)
                ? sb : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
