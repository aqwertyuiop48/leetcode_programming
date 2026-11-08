import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= 48
                ? (st[0] = Math.max(st[0], 0) * 10 + raw[i] - 48) < 0
                : st[0] >= 0 && (v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Long.valueOf(v[1]) instanceof Long a && Long.valueOf(v[2]) instanceof Long b
            && ((LongBinaryOperator) ((r, p) -> r == 0 ? 0 : (r == 1 || r == p - 1) ? b : 1000000000000000000L)) instanceof LongBinaryOperator kcf
            && Stream.of(v[3] - 1, v[3], v[3] + 1, v[2 + n] - 1, v[2 + n], v[2 + n] + 1)
                .flatMapToInt(x -> IntStream.rangeClosed(1, (int) Math.sqrt(x)).filter(d -> x % d == 0).flatMap(d -> IntStream.of(d, x / d)))
                .distinct().filter(p -> p > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(p)).noneMatch(q -> p % q == 0)).toArray() instanceof int[] ps
            ? Arrays.stream(ps).mapToLong(p -> new long[]{kcf.applyAsLong(v[3] % p, p), a, 1000000000000000000L, kcf.applyAsLong(v[3] % p, p)} instanceof long[] s
                && IntStream.range(1, n).map(i -> v[3 + i] % p).mapToLong(r -> kcf.applyAsLong(r, p))
                    .filter(kc -> (s[3] = Math.min(1000000000000000000L, Math.min(Math.min(s[1], s[2]), s[3]) + kc)) < 0
                        | (s[2] = Math.min(1000000000000000000L, Math.min(s[0], s[2]) + a)) < 0
                        | (s[1] += a) < 0
                        | (s[0] = Math.min(1000000000000000000L, s[0] + kc)) < 0).count() >= 0
                ? Math.min(Math.min(s[0], s[2]), s[3]) : 0L).min().getAsLong() : "");
    }
}
