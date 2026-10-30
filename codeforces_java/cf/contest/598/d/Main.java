import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer n && (Integer) o[1] instanceof Integer m && (Integer) (m + 2) instanceof Integer w
                && (Integer) ((n + 2) * w) instanceof Integer len
                && new byte[len] instanceof byte[] g && new int[len] instanceof int[] comp && new int[len + 2] instanceof int[] cnt && new int[len] instanceof int[] q
                && new int[4] instanceof int[] z
                && IntStream.range(0, raw.length).filter(i -> (raw[i] == 42 || raw[i] == 46) && (g[(1 + z[3] / m) * w + 1 + z[3]++ % m] = raw[i]) < 0).count() >= 0
                && ((IntUnaryOperator) nb -> g[nb] != 46 ? (cnt[z[2]]++ & 0) : comp[nb] == 0 ? ((comp[nb] = z[2]) * 0 + (q[z[1]++] = nb) * 0) : 0) instanceof IntUnaryOperator visit
                && IntStream.range(0, len).filter(c -> g[c] == 46 && comp[c] == 0 && (z[2] += 1) > 0 && (comp[c] = z[2]) > 0 && (q[z[1]++] = c) >= 0
                        && IntStream.generate(() -> 0).takeWhile(zz -> z[0] < z[1] && (Integer) q[z[0]++] instanceof Integer u && visit.applyAsInt(u + 1) + visit.applyAsInt(u - 1) + visit.applyAsInt(u + w) + visit.applyAsInt(u - w) >= 0).count() >= 0).count() >= 0
                ? IntStream.range(0, o[2]).mapToObj(j -> String.valueOf(cnt[comp[o[3 + 2 * j] * w + o[4 + 2 * j]]])).collect(Collectors.joining("\n")) : "");
    }
}
