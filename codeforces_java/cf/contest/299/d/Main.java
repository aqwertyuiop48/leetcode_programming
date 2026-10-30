import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && (n + m - 1 > k ? Boolean.FALSE : Boolean.TRUE) instanceof Boolean ok
            ? !ok ? 0L
            : IntStream.range(0, n * m).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && new int[k + 1] instanceof int[] cnt && Arrays.stream(a).allMatch(c -> c == 0 || ++cnt[c] > 0)
            && IntStream.range(0, n * m).map(i -> IntStream.range(0, n * m).filter(j -> j != i && a[j] > 0 && (j / m - i / m) * (j % m - i % m) >= 0).map(j -> 1 << (a[j] - 1)).reduce(0, (p, q) -> p | q)).toArray() instanceof int[] forb
            && new int[n * m] instanceof int[] f && new long[n * m + 1] instanceof long[] calc
            && new AtomicReference<IntToLongFunction>() instanceof AtomicReference<IntToLongFunction> rec
            && rec.compareAndSet(null, code -> Integer.valueOf(code >> 4) instanceof Integer idx
                ? idx == n * m ? 1L
                : Integer.valueOf(code & 15) instanceof Integer c
                    && Integer.valueOf((idx >= m ? f[idx - m] : 0) | (idx % m > 0 ? f[idx - 1] : 0)) instanceof Integer s
                    && (c != 1 || (calc[idx] = -1) < 0)
                ? c > k || n - idx / m + m - idx % m - 1 > k - Integer.bitCount(s) ? 0L
                : ((((s | forb[idx]) >> (c - 1) & 1) == 0 && (a[idx] == 0 || a[idx] == c)
                    ? (cnt[c] += a[idx] == 0 ? 1 : 0) >= 0 && (f[idx] = s | 1 << (c - 1)) > 0
                        && Long.valueOf(a[idx] == 0 && cnt[c] == 1 ? calc[idx] >= 0 ? calc[idx] : (calc[idx] = rec.get().applyAsLong((idx + 1) << 4 | 1)) : rec.get().applyAsLong((idx + 1) << 4 | 1)) instanceof Long r
                        && (cnt[c] -= a[idx] == 0 ? 1 : 0) >= 0 ? r : 0L
                    : 0L) + rec.get().applyAsLong(code + 1)) % 1000000007L : 0L : 0L)
            ? rec.get().applyAsLong(1) : 0L : 0L);
    }
}
