import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m && (Integer) v[2] instanceof Integer q
            && IntStream.range(0, m).boxed().sorted((x, y) -> Integer.compare(v[5 + 3 * y], v[5 + 3 * x])).mapToInt(x -> x).toArray() instanceof int[] ord
            && new int[2 * n] instanceof int[] p && new int[2 * n] instanceof int[] sz
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> rr
            && rr.getAndSet(x -> p[x] == x ? x : rr.get().applyAsInt(p[x])) == null
            && ((IntUnaryOperator) x -> rr.get().applyAsInt(x)) instanceof IntUnaryOperator rt
            && ((IntBinaryOperator) (x, y) -> sz[x] < sz[y] ? (p[x] = y) + (sz[y] += sz[x]) : (p[y] = x) + (sz[x] += sz[y])) instanceof IntBinaryOperator un
            ? IntStream.range(0, q).mapToObj(j -> IntStream.range(0, 2 * n).filter(i -> (p[i] = i + 0 * (sz[i] = 1)) < 0).count() < 0 ? "" :
                String.valueOf(Arrays.stream(ord).filter(e -> e + 1 >= v[3 + 3 * m + 2 * j] && e + 1 <= v[4 + 3 * m + 2 * j])
                    .filter(e -> (Integer) rt.applyAsInt(v[3 + 3 * e] - 1) instanceof Integer ra && (Integer) rt.applyAsInt(v[4 + 3 * e] - 1) instanceof Integer rb
                        && (ra.intValue() == rb.intValue() || ((Integer) rt.applyAsInt(v[3 + 3 * e] - 1 + n) instanceof Integer rna && (Integer) rt.applyAsInt(v[4 + 3 * e] - 1 + n) instanceof Integer rnb
                            && rb.intValue() != rna.intValue() && un.applyAsInt(ra, rnb) + un.applyAsInt(rna, rb) < 0)))
                    .map(e -> v[5 + 3 * e]).findFirst().orElse(-1))).collect(Collectors.joining("\n")) : "");
    }
}
