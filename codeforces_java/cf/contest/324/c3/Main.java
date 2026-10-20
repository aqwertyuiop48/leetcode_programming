import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            && new long[19][100] instanceof long[][] v
            && IntStream.range(0, 100).mapToLong(x -> v[0][x] = x / 10 == 0 ? (x % 10 > 0 ? 10 : 0) : x % 10 < x / 10 ? 10 + x % 10 + 10 - x / 10 : 20 + 10 - x / 10).max().orElse(0) >= 0
            && IntStream.range(1, 18).filter(j -> IntStream.range(0, 100).filter(x -> (v[j][x] = IntStream.iterate(9, d -> d >= 0, d -> d - 1).mapToLong(d -> d).reduce(x % 10, (acc, d) -> acc - acc % 10 + v[j - 1][(int) (Math.max(x / 10, d) * 10 + acc % 10)])) < 0).count() > 0).count() == 0
            ? n < 10 ? (n > 0 ? 1 : 0)
                : Long.valueOf(n / 10) instanceof Long h && new long[]{n % 10} instanceof long[] acc
                && Integer.valueOf(String.valueOf(h).length()) instanceof Integer len
                && IntStream.range(0, len).filter(j -> Long.valueOf(h / LongStream.range(0, j + 1).reduce(1, (a, b) -> a * 10)) instanceof Long hi
                    && Long.valueOf(hi == 0 ? 0 : String.valueOf(hi).chars().max().getAsInt() - '0') instanceof Long mp
                    && Long.valueOf(h / LongStream.range(0, j).reduce(1, (a, b) -> a * 10) % 10) instanceof Long dig
                    && LongStream.iterate(j == 0 ? dig : dig - 1, d -> d >= 0, d -> d - 1).filter(d -> (acc[0] = acc[0] - acc[0] % 10 + v[j][(int) (Math.max(mp, d) * 10 + acc[0] % 10)]) < 0).count() == 0 ? false : true).count() >= 0
                ? acc[0] / 10 : "" : "");
    }
}
