import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((IntSupplier) () -> new int[1] instanceof int[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer k
            && new int[n + 1] instanceof int[] pos && new boolean[n + 1] instanceof boolean[] kept && new int[n + 2] instanceof int[] bit
            && IntStream.rangeClosed(1, n).allMatch(i -> (pos[nx.getAsInt()] = i) > 0 && (bit[i] = i & -i) > 0)
            && IntStream.range(0, k).allMatch(i -> kept[nx.getAsInt()] = true)
            && new TreeSet<Integer>() instanceof TreeSet<Integer> ts
            && ((IntUnaryOperator) i -> IntStream.iterate(i, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum()) instanceof IntUnaryOperator pref
            ? IntStream.rangeClosed(1, n).mapToLong(v -> kept[v] ? ts.add(pos[v]) ? 0L : 0L
                : Integer.valueOf(pos[v]) instanceof Integer p
                    && Optional.ofNullable(ts.lower(p)).orElse(0) instanceof Integer lo
                    && Optional.ofNullable(ts.higher(p)).orElse(n + 1) instanceof Integer hi
                    && Integer.valueOf(pref.applyAsInt(hi - 1) - pref.applyAsInt(lo)) instanceof Integer w
                    && IntStream.iterate(p, j -> j <= n, j -> j + (j & -j)).allMatch(j -> --bit[j] > -5)
                    ? (long) w : 0L).sum() : "");
    }
}
