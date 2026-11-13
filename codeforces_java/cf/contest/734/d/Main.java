import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).allMatch(k -> 0 * (raw[k] > 64 ? (v[(int) st[3]++] = raw[k]) : raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[2] = 1) : raw[k] == 45 ? (st[1] = -1) : st[2] == 1 ? (v[(int) st[3]++] = st[0] * st[1]) + (st[0] = 0) + (st[1] = 1) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && LongStream.generate(() -> Long.MAX_VALUE).limit(9).toArray() instanceof long[] bd
            && new long[9] instanceof long[] ty
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(v[4 + 3 * i] - v[1]) instanceof Long dx && Long.valueOf(v[5 + 3 * i] - v[2]) instanceof Long dy
                && (dx != 0 && dy != 0 && Math.abs(dx) != Math.abs(dy)
                    || Integer.valueOf((int) ((Long.signum(dx) + 1) * 3 + Long.signum(dy) + 1)) instanceof Integer d
                    && (Math.max(Math.abs(dx), Math.abs(dy)) >= bd[d] || 0 * ((bd[d] = Math.max(Math.abs(dx), Math.abs(dy))) + (ty[d] = v[3 + 3 * i])) == 0)))
            ? IntStream.range(0, 9).anyMatch(d -> d != 4 && bd[d] != Long.MAX_VALUE && (ty[d] == 81 || ty[d] == (d % 2 == 0 ? 66 : 82))) ? "YES" : "NO" : "");
    }
}
