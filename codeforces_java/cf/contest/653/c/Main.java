import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new int[n + 2] instanceof int[] t
            && IntStream.rangeClosed(1, n).filter(i -> (t[i] = Integer.parseInt(st.nextToken())) < 0).count() == 0
            && ((IntPredicate) k -> k % 2 == 1 ? t[k] >= t[k + 1] : t[k] <= t[k + 1]) instanceof IntPredicate bad
            && Integer.valueOf((int) IntStream.range(1, n).filter(bad).count()) instanceof Integer cb
            && Integer.valueOf(IntStream.range(1, n).filter(bad).findFirst().orElse(1)) instanceof Integer k0
            && ((IntBinaryOperator) (x, y) -> IntStream.of(x - 1, x, y - 1, y).filter(a -> a >= 1 && a <= n - 1).distinct().toArray() instanceof int[] aff
                && ((IntUnaryOperator) i -> i == x ? t[y] : i == y ? t[x] : t[i]) instanceof IntUnaryOperator v
                && cb - Arrays.stream(aff).map(a -> bad.test(a) ? 1 : 0).sum() + Arrays.stream(aff).map(a -> (a % 2 == 1 ? v.applyAsInt(a) >= v.applyAsInt(a + 1) : v.applyAsInt(a) <= v.applyAsInt(a + 1)) ? 1 : 0).sum() == 0 ? 1 : 0) instanceof IntBinaryOperator chk
            ? (cb > 4 ? 0L : IntStream.of(k0, k0 + 1).mapToLong(x -> IntStream.rangeClosed(1, n).filter(y -> y != x && !(x == k0 + 1 && y == k0) && chk.applyAsInt(x, y) == 1).count()).sum()) : "");
    }
}
