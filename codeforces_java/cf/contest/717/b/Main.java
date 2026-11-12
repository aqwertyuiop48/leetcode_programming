import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Long.valueOf(tk.nextToken()) instanceof Long n
            && Long.valueOf(tk.nextToken()) instanceof Long ca && Long.valueOf(tk.nextToken()) instanceof Long cb
            && Long.valueOf(Math.min(ca, cb)) instanceof Long c0 && Long.valueOf(Math.max(ca, cb)) instanceof Long c1
            && ((LongBinaryOperator) (m, k) -> m < k ? 0L : Stream.of(new long[]{1}).peek(res -> LongStream.range(0, Math.min(k, m - k)).allMatch(t ->
                (res[0] = Math.min(res[0] * (m - t) / (t + 1), 400000000L)) >= 0 || true)).findFirst().get()[0]) instanceof LongBinaryOperator bin
            && ((LongUnaryOperator) tt -> LongStream.range(0, 40).filter(j -> j * c1 < tt).map(j -> bin.applyAsLong((tt - j * c1 - 1) / c0 + j + 1, j + 1)).sum()) instanceof LongUnaryOperator cnt
            && new long[]{0, 40 * c1} instanceof long[] bs
            && IntStream.range(0, 50).allMatch(z -> Long.valueOf((bs[0] + bs[1]) / 2) instanceof Long mid
                && (cnt.applyAsLong(mid + 1) >= n - 1 ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) >= 0) || true)
            && Long.valueOf(bs[0]) instanceof Long tT
            && Long.valueOf(cnt.applyAsLong(tT)) instanceof Long full
            ? LongStream.range(0, 40).filter(j -> j * c1 < tT).map(j -> Long.valueOf((tT - j * c1 - 1) / c0) instanceof Long im
                ? c0 * (j + 1) * bin.applyAsLong(im + j + 1, j + 2) + j * c1 * bin.applyAsLong(im + j + 1, j + 1) : 0L).sum()
                + (c0 + c1) * full + (n - 1 - full) * (tT + c0 + c1) : "");
    }
}
