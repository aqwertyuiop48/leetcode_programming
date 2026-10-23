import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] tk
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) (int) tk[0] instanceof Integer m
            && (Integer) (1 << m) instanceof Integer n
            && (Long) tk[1] instanceof Long t
            && (Long) (tk[2] * n) instanceof Long Q
            && new long[22 * 22] instanceof long[] cb
            && IntStream.range(0, 22).allMatch(i -> (cb[i * 22] = 1) > 0 && IntStream.range(1, 22).allMatch(j ->
                (cb[i * 22 + j] = i == 0 ? 0 : cb[(i - 1) * 22 + j - 1] + cb[(i - 1) * 22 + j]) >= 0))
            && ((LongBinaryOperator) (x, y) -> Math.floorMod(x * y - (long) ((double) x * y / Q) * Q, Q)) instanceof LongBinaryOperator mul
            && new long[m + 1] instanceof long[] lam
            && IntStream.rangeClosed(0, m).allMatch(w ->
                (lam[w] = Math.floorMod(IntStream.rangeClosed(0, m).mapToLong(j ->
                    tk[3 + n + j] * IntStream.rangeClosed(0, Math.min(j, w)).filter(i -> j - i <= m - w).mapToLong(i ->
                        (i % 2 == 0 ? 1 : -1) * cb[w * 22 + i] * cb[(m - w) * 22 + j - i]).sum()).sum(), Q)) >= 0)
            && new long[m + 1] instanceof long[] lp
            && new long[2] instanceof long[] st
            && IntStream.rangeClosed(0, m).allMatch(w ->
                (st[0] = 1 % Q) >= 0 && (st[1] = lam[w]) >= 0
                && IntStream.range(0, 62).allMatch(bit ->
                    (((t >> bit) & 1) == 0 || (st[0] = mul.applyAsLong(st[0], st[1])) >= 0)
                    && (st[1] = mul.applyAsLong(st[1], st[1])) >= 0)
                && (lp[w] = st[0]) >= 0)
            && new long[n] instanceof long[] a
            && IntStream.range(0, n).allMatch(i -> (a[i] = Math.floorMod(tk[3 + i], Q)) >= 0)
            && new long[1] instanceof long[] tmp
            && ((BooleanSupplier) () -> IntStream.iterate(1, h -> h < n, h -> h * 2).allMatch(h -> IntStream.range(0, n / 2).allMatch(q ->
                (tmp[0] = a[q + (q & -h)]) >= 0
                && (a[q + (q & -h)] = tmp[0] + a[q + (q & -h) + h] >= Q ? tmp[0] + a[q + (q & -h) + h] - Q : tmp[0] + a[q + (q & -h) + h]) >= 0
                && (a[q + (q & -h) + h] = tmp[0] < a[q + (q & -h) + h] ? tmp[0] - a[q + (q & -h) + h] + Q : tmp[0] - a[q + (q & -h) + h]) >= 0))) instanceof BooleanSupplier wht
            && wht.getAsBoolean()
            && IntStream.range(0, n).allMatch(i -> (a[i] = mul.applyAsLong(a[i], lp[Integer.bitCount(i)])) >= 0)
            && wht.getAsBoolean()
            ? Arrays.stream(a).mapToObj(v -> String.valueOf(v / n)).collect(Collectors.joining("\n")) : "");
    }
}
