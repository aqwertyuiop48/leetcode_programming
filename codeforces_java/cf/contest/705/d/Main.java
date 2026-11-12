import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer s && Integer.valueOf(st.nextToken()) instanceof Integer e
            && IntStream.range(0, 5).mapToObj(r -> IntStream.range(0, n).mapToLong(i -> Long.parseLong(st.nextToken())).toArray()).toArray(long[][]::new) instanceof long[][] v
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long inf && new long[n + 3] instanceof long[] cur && new long[n + 3] instanceof long[] nxt
            && IntStream.range(0, n + 3).filter(j -> (cur[j] = j == 0 ? 0 : inf) < 0).count() >= 0
            && ((LongBinaryOperator) (idx, val) -> nxt[(int) idx] = Math.min(nxt[(int) idx], val)) instanceof LongBinaryOperator upd
            && IntStream.rangeClosed(1, n).filter(i -> Integer.valueOf(i - 1) instanceof Integer i0 && Long.valueOf(v[0][i0]) instanceof Long x && Long.valueOf(v[1][i0]) instanceof Long a
                && Long.valueOf(v[2][i0]) instanceof Long b && Long.valueOf(v[3][i0]) instanceof Long c && Long.valueOf(v[4][i0]) instanceof Long d
                && Integer.valueOf(s < i ? 1 : 0) instanceof Integer ps && Integer.valueOf(e < i ? 1 : 0) instanceof Integer pe
                && IntStream.range(0, n + 3).filter(j -> (nxt[j] = inf) < 0).count() >= 0
                && IntStream.rangeClosed(0, n).filter(j -> cur[j] < inf && (i == s
                        ? upd.applyAsLong(j + 1, cur[j] - x + d) + (j >= 1 ? upd.applyAsLong(j, cur[j] + x + c) : 0)
                        : i == e
                            ? upd.applyAsLong(j + 1, cur[j] - x + b) + (j >= 1 ? upd.applyAsLong(j, cur[j] + x + a) : 0)
                            : (j + 1 - ps - pe > 0 ? upd.applyAsLong(j + 1, cur[j] + b + d - 2 * x) : 0) + (j >= 2 ? upd.applyAsLong(j - 1, cur[j] + a + c + 2 * x) : 0)
                                + (j - pe >= 1 ? upd.applyAsLong(j, cur[j] + a + d) : 0) + (j - ps >= 1 ? upd.applyAsLong(j, cur[j] + b + c) : 0)) == Long.MIN_VALUE).count() >= 0
                && IntStream.range(0, n + 3).filter(j -> (cur[j] = j == 0 || (i < n && s <= i && e <= i && j == 1) ? inf : nxt[j]) < 0).count() >= 0).count() >= 0
            ? cur[1] : "");
    }
}
