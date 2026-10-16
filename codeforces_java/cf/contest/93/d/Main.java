import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new long[]{s.nextLong(), s.nextLong()} instanceof long[] lr
            && ((BinaryOperator<long[][]>) (A, B) -> IntStream.range(0, 17).mapToObj(i ->
                IntStream.range(0, 17).mapToLong(j ->
                    IntStream.range(0, 17).mapToLong(k -> A[i][k] * B[k][j] % 1000000007L).sum() % 1000000007L).toArray())
                .toArray(long[][]::new)) instanceof BinaryOperator<long[][]> mul
            && ((IntBinaryOperator) (a, b) -> a != b && a + b != 3 ? 1 : 0) instanceof IntBinaryOperator ok
            && IntStream.range(0, 17).mapToObj(r -> IntStream.range(0, 17).mapToLong(c ->
                r == 16 ? 1
                : c == 16 ? 0
                : r / 4 == c % 4
                    && ok.applyAsInt(c / 4, c % 4) == 1
                    && ok.applyAsInt(r / 4, r % 4) == 1
                    && !(c / 4 == 1 && c % 4 == 0 && r % 4 == 2)
                    && !(c / 4 == 2 && c % 4 == 0 && r % 4 == 1)
                    ? 1 : 0).toArray()).toArray(long[][]::new) instanceof long[][] m
            && IntStream.range(0, 17).mapToObj(r -> IntStream.range(0, 17).mapToLong(c -> r == c ? 1 : 0).toArray())
                .toArray(long[][]::new) instanceof long[][] id
            && ((LongFunction<long[][]>) e -> new long[][][]{id, m} instanceof long[][][] st
                && IntStream.range(0, 40).allMatch(i ->
                    ((e >> i & 1) == 0 || (st[0] = mul.apply(st[0], st[1])) != null)
                    && (st[1] = mul.apply(st[1], st[1])) != null)
                ? st[0] : null) instanceof LongFunction<long[][]> pw
            && ((LongUnaryOperator) n -> n == 0 ? 0
                : pw.apply(n - 1) instanceof long[][] p
                    ? (4 + IntStream.range(0, 16).filter(j -> ok.applyAsInt(j / 4, j % 4) == 1).mapToLong(j -> p[16][j]).sum()) % 1000000007L
                    : 0) instanceof LongUnaryOperator fs
            && ((LongUnaryOperator) n -> (fs.applyAsLong(n) + fs.applyAsLong((n + 1) / 2)) % 1000000007L * 500000004L % 1000000007L) instanceof LongUnaryOperator sm
            ? ((sm.applyAsLong(lr[1]) - sm.applyAsLong(lr[0] - 1)) % 1000000007L + 1000000007L) % 1000000007L
            : 0L);
    }
}



