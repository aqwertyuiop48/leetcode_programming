import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n * m).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && new int[k + 1] instanceof int[] cnt && Arrays.stream(a).allMatch(c -> c == 0 || ++cnt[c] > 0)
            && new int[n * m] instanceof int[] f && Long.valueOf(1000000007L) instanceof Long M
            && new AtomicReference<IntToLongFunction>() instanceof AtomicReference<IntToLongFunction> dfs
            && dfs.compareAndSet(null, idx -> idx == n * m ? 1L
                : Integer.valueOf(idx / m) instanceof Integer x && Integer.valueOf(idx % m) instanceof Integer y
                && Integer.valueOf((x > 0 ? f[idx - m] : 0) | (y > 0 ? f[idx - 1] : 0)) instanceof Integer s
                && new long[]{-1, 0} instanceof long[] st
                ? n - x + m - y - 1 > k - Integer.bitCount(s) ? 0L
                : IntStream.rangeClosed(1, k).filter(c -> (s >> (c - 1) & 1) == 0 && (a[idx] == 0 || a[idx] == c)).allMatch(c -> cnt[c] == 0 && st[0] >= 0 ? (st[1] = (st[1] + st[0]) % M) >= 0
                    : Boolean.valueOf(cnt[c] == 0) instanceof Boolean fresh && (cnt[c] += a[idx] == 0 ? 1 : 0) >= 0 && (f[idx] = s | 1 << (c - 1)) > 0
                    && Long.valueOf(dfs.get().applyAsLong(idx + 1)) instanceof Long tmp
                    && (cnt[c] -= a[idx] == 0 ? 1 : 0) >= 0 && (!fresh || (st[0] = tmp) >= 0) && (st[1] = (st[1] + tmp) % M) >= 0) ? st[1] : 0L : 0L)
            ? dfs.get().applyAsLong(0) : "");
    }
}
