import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long n
            && (Long) s.nextLong() instanceof Long k
            && (Integer) (int) Math.min(n, 13L) instanceof Integer m
            && LongStream.rangeClosed(0, 13).map(i -> LongStream.rangeClosed(1, i).reduce(1L, (a, b) -> a * b)).toArray() instanceof long[] f
            && (Long) (n - m) instanceof Long base
            && IntStream.rangeClosed((int) (base + 1), (int) (long) n).boxed().collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> rem
            ? (n <= 12 && k > f[(int) (long) n]
                ? "-1"
                : "" + (LongStream.rangeClosed(1, 10).flatMap(len -> LongStream.range(0, 1L << len)
                        .map(q -> IntStream.range(0, (int) len).mapToLong(b -> ((q >> (len - 1 - b)) & 1) == 1 ? 7 : 4).reduce(0, (x, d) -> x * 10 + d)))
                        .filter(x -> x <= base).count()
                    + IntStream.range(0, m).mapToObj(i -> new long[]{base + i + 1, rem.remove((int) (((k - 1) / f[m - 1 - i]) % (m - i)))})
                        .filter(p -> String.valueOf(p[0]).chars().allMatch(c -> c == '4' || c == '7')
                            && String.valueOf(p[1]).chars().allMatch(c -> c == '4' || c == '7')).count()))
            : "");
    }
}
