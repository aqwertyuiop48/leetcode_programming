import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new long[n + 1] instanceof long[] p
            && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] + s.nextInt()) > Long.MIN_VALUE)
            && new TreeSet<long[]>((x, y) -> x[0] != y[0] ? Long.compare(x[0], y[0]) : Long.compare(x[1], y[1])) instanceof TreeSet<long[]> set
            && new long[]{Long.MAX_VALUE, 1} instanceof long[] st
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.range(0, n).anyMatch(k -> !(st[1] < i && (i - st[1]) * (i - st[1]) >= st[0] && set.remove(new long[]{p[(int) st[1]], st[1]++})))
                && (Long) (st[0] == Long.MAX_VALUE ? Long.MAX_VALUE / 4 : (long) Math.sqrt(st[0]) + 1) instanceof Long d
                && set.subSet(new long[]{p[i] - d, -1}, new long[]{p[i] + d + 1, -1}).stream().allMatch(q -> (st[0] = Math.min(st[0], (i - q[1]) * (i - q[1]) + (p[i] - q[0]) * (p[i] - q[0]))) > 0)
                && set.add(new long[]{p[i], i}))
            ? st[0] : 0);
    }
}
