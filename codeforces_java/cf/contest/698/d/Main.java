import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer k && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && new long[k] instanceof long[] sx && new long[k] instanceof long[] sy && new long[n] instanceof long[] mx && new long[n] instanceof long[] my
            && IntStream.range(0, k).filter(i -> (sx[i] = sc.nextLong()) * 0 == 0 && (sy[i] = sc.nextLong()) * 0 == 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (mx[i] = sc.nextLong()) * 0 == 0 && (my[i] = sc.nextLong()) * 0 == 0).count() >= 0
            && new int[k * n] instanceof int[] cnt && new int[k * n * k] instanceof int[] bl
            && IntStream.range(0, k * n).filter(si -> Integer.valueOf(si % n) instanceof Integer i && Integer.valueOf(si / n) instanceof Integer s
                && IntStream.range(0, n).filter(m -> m != i && (mx[i] - sx[s]) * (my[m] - sy[s]) == (mx[m] - sx[s]) * (my[i] - sy[s])
                    && Math.min(sx[s], mx[i]) <= mx[m] && mx[m] <= Math.max(sx[s], mx[i]) && Math.min(sy[s], my[i]) <= my[m] && my[m] <= Math.max(sy[s], my[i])
                    && (cnt[si]++ >= k || (bl[si * k + cnt[si] - 1] = m) >= 0)).count() >= 0).count() >= 0
            && Integer.valueOf(IntStream.range(0, k).reduce(1, (a, b) -> a * (b + 1))) instanceof Integer f && IntStream.rangeClosed(0, k).map(t -> IntStream.range(0, t).reduce(1, (a, b) -> a * k)).toArray() instanceof int[] pw && Integer.valueOf(pw[k]) instanceof Integer kk
            && IntStream.range(0, kk).filter(c -> IntStream.range(0, k).map(t -> 1 << (c / pw[t] % k)).reduce(0, (a, b) -> a | b) == (1 << k) - 1).toArray() instanceof int[] codes
            && new int[f * k] instanceof int[] perm
            && IntStream.range(0, f * k).filter(c -> (perm[c] = codes[c / k] / pw[c % k] % k) >= 0).count() >= 0
            && new int[n] instanceof int[] vis && new int[]{0, 0, 0} instanceof int[] cur && new IntPredicate[1] instanceof IntPredicate[] go
            && (go[0] = x -> cur[0] < k && Integer.valueOf(perm[cur[1] * k + cur[0]++] * n + x) instanceof Integer si && cnt[si] < k
                && IntStream.range(0, cnt[si]).allMatch(t -> vis[bl[si * k + t]] == cur[2] || go[0].test(bl[si * k + t])) && (vis[x] = cur[2]) > 0) != null
            ? IntStream.range(0, n).filter(i -> IntStream.range(0, f).anyMatch(p -> (cur[1] = p) >= 0 && (cur[0] = 0) == 0 && ++cur[2] > 0 && go[0].test(i))).count() : "");
    }
}
