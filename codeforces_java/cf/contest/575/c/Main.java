
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n
            && IntStream.range(0, 2 * n * n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[((25 << n) >> 5) + 2] instanceof int[] v && Integer.valueOf((1 << n) - 1) instanceof Integer full && new int[5] instanceof int[] cur
            && ((IntUnaryOperator) x -> ((v[x * 25 >> 5] >>> (x * 25 & 31)) | (v[(x * 25 + 24) >> 5] << (31 - (x * 25 & 31)) << 1)) & 33554431) instanceof IntUnaryOperator query
            && ((IntBinaryOperator) (x, y) -> (v[x * 25 >> 5] ^= y << (x * 25 & 31)) * 0 + (v[(x * 25 + 24) >> 5] ^= y >>> (31 - (x * 25 & 31)) >>> 1) * 0) instanceof IntBinaryOperator modify
            && ((IntBinaryOperator) (x, y) -> y > query.applyAsInt(x) ? modify.applyAsInt(x, query.applyAsInt(x) ^ y) : 0) instanceof IntBinaryOperator update
            && ((IntBinaryOperator) (sw, i) -> (cur[3] = sw == 0 ? cur[0] : full - cur[0]) * 0 + (cur[2] = query.applyAsInt(cur[3])) * 0
                + (cur[1] = Integer.bitCount(cur[3]) >= i ? full ^ cur[3] : 0) * 0 + (cur[4] = Integer.bitCount(cur[3]) * n + sw * n * n) * 0) instanceof IntBinaryOperator load
            && ((IntBinaryOperator) (sw, i) -> (cur[0] = 0) * 0 + load.applyAsInt(sw, i)) instanceof IntBinaryOperator init
            && ((IntBinaryOperator) (sw, i) -> cur[1] != 0
                ? update.applyAsInt(cur[3] | (cur[1] & -cur[1]), cur[2] + a[cur[4] + Integer.numberOfTrailingZeros(cur[1])]) + (cur[1] &= cur[1] - 1) * 0
                : (sw == 1 ? modify.applyAsInt(cur[3], cur[2]) : 0) + (++cur[0] <= full ? load.applyAsInt(sw, i) : 0)) instanceof IntBinaryOperator step
            && IntStream.rangeClosed(0, n / 2).allMatch(i -> init.applyAsInt(0, i) == 0 && IntStream.iterate(0, t -> cur[0] <= full, t -> t + 1).map(t -> step.applyAsInt(0, i)).sum() == 0
                && (i == n / 2 || init.applyAsInt(1, i) == 0 && IntStream.iterate(0, t -> cur[0] <= full, t -> t + 1).map(t -> step.applyAsInt(1, i)).sum() == 0))
            ? query.applyAsInt(full) : "");
    }
}
