import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] lo && new int[n + 1] instanceof int[] hi
            && IntStream.rangeClosed(0, n).allMatch(i -> (lo[i] = 1000000) > 0 && (hi[i] = -1000000) < 0) && (lo[0] = 0) == 0 && (hi[0] = 0) == 0
            && ((IntBinaryOperator) (i, s) -> IntStream.range(i - s, i).map(x -> a[x]).filter(x -> x > 0).distinct().toArray() instanceof int[] d ? d.length == 0 ? 0 : d.length == 1 ? d[0] : -1 : -1) instanceof IntBinaryOperator pin
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(2, Math.min(5, i)).allMatch(s -> Integer.valueOf(pin.applyAsInt(i, s)) instanceof Integer p
                && (p < 0 || lo[i - s] > hi[i - s] || (p == 0
                    ? (lo[i] = Math.min(lo[i], lo[i - s] + 1)) > -5 && (hi[i] = Math.max(hi[i], hi[i - s] + 1)) > -5
                    : p - 1 < lo[i - s] || p - 1 > hi[i - s] || (lo[i] = Math.min(lo[i], p)) > -5 && (hi[i] = Math.max(hi[i], p)) > -5))))
            && new int[]{n, hi[n]} instanceof int[] st && new int[n] instanceof int[] res
            && (lo[n] > hi[n] || IntStream.iterate(0, z -> st[0] > 0, z -> z + 1).allMatch(z -> Integer.valueOf(IntStream.rangeClosed(2, Math.min(5, st[0])).filter(s -> pin.applyAsInt(st[0], s) >= 0 && (pin.applyAsInt(st[0], s) == 0 || pin.applyAsInt(st[0], s) == st[1]) && lo[st[0] - s] <= st[1] - 1 && st[1] - 1 <= hi[st[0] - s]).findFirst().getAsInt()) instanceof Integer s
                && IntStream.range(st[0] - s, st[0]).allMatch(x -> (res[x] = st[1]) > 0) && (st[0] -= s) >= 0 && --st[1] >= 0))
            ? lo[n] > hi[n] ? "-1" : hi[n] + "\n" + Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
