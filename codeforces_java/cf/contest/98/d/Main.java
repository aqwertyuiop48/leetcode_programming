import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && (Integer) Integer.parseInt(tk[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk[1 + i])).toArray() instanceof int[] d
            && IntStream.range(0, n).filter(i -> i == 0 || d[i] != d[i - 1]).toArray() instanceof int[] st
            && (Integer) st.length instanceof Integer k
            && IntStream.range(0, k).map(j -> (j + 1 < k ? st[j + 1] : n) - st[j]).toArray() instanceof int[] c
            && new long[k + 2] instanceof long[] u
            && new long[k + 2] instanceof long[] oc
            && IntStream.range(0, k).map(i -> k - 1 - i).allMatch(j ->
                (u[j] = 2 * u[j + 1] + c[j]) >= 0
                && (oc[j] = j == k - 1 ? 2L * c[j] - 1
                    : c[j] == 1 ? 2 * u[j + 1] + 1
                    : Math.min(2 * u[j + 1] + 2 * c[j] + oc[j + 1], 4 * u[j + 1] + 2 * c[j] - 1)) >= 0)
            && new byte[(int) (4 * oc[0] + 64)] instanceof byte[] buf
            && new int[1] instanceof int[] ps
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] put
            && (put[0] = (cnt, mvs) -> IntStream.range(0, cnt).allMatch(z ->
                (buf[ps[0]++] = (byte) ('0' + (mvs >> 2))) > 0
                && (buf[ps[0]++] = ' ') > 0
                && (buf[ps[0]++] = (byte) ('0' + (mvs & 3))) > 0
                && (buf[ps[0]++] = '\n') > 0) ? 1 : 1) != null
            && new IntPredicate[2] instanceof IntPredicate[] fn
            && (fn[0] = a ->
                (a >> 4) >= k
                || (fn[0].test((((a >> 4) + 1) << 4) | ((a & 12) | (6 - ((a >> 2) & 3) - (a & 3))))
                    && put[0].applyAsInt(c[a >> 4], a & 15) > 0
                    && fn[0].test((((a >> 4) + 1) << 4) | (((6 - ((a >> 2) & 3) - (a & 3)) << 2) | (a & 3))))) != null
            && (fn[1] = a ->
                (Integer) (a >> 4) instanceof Integer i
                && (Integer) ((a >> 2) & 3) instanceof Integer x
                && (Integer) (a & 3) instanceof Integer y
                && (Integer) (6 - x - y) instanceof Integer z
                && (i == k - 1
                    ? put[0].applyAsInt(c[i] - 1, x * 4 + z) > 0 && put[0].applyAsInt(1, x * 4 + y) > 0 && put[0].applyAsInt(c[i] - 1, z * 4 + y) > 0
                    : c[i] == 1
                        ? fn[0].test(((i + 1) << 4) | (x * 4 + z)) && put[0].applyAsInt(1, x * 4 + y) > 0 && fn[0].test(((i + 1) << 4) | (z * 4 + y))
                        : 2 * u[i + 1] + 2 * c[i] + oc[i + 1] <= 4 * u[i + 1] + 2 * c[i] - 1
                            ? fn[0].test(((i + 1) << 4) | (x * 4 + y)) && put[0].applyAsInt(c[i], x * 4 + z) > 0
                                && fn[0].test(((i + 1) << 4) | (y * 4 + x)) && put[0].applyAsInt(c[i], z * 4 + y) > 0
                                && fn[1].test(((i + 1) << 4) | (x * 4 + y))
                            : fn[0].test(((i + 1) << 4) | (x * 4 + y)) && put[0].applyAsInt(c[i] - 1, x * 4 + z) > 0
                                && fn[0].test(((i + 1) << 4) | (y * 4 + z)) && put[0].applyAsInt(1, x * 4 + y) > 0
                                && fn[0].test(((i + 1) << 4) | (z * 4 + x)) && put[0].applyAsInt(c[i] - 1, z * 4 + y) > 0
                                && fn[0].test(((i + 1) << 4) | (x * 4 + y)))) != null
            && fn[1].test((1 << 2) | 3)
            ? new StringBuilder().append(ps[0] / 4).append('\n').append(new String(buf, 0, ps[0], StandardCharsets.ISO_8859_1)).toString().trim()
            : "");
    }
}

