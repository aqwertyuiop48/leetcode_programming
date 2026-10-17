import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && (Integer) (int) (raw.length - IntStream.iterate(raw.length - 1, i -> i >= 0 && raw[i] <= 32, i -> i - 1).count()) instanceof Integer n
            && ((LongUnaryOperator) x -> (x & 2305843009213693951L) + (x >>> 61) >= 2305843009213693951L
                ? (x & 2305843009213693951L) + (x >>> 61) - 2305843009213693951L
                : (x & 2305843009213693951L) + (x >>> 61)) instanceof LongUnaryOperator red
            && ((LongBinaryOperator) (a, b) -> red.applyAsLong((a * b & 2305843009213693951L) + (a * b >>> 61) + (Math.multiplyHigh(a, b) << 3))) instanceof LongBinaryOperator mul
            && new byte[n + 1] instanceof byte[] degree
            && new long[]{0, 0, 1, 0} instanceof long[] st
            && IntStream.range(0, n).filter(i ->
                (st[0] = red.applyAsLong(mul.applyAsLong(st[0], 1000003931L) + raw[i])) >= 0
                && (st[1] = red.applyAsLong(st[1] + mul.applyAsLong(raw[i], st[2]))) >= 0
                && (st[2] = mul.applyAsLong(st[2], 1000003931L)) >= 0
                && st[0] == st[1]
                && (degree[i + 1] = (byte) (1 + degree[(i + 1) / 2])) > 0
                && (st[3] += degree[i + 1]) > 0).count() >= 0
            ? st[3]
            : 0L);
    }
}
