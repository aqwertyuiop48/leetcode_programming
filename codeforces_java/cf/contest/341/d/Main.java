import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new long[b0.length / 2 + 2] instanceof long[] nums && new long[1] instanceof long[] cur && new int[3] instanceof int[] f
            && IntStream.range(0, raw.length).mapToLong(i -> raw[i] >= 48 ? (cur[0] = cur[0] * 10 + raw[i] - 48) * 0 + (f[1] = 1) * 0L : raw[i] == 45 ? (f[0] = 1) * 0L : f[1] == 1 ? (nums[f[2]++] = f[0] == 1 ? -cur[0] : cur[0]) * 0 + (cur[0] = 0) * 0 + (f[0] = 0) * 0 + (f[1] = 0) * 0 : 0L).sum() == 0
            && new int[] {0} instanceof int[] pos && ((LongSupplier) () -> nums[pos[0]++]) instanceof LongSupplier nl && Integer.valueOf((int) nl.getAsLong()) instanceof Integer n && Integer.valueOf((int) nl.getAsLong()) instanceof Integer m
            && Integer.valueOf(n + 2) instanceof Integer W && new long[4 * W * W] instanceof long[] T
            && new int[(n + 2) * 12] instanceof int[] cd && new int[n + 2] instanceof int[] cdn && new int[(n + 2) * 12] instanceof int[] cu && new int[n + 2] instanceof int[] cun
            && IntStream.rangeClosed(1, n + 1).allMatch(x -> IntStream.iterate(x, y -> y > 0, y -> y - (y & -y)).toArray() instanceof int[] ch && (cdn[x] = ch.length) > 0 && IntStream.range(0, ch.length).allMatch(k -> (cd[x * 12 + k] = ch[k]) > 0)
                && IntStream.iterate(x, y -> y <= n, y -> y + (y & -y)).toArray() instanceof int[] ch2 && (cun[x] = ch2.length) >= 0 && IntStream.range(0, ch2.length).allMatch(k -> (cu[x * 12 + k] = ch2[k]) > 0))
            && new long[1] instanceof long[] vv
            && ((LongBinaryOperator) (X, Y) -> X == 0 || Y == 0 ? 0L : IntStream.range(0, cdn[(int) X] * cdn[(int) Y]).mapToLong(r -> T[(((int) X & 1) * 2 + ((int) Y & 1)) * W * W + cd[(int) X * 12 + r / cdn[(int) Y]] * W + cd[(int) Y * 12 + r % cdn[(int) Y]]]).reduce(0L, (a, b) -> a ^ b)) instanceof LongBinaryOperator qp
            && ((IntBinaryOperator) (X, Y) -> X > n || Y > n || X == 0 || Y == 0 ? 0 : (int) IntStream.range(0, cun[X] * cun[Y]).mapToLong(r -> T[((X & 1) * 2 + (Y & 1)) * W * W + cu[X * 12 + r / cun[Y]] * W + cu[Y * 12 + r % cun[Y]]] ^= vv[0]).sum()) instanceof IntBinaryOperator up)
            System.out.print(IntStream.range(0, m).mapToObj(q -> Integer.valueOf((int) nl.getAsLong()) instanceof Integer t && Integer.valueOf((int) nl.getAsLong()) instanceof Integer x0 && Integer.valueOf((int) nl.getAsLong()) instanceof Integer y0 && Integer.valueOf((int) nl.getAsLong()) instanceof Integer x1 && Integer.valueOf((int) nl.getAsLong()) instanceof Integer y1
                ? (t == 1
                    ? String.valueOf(qp.applyAsLong(x1, y1) ^ qp.applyAsLong(x0 - 1, y1) ^ qp.applyAsLong(x1, y0 - 1) ^ qp.applyAsLong(x0 - 1, y0 - 1))
                    : (vv[0] = nl.getAsLong()) >= Long.MIN_VALUE && up.applyAsInt(x0, y0) + up.applyAsInt(x0, y1 + 1) + up.applyAsInt(x1 + 1, y0) + up.applyAsInt(x1 + 1, y1 + 1) >= 0 ? "" : "")
                : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")));
    }
}

