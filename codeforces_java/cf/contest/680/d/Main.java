import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new AtomicReference<LongFunction<long[]>>() instanceof AtomicReference<LongFunction<long[]>> f
            && f.getAndSet(m -> m == 0 ? new long[]{0, 0}
                : Long.valueOf(Math.round(Math.cbrt(m))) instanceof Long c0 && Long.valueOf(c0 * c0 * c0 > m ? c0 - 1 : c0) instanceof Long a
                && f.get().apply(m - a * a * a) instanceof long[] r1
                && (a < 2 ? new long[]{0, 0} : f.get().apply(a * a * a - 1 - (a - 1) * (a - 1) * (a - 1))) instanceof long[] r2
                && new long[]{1 + r1[0], a * a * a + r1[1]} instanceof long[] o1
                && new long[]{a < 2 ? 0 : 1 + r2[0], a < 2 ? 0 : (a - 1) * (a - 1) * (a - 1) + r2[1]} instanceof long[] o2
                ? (o1[0] > o2[0] || o1[0] == o2[0] && o1[1] >= o2[1] ? o1 : o2) : null) == null
            && Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long m0
            && f.get().apply(m0) instanceof long[] res
            ? res[0] + " " + res[1] : "");
    }
}
