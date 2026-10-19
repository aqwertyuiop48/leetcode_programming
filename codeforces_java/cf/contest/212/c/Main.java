import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String t
            && Integer.valueOf(t.length()) instanceof Integer n
            && ((IntPredicate) i -> t.charAt(i) == 'B' && t.charAt((i + 1) % n) == 'A') instanceof IntPredicate pr
            && ((Predicate<int[]>) a -> (a[2] == 1 ? 'A' : a[1] == 1 ? 'B' : t.charAt(a[0] % n)) == 'A' && (a[3] == 1 ? 'A' : a[2] == 1 ? 'B' : t.charAt((a[0] + 1) % n)) == 'B' ? a[2] == 1 : true) instanceof Predicate<int[]> valid
            ? IntStream.range(0, 4).mapToLong(st -> Integer.valueOf(st >> 1) instanceof Integer c0 && Integer.valueOf(st & 1) instanceof Integer c1
                && !(c0 == 1 && c1 == 1) && (c0 == 0 || pr.test(0)) && (c1 == 0 || pr.test(1))
                && new long[n * 4 + 8] instanceof long[] memo && IntStream.range(0, memo.length).allMatch(z -> (memo[z] = -1L) < 0)
                && new AtomicReference<IntToLongFunction>() instanceof AtomicReference<IntToLongFunction> g
                && g.compareAndSet(null, key -> memo[key] >= 0 ? memo[key]
                    : Integer.valueOf(key >> 2) instanceof Integer i && Integer.valueOf(key >> 1 & 1) instanceof Integer ca && Integer.valueOf(key & 1) instanceof Integer cb
                        && (memo[key] = i == n - 1 ? valid.test(new int[]{n - 1, ca, cb, c0}) && valid.test(new int[]{0, cb, c0, c1}) && !(cb == 1 && c0 == 1) ? 1 : 0
                            : IntStream.range(0, 2).mapToLong(cc -> (cc == 0 || pr.test(i + 1) && cb == 0) && valid.test(new int[]{i, ca, cb, cc}) ? g.get().applyAsLong(((i + 1) * 2 + cb) * 2 + cc) : 0).sum()) >= 0 ? memo[key] : 0)
                ? g.get().applyAsLong((1 * 2 + c0) * 2 + c1) : 0).sum() : "");
    }
}
