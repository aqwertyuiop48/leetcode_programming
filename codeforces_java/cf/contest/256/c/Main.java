import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(881920) instanceof Integer M
            && new int[5][M + 2] instanceof int[][] pc
            && new long[5] instanceof long[] st
            && ((LongUnaryOperator) a -> Long.valueOf((long) Math.sqrt(a)) instanceof Long h0
                && Long.valueOf(Math.min(h0 * h0 > a ? h0 - 1 : (h0 + 1) * (h0 + 1) <= a ? h0 + 1 : h0, a - 1)) instanceof Long hi
                && Long.valueOf((long) Math.ceil(Math.sqrt(Math.sqrt(a)))) instanceof Long l0
                && Long.valueOf(l0 * l0 * l0 * l0 < a ? l0 + 1 : l0 > 0 && (l0 - 1) * (l0 - 1) * (l0 - 1) * (l0 - 1) >= a ? l0 - 1 : l0) instanceof Long lo
                ? lo > hi ? 0 : IntStream.range(0, 5).filter(v -> pc[v][(int) (hi + 1)] - pc[v][(int) (long) lo] == 0).findFirst().getAsInt() : 0) instanceof LongUnaryOperator g
            && IntStream.rangeClosed(0, M).allMatch(x -> Long.valueOf(g.applyAsLong(x)) instanceof Long gx
                && IntStream.range(0, 5).allMatch(v -> (pc[v][x + 1] = pc[v][x] + (gx == v ? 1 : 0)) >= 0))
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[3] = 1) > 0
                : st[3] == 0 || ((st[1] ^= g.applyAsLong(st[0])) >= 0 && (st[2] = st[4]++ == 0 ? st[0] : st[2]) >= 0 && (st[0] = 0) == 0 && (st[3] = 0) == 0))
            && Long.valueOf(st[1] ^ g.applyAsLong(st[2])) instanceof Long r
            ? r != 0 ? "Furlo" : "Rublo" : "");
    }
}
