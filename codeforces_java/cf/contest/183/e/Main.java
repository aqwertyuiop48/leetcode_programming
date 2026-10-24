import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a && (Integer) (m / n) instanceof Integer T
            && LongStream.generate(() -> Long.MAX_VALUE).limit(T + 1).toArray() instanceof long[] qm && new long[T + 1] instanceof long[] sm && new long[T + 1] instanceof long[] acc
            && LongStream.range(0, (long) T * n).allMatch(idx -> (Long) (idx / n + 1) instanceof Long t && (Long) (idx % n + 1) instanceof Long i
                && (qm[(int) (long) t] = Math.min(qm[(int) (long) t], i < n ? a[(int) (long) i - 1] - t * i - t * (t - 1) / 2 * n : Math.min(a[n - 1] - t * n - t * (t - 1) / 2 * n, t * (m - t * n)))) > Long.MIN_VALUE)
            && LongStream.range(0, (long) T * (n - 1)).allMatch(idx -> (Long) (idx / (n - 1) + 1) instanceof Long t && (Long) (idx % (n - 1)) instanceof Long j && (Long) (n - j) instanceof Long i
                && (Long) (a[(int) (long) i - 1] - t * i - t * (t - 1) / 2 * n) instanceof Long c
                && (sm[(int) (long) t] = j == 0 ? Math.min(c, t * (m - t * n)) : Math.min(sm[(int) (long) t], c)) > Long.MIN_VALUE
                && (acc[(int) (long) t] += Math.min(m - t * n, sm[(int) (long) t] - qm[(int) (long) t])) > Long.MIN_VALUE)
            ? LongStream.rangeClosed(1, T).map(t -> qm[(int) t] >= 0 ? t * n * (t * n + 1) / 2 + n * qm[(int) t] + acc[(int) t] : 0).max().getAsLong() : "");
    }
}
