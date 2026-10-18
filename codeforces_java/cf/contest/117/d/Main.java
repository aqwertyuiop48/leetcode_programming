import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && new long[4] instanceof long[] q
            && new long[5] instanceof long[] w
            && ((ToLongFunction<long[]>) a ->
                (w[0] = q[2] <= a[1] ? 0L : (q[2] - a[1] + a[2] - 1) / a[2]) >= 0
                && (w[1] = q[3] < a[1] ? -1L : Math.min(a[3] - 1, (q[3] - a[1]) / a[2])) >= -1
                && w[0] <= w[1]
                    ? ((w[2] = w[1] - w[0] + 1) > 0
                        && (w[3] = (a[1] + w[0] * a[2]) % t[2]) >= 0
                        && (w[4] = w[2] % 2 == 0 ? (w[2] / 2 % t[2]) * ((w[2] - 1) % t[2]) % t[2] : (w[2] % t[2]) * ((w[2] - 1) / 2 % t[2]) % t[2]) >= 0
                        ? ((w[2] % t[2]) * w[3] + (a[2] % t[2]) * w[4]) % t[2] : 0L)
                    : 0L) instanceof ToLongFunction<long[]> ap
            && new AtomicReference<ToLongFunction<long[]>>() instanceof AtomicReference<ToLongFunction<long[]>> rr
            && rr.getAndSet(nd ->
                nd[0] + nd[3] - 1 < q[0] || nd[0] > q[1] ? 0L
                : q[0] <= nd[0] && nd[0] + nd[3] - 1 <= q[1] ? ap.applyAsLong(nd)
                : (rr.get().applyAsLong(new long[]{nd[0], nd[1], 2 * nd[2], (nd[3] + 1) / 2})
                    + rr.get().applyAsLong(new long[]{nd[0] + (nd[3] + 1) / 2, nd[1] + nd[2], 2 * nd[2], nd[3] / 2})) % t[2]) == null
            ? IntStream.range(0, (int) t[1]).mapToObj(i ->
                (q[0] = t[3 + 4 * i]) >= 0 && (q[1] = t[4 + 4 * i]) >= 0 && (q[2] = t[5 + 4 * i]) >= 0 && (q[3] = t[6 + 4 * i]) >= 0
                    ? String.valueOf(rr.get().applyAsLong(new long[]{1, 1, 1, t[0]})) : "")
                .collect(Collectors.joining("\n"))
            : "");
    }
}
