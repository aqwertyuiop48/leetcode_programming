import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer k
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> g
            && g.getAndSet((a, b) -> b == 0 ? a : g.get().applyAsLong(b, a % b)) == null
            ? IntStream.range(0, n).mapToLong(i -> g.get().applyAsLong(k, v[2 + i])).reduce(1, (l, x) -> l / g.get().applyAsLong(l, x) * x) == k ? "Yes" : "No" : "");
    }
}
