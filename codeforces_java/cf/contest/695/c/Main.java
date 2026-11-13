import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw
            && new long[b0.length / 2 + 2] instanceof long[] nums && new long[5] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (st[4] = raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0 : raw[i] == 45 ? (st[3] = 1) * 0 : st[1] == 1 ? (nums[(int) st[2]++] = st[3] == 1 ? -st[0] : st[0]) * 0 + (st[0] = 0) * 0 + (st[1] = 0) * 0 + (st[3] = 0) * 0 : 0) > 5).count() >= 0
            && Integer.valueOf((int) nums[0]) instanceof Integer k && Integer.valueOf((int) nums[1]) instanceof Integer n
            && IntStream.range(0, k).mapToLong(j -> nums[2 + 2 * j]).toArray() instanceof long[] sx && IntStream.range(0, k).mapToLong(j -> nums[3 + 2 * j]).toArray() instanceof long[] sy
            && IntStream.range(0, n).mapToLong(j -> nums[2 + 2 * k + 2 * j]).toArray() instanceof long[] mx && IntStream.range(0, n).mapToLong(j -> nums[3 + 2 * k + 2 * j]).toArray() instanceof long[] my
            && new int[k * n] instanceof int[] bc && new int[k * n * 7] instanceof int[] bl
            && IntStream.range(0, k * n).filter(q -> Integer.valueOf(q / n) instanceof Integer s && Integer.valueOf(q % n) instanceof Integer i && Long.valueOf(mx[i] - sx[s]) instanceof Long dx && Long.valueOf(my[i] - sy[s]) instanceof Long dy
                && Long.valueOf(dx * dx + dy * dy) instanceof Long len
                && IntStream.range(0, n).filter(j -> j != i && (mx[j] - sx[s]) * dy - (my[j] - sy[s]) * dx == 0 && (mx[j] - sx[s]) * dx + (my[j] - sy[s]) * dy > 0 && (mx[j] - sx[s]) * dx + (my[j] - sy[s]) * dy < len).limit(k).toArray() instanceof int[] bs
                && (bc[q] = bs.length >= k ? 99 : bs.length) >= 0 && bs.length < k && IntStream.range(0, bs.length).filter(t -> (bl[q * 7 + t] = bs[t]) < 0).count() >= 0).count() >= 0
            && IntStream.iterate(1, x -> x * k).limit(k).toArray() instanceof int[] pw
            && IntStream.range(0, pw[k - 1] * k).filter(code -> IntStream.range(0, k).map(d -> 1 << (code / pw[d] % k)).reduce(0, (a, b) -> a | b) == (1 << k) - 1).toArray() instanceof int[] codes
            && IntStream.of(codes).flatMap(code -> IntStream.range(0, k).map(d -> code / pw[d] % k)).toArray() instanceof int[] perms
            && new int[n] instanceof int[] dead && new int[8] instanceof int[] fx && new int[8] instanceof int[] fs && new int[8] instanceof int[] fi && new int[6] instanceof int[] ctl && new int[4] instanceof int[] sc
            && ((IntBinaryOperator) (x, p) -> (++ctl[3]) > 0 && (ctl[1] = 1) == 1 && (ctl[2] = 0) == 0 && (ctl[4] = p * k) >= 0 && (fx[0] = x) == x && (fs[0] = perms[p * k]) >= 0 && (fi[0] = 0) == 0 && (ctl[0] = 1) == 1 && bc[fs[0] * n + x] < k
                && IntStream.iterate(0, z -> ctl[0] > 0 && ctl[2] == 0, z -> z + 1).filter(z -> (sc[0] = ctl[0] - 1) >= 0 && (sc[1] = fs[sc[0]] * n + fx[sc[0]]) >= 0
                    && (fi[sc[0]] < bc[sc[1]]
                        ? (sc[2] = bl[sc[1] * 7 + fi[sc[0]]++]) >= 0 && (dead[sc[2]] == ctl[3] || (ctl[1] >= k ? (ctl[2] = 1) < 0
                            : (sc[3] = perms[ctl[4] + ctl[1]++]) >= 0 && (bc[sc[3] * n + sc[2]] >= k ? (ctl[2] = 1) < 0 : (fx[ctl[0]] = sc[2]) >= 0 && (fs[ctl[0]] = sc[3]) >= 0 && (fi[ctl[0]++] = 0) == 0)))
                        : (dead[fx[sc[0]]] = ctl[3]) >= 0 && --ctl[0] >= 0)).count() >= 0 && ctl[2] == 0 ? 1 : 0) instanceof IntBinaryOperator sim
            && Integer.valueOf(perms.length / k) instanceof Integer np
            ? Long.toString(IntStream.range(0, n).filter(i -> IntStream.range(0, k).anyMatch(s -> bc[s * n + i] == 0) || IntStream.range(0, k).anyMatch(s -> bc[s * n + i] < k) && IntStream.range(0, np).anyMatch(p -> sim.applyAsInt(i, p) == 1)).count()) : "");
    }
}
