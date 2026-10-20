import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && LongStream.generate(() -> Long.parseLong(it.next())).limit(n).toArray() instanceof long[] h && LongStream.generate(() -> Long.parseLong(it.next())).limit(m).toArray() instanceof long[] p && new int[1] instanceof int[] st
            && ((LongPredicate) T -> (st[0] = 0) == 0 && Arrays.stream(h).allMatch(x -> st[0] >= m || Long.valueOf(Math.max(0, x - p[st[0]])) instanceof Long d && d <= T && Long.valueOf(Math.max(x + T - 2 * d, x + (T - d) / 2)) instanceof Long reach
                && Integer.valueOf(Arrays.binarySearch(p, reach)) instanceof Integer r && (st[0] = Math.max(st[0], r >= 0 ? r + 1 : -r - 1)) >= 0) && st[0] >= m) instanceof LongPredicate ok
            ? LongStream.range(0, 40).boxed().reduce(new long[]{0, 60000000000L}, (q, z) -> q[0] >= q[1] ? q : Long.valueOf((q[0] + q[1]) / 2) instanceof Long mid && ok.test(mid) ? new long[]{q[0], mid} : new long[]{(q[0] + q[1]) / 2 + 1, q[1]}, (x, y) -> x)[0] : "");
    }
}
