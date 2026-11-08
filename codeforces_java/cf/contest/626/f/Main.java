import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1] + 1) instanceof Integer K && IntStream.range(0, n).map(i -> tok[2 + i]).sorted().toArray() instanceof int[] a
            && new int[2][(n + 2) * K] instanceof int[][] buf && (buf[0][0] = 1) == 1
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(i == 0 ? 0 : a[i] - a[i - 1]) instanceof Integer d && buf[i & 1] instanceof int[] old && buf[(i & 1) ^ 1] instanceof int[] nw
                && ((IntBinaryOperator) (x, t) -> t >= x * d ? old[x * K + t - x * d] : 0) instanceof IntBinaryOperator S
                && IntStream.rangeClosed(0, Math.min(i + 1, n - 1 - i)).allMatch(j -> IntStream.range(0, K).allMatch(t -> (nw[j * K + t] = (int) (((j + 1L) * ((long) S.applyAsInt(j, t) + S.applyAsInt(j + 1, t)) + (j > 0 ? S.applyAsInt(j - 1, t) : 0)) % 1000000007L)) >= 0)))
            ? IntStream.range(0, K).mapToLong(t -> buf[n & 1][t]).sum() % 1000000007L : -1);
    }
}
