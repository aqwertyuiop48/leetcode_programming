import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long a && Long.valueOf(t[2]) instanceof Long b && Long.valueOf(t[3]) instanceof Long T && t[4] instanceof String s
            && IntStream.range(0, n).mapToLong(i -> 1 + (s.charAt(i) == 'w' ? b : 0)).toArray() instanceof long[] v
            && new long[n + 1] instanceof long[] pr && new long[n + 1] instanceof long[] pl
            && IntStream.range(1, n).filter(i -> (pr[i] = pr[i - 1] + v[i]) > 0 & (pl[i] = pl[i - 1] + v[n - i]) > 0).count() >= 0
            && Stream.<LongBinaryOperator>of((r, l) -> v[0] + pr[(int) r] + pl[(int) l] + a * Math.min(2 * r + l, 2 * l + r)).findFirst().get() instanceof LongBinaryOperator cost
            && new long[]{n - 1, 0} instanceof long[] sb
            ? IntStream.range(0, n).allMatch(r -> (sb[0] = Math.min(sb[0], n - 1 - r)) > -5
                && IntStream.iterate(0, z -> sb[0] >= 0 && cost.applyAsLong(r, sb[0]) > T, z -> z + 1).filter(z -> --sb[0] >= -1).count() >= 0
                && sb[0] >= 0 && (sb[1] = Math.max(sb[1], 1 + r + sb[0])) > 0) ? sb[1] : sb[1] : "");
    }
}
