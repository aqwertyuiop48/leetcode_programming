import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && Integer.valueOf((int) nums[0]) instanceof Integer n
            && ((LongUnaryOperator) r -> (r & 2305843009213693951L) + (r >>> 61) >= 2305843009213693951L
                ? (r & 2305843009213693951L) + (r >>> 61) - 2305843009213693951L
                : (r & 2305843009213693951L) + (r >>> 61)) instanceof LongUnaryOperator red
            && ((LongBinaryOperator) (a, b) -> red.applyAsLong((a * b & 2305843009213693951L) + ((a * b >>> 61) | (Math.multiplyHigh(a, b) << 3)))) instanceof LongBinaryOperator mul
            && new long[n + 1] instanceof long[] hp
            && new long[n + 1] instanceof long[] pw
            && (pw[0] = 1) > 0
            && IntStream.range(0, n).allMatch(i ->
                (hp[i + 1] = red.applyAsLong(mul.applyAsLong(hp[i], 1000003L) + nums[1 + i] + 1)) >= 0
                && (pw[i + 1] = mul.applyAsLong(pw[i], 1000003L)) > 0)
            && IntStream.range(0, n).mapToLong(i -> nums[1 + i] << 20 | i).sorted().toArray() instanceof long[] byVal
            && IntStream.rangeClosed(1, 9).boxed().flatMapToLong(d ->
                IntStream.range(0, n - d).filter(k -> byVal[k] >> 20 == byVal[k + d] >> 20)
                    .mapToLong(k -> ((byVal[k + d] & 1048575) - (byVal[k] & 1048575) << 20 | (byVal[k] & 1048575)))
                    .filter(key -> (key >> 20) > 0)).sorted().toArray() instanceof long[] cands
            && new int[]{0} instanceof int[] L
            && Arrays.stream(cands).allMatch(key ->
                (Integer) (int) (key & 1048575) instanceof Integer i
                && (Integer) (int) (key >> 20) instanceof Integer x
                && (i < L[0] || i + 2 * x > n
                    || red.applyAsLong(hp[i + x] - mul.applyAsLong(hp[i], pw[x]) + 2305843009213693951L)
                        != red.applyAsLong(hp[i + 2 * x] - mul.applyAsLong(hp[i + x], pw[x]) + 2305843009213693951L)
                    || (L[0] = i + x) > 0))
            ? (n - L[0]) + "\n" + IntStream.range(L[0], n).mapToObj(i -> String.valueOf(nums[1 + i])).collect(Collectors.joining(" "))
            : "");
    }
}
