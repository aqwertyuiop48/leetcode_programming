import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n * m).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && new int[k + 2] instanceof int[] cnt && Arrays.stream(a).allMatch(c -> c == 0 || ++cnt[c] > 0)
            && new int[n * m] instanceof int[] f && new int[n * m + 1] instanceof int[] sm && new long[n * m + 1] instanceof long[] cache
            && new AtomicReference<IntToLongFunction>() instanceof AtomicReference<IntToLongFunction> dfs
            && ((LongBinaryOperator) (ii, cc) -> (cnt[(int) cc] += a[(int) ii] == 0 ? 1 : 0) >= 0 && (f[(int) ii] = sm[(int) ii] | 1 << ((int) cc - 1)) > 0
                ? dfs.get().applyAsLong((int) ii + 1) - 0 * (cnt[(int) cc] -= a[(int) ii] == 0 ? 1 : 0) : 0L) instanceof LongBinaryOperator e
            && ((LongBinaryOperator) (ii, cc) -> cc > k || ((sm[(int) ii] >> ((int) cc - 1)) & 1) == 1 || a[(int) ii] != 0 && a[(int) ii] != cc ? 0L
                : cnt[(int) cc] == 0 ? (cache[(int) ii] >= 0 ? cache[(int) ii] : (cache[(int) ii] = e.applyAsLong(ii, cc))) : e.applyAsLong(ii, cc)) instanceof LongBinaryOperator g
            && dfs.compareAndSet(null, idx -> idx == n * m ? 1L
                : (sm[idx] = (idx >= m ? f[idx - m] : 0) | (idx % m > 0 ? f[idx - 1] : 0)) >= 0 && (cache[idx] = -1) < 0 && n - idx / m + m - idx % m - 1 <= k - Integer.bitCount(sm[idx])
                ? (g.applyAsLong(idx, 1) + g.applyAsLong(idx, 2) + g.applyAsLong(idx, 3) + g.applyAsLong(idx, 4) + g.applyAsLong(idx, 5) + g.applyAsLong(idx, 6) + g.applyAsLong(idx, 7) + g.applyAsLong(idx, 8) + g.applyAsLong(idx, 9) + g.applyAsLong(idx, 10)) % 1000000007L : 0L)
            ? dfs.get().applyAsLong(0) : "");
    }
}
