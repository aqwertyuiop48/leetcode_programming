import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long k
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && ((BiFunction<String, String, Long>) (text, pat) -> text.length() < pat.length() ? 0L
                : new long[]{1_000_000_007L, 998_244_353L} instanceof long[] md && new long[]{131, 137} instanceof long[] bs
                    && IntStream.range(0, 2).mapToObj(q -> new long[text.length() + 1]).toArray(long[][]::new) instanceof long[][] pre
                    && IntStream.range(0, 2).allMatch(q -> IntStream.range(0, text.length()).allMatch(i -> (pre[q][i + 1] = (pre[q][i] * bs[q] + text.charAt(i)) % md[q]) >= 0))
                    && IntStream.range(0, 2).mapToLong(q -> pat.chars().asLongStream().reduce(0, (h, c) -> (h * bs[q] + c) % md[q])).toArray() instanceof long[] hp
                    && IntStream.range(0, 2).mapToLong(q -> java.math.BigInteger.valueOf(bs[q]).modPow(java.math.BigInteger.valueOf(pat.length()), java.math.BigInteger.valueOf(md[q])).longValue()).toArray() instanceof long[] pw
                    ? Long.valueOf(IntStream.rangeClosed(0, text.length() - pat.length()).filter(i -> IntStream.range(0, 2).allMatch(q -> ((pre[q][i + pat.length()] - pre[q][i] * pw[q]) % md[q] + md[q]) % md[q] == hp[q])).count()) : 0L) instanceof BiFunction<String, String, Long> count
            && ((BinaryOperator<long[][]>) (x, y) -> new long[3][3] instanceof long[][] z && IntStream.range(0, 9).allMatch(q -> (z[q / 3][q % 3] = (x[q / 3][0] * y[0][q % 3] % 1_000_000_007L + x[q / 3][1] * y[1][q % 3] % 1_000_000_007L + x[q / 3][2] * y[2][q % 3] % 1_000_000_007L) % 1_000_000_007L) >= 0) ? z : null) instanceof BinaryOperator<long[][]> mul
            && ((LongFunction<long[][]>) c -> new long[][]{{1, 1, c}, {1, 0, 0}, {0, 0, 1}}) instanceof LongFunction<long[][]> step
            ? Stream.generate(sc::next).limit(m).map(s -> Integer.valueOf(s.length()) instanceof Integer len
                    && Long.valueOf(Stream.iterate(new long[]{1, 1, 0}, st -> new long[]{st[0] + 1, st[1] + st[2], st[1]}).filter(st -> st[1] >= len).findFirst().get()[0] + 4) instanceof Long b
                    && Integer.valueOf((int) Math.min(k, b)) instanceof Integer upto
                    && new ArrayList<String>(List.of("a", "b")) instanceof ArrayList<String> fs
                    && IntStream.rangeClosed(3, upto).allMatch(i -> fs.add(fs.get(i - 2) + fs.get(i - 3)))
                    ? k <= b ? String.valueOf(count.apply(fs.get((int) (k - 1)), s) % 1_000_000_007L)
                        : Long.valueOf(count.apply(fs.get((int) (b - 1)), s)) instanceof Long occB
                            && Long.valueOf(count.apply(fs.get((int) (b - 2)), s)) instanceof Long occB1
                            && Long.valueOf(count.apply(fs.get((int) (b - 1)).substring(Math.max(0, fs.get((int) (b - 1)).length() - len + 1)) + fs.get((int) (b - 2)).substring(0, Math.min(fs.get((int) (b - 2)).length(), len - 1)), s)) instanceof Long c1
                            && Long.valueOf(count.apply(fs.get((int) (b - 2)).substring(Math.max(0, fs.get((int) (b - 2)).length() - len + 1)) + fs.get((int) (b - 1)).substring(0, Math.min(fs.get((int) (b - 1)).length(), len - 1)), s)) instanceof Long c2
                            && Long.valueOf(k - b) instanceof Long steps
                            && new long[][][]{{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, mul.apply(step.apply(c2), step.apply(c1))} instanceof long[][][] hold
                            && IntStream.range(0, 62).allMatch(bit -> ((steps / 2 >> bit & 1) == 1 ? (hold[0] = mul.apply(hold[0], hold[1])) != null : true) && (hold[1] = mul.apply(hold[1], hold[1])) != null)
                            && (steps % 2 == 1 ? mul.apply(step.apply(c1), hold[0]) : hold[0]) instanceof long[][] tm
                            ? String.valueOf((tm[0][0] * occB + tm[0][1] * occB1 + tm[0][2]) % 1_000_000_007L) : ""
                    : "").collect(Collectors.joining("\n"))
            : "");
    }
}
