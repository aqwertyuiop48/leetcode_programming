import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer n
                && ((ToIntFunction<long[]>) p -> p[1] > 0 || (p[1] == 0 && p[0] > 0) ? 0 : 1) instanceof ToIntFunction<long[]> h
                && ((Comparator<long[]>) (p, q) -> h.applyAsInt(p) != h.applyAsInt(q) ? h.applyAsInt(p) - h.applyAsInt(q) : Math.multiplyHigh(p[1], q[0]) != Math.multiplyHigh(p[0], q[1]) ? Long.compare(Math.multiplyHigh(p[1], q[0]), Math.multiplyHigh(p[0], q[1])) : Long.compareUnsigned(p[1] * q[0], p[0] * q[1])) instanceof Comparator<long[]> cmp
                && IntStream.range(0, n).mapToObj(i -> new long[]{o[2 * i + 1], o[2 * i + 2], i + 1}).sorted(cmp).toArray(long[][]::new) instanceof long[][] v
                && IntStream.range(0, n).mapToObj(k -> new long[]{v[k][0] * v[(k + 1) % n][0] + v[k][1] * v[(k + 1) % n][1], v[k][0] * v[(k + 1) % n][1] - v[k][1] * v[(k + 1) % n][0], v[k][2], v[(k + 1) % n][2]}).min(cmp).get() instanceof long[] best
                ? best[2] + " " + best[3] : "");
    }
}
