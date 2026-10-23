import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new Scanner(System.in) instanceof Scanner sc
            && LongStream.generate(sc::nextLong).limit(4).toArray() instanceof long[] v
            && ((LongToIntFunction) x -> (int) LongStream.iterate(x, y -> y % 3 == 0, y -> y / 3).count()) instanceof LongToIntFunction f3
            && ((LongToIntFunction) x -> (int) LongStream.iterate(x, y -> y % 2 == 0, y -> y / 2).count()) instanceof LongToIntFunction f2
            && ((LongBinaryOperator) (p, q) -> (p * q >> (f2.applyAsInt(p) + f2.applyAsInt(q)))
                / LongStream.range(0, f3.applyAsInt(p) + f3.applyAsInt(q)).reduce(1L, (m, o) -> m * 3)) instanceof LongBinaryOperator strip
            && strip.applyAsLong(v[0], v[1]) == strip.applyAsLong(v[2], v[3])
            && Integer.valueOf(f3.applyAsInt(v[0]) + f3.applyAsInt(v[1])) instanceof Integer t1
            && Integer.valueOf(f3.applyAsInt(v[2]) + f3.applyAsInt(v[3])) instanceof Integer t2
            && Integer.valueOf(t1 > t2 ? 0 : 1) instanceof Integer p3
            && IntStream.range(0, Math.abs(t1 - t2)).allMatch(k ->
                v[2 * p3] % 3 == 0 ? (v[2 * p3] = v[2 * p3] / 3 * 2) > 0 : (v[2 * p3 + 1] = v[2 * p3 + 1] / 3 * 2) > 0)
            && Integer.valueOf(f2.applyAsInt(v[0]) + f2.applyAsInt(v[1])) instanceof Integer u1
            && Integer.valueOf(f2.applyAsInt(v[2]) + f2.applyAsInt(v[3])) instanceof Integer u2
            && Integer.valueOf(u1 > u2 ? 0 : 1) instanceof Integer p2
            && IntStream.range(0, Math.abs(u1 - u2)).allMatch(k ->
                v[2 * p2] % 2 == 0 ? (v[2 * p2] = v[2 * p2] / 2) > 0 : (v[2 * p2 + 1] = v[2 * p2 + 1] / 2) > 0)
            ? (Math.abs(t1 - t2) + Math.abs(u1 - u2)) + "\n" + v[0] + " " + v[1] + "\n" + v[2] + " " + v[3]
            : "-1");
    }
}
