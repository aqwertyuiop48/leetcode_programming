import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> cs
            && new byte[(n + 1) * (n + 1) * (n + 1) * (n + 1)] instanceof byte[] memo
            && ((IntBinaryOperator) (x, y) -> x < n && y < n && (cs.get(x).charAt(0) == cs.get(y).charAt(0) || cs.get(x).charAt(1) == cs.get(y).charAt(1)) ? 1 : 0) instanceof IntBinaryOperator match
            && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> f
            && f.compareAndSet(null, st -> Integer.valueOf(((st[0] * (n + 1) + st[1]) * (n + 1) + st[2]) * (n + 1) + st[3]) instanceof Integer key
                && (memo[key] != 0 ? memo[key] == 1
                    : st[0] == 1 || Boolean.valueOf((st[0] >= 2 && match.applyAsInt(st[1], st[2]) == 1 && f.get().test(new int[]{st[0] - 1, st[1], st[3], st[0] >= 4 ? st[0] - 4 : n}))
                        || (st[0] >= 4 && match.applyAsInt(st[1], st[0] - 4) == 1 && f.get().test(new int[]{st[0] - 1, st[2], st[3], st[1]}))) instanceof Boolean r
                        && (memo[key] = (byte) (r ? 1 : 2)) > 0 && r))
            ? f.get().test(new int[]{n, n - 1, n >= 2 ? n - 2 : n, n >= 3 ? n - 3 : n}) ? "YES" : "NO" : "");
    }
}
