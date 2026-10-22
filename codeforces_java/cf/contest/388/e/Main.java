import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> LongStream.generate(sc::nextLong).limit(6).toArray()).toList() instanceof List<long[]> ls
            && ls.stream().map(a -> new long[]{a[3] - a[0], a[4] - a[1], a[5] - a[2]}).toList() instanceof List<long[]> ds
            && ((BinaryOperator<long[]>) (a, b) -> new long[]{a[1] * b[2] - a[2] * b[1], a[2] * b[0] - a[0] * b[2], a[0] * b[1] - a[1] * b[0]}) instanceof BinaryOperator<long[]> cross
            && ((ToLongBiFunction<long[], long[]>) (a, b) -> a[0] * b[0] + a[1] * b[1] + a[2] * b[2]) instanceof ToLongBiFunction<long[], long[]> dot
            && ((LongBinaryOperator) (a, b) -> BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue()) instanceof LongBinaryOperator gcd
            && ((UnaryOperator<long[]>) a -> Long.valueOf(gcd.applyAsLong(gcd.applyAsLong(Math.abs(a[0]), Math.abs(a[1])), Math.abs(a[2]))
                * (a[0] != 0 ? Long.signum(a[0]) : a[1] != 0 ? Long.signum(a[1]) : Long.signum(a[2]))) instanceof Long g
                ? new long[]{a[0] / g, a[1] / g, a[2] / g} : null) instanceof UnaryOperator<long[]> norm
            ? IntStream.range(0, n).map(i -> IntStream.range(0, n).filter(j -> j != i)
                .mapToObj(j -> cross.apply(ds.get(i), ds.get(j)) instanceof long[] nn
                    && new long[]{ls.get(j)[0] - ls.get(i)[0], ls.get(j)[1] - ls.get(i)[1], ls.get(j)[2] - ls.get(i)[2]} instanceof long[] dl
                    && (nn[0] != 0 || nn[1] != 0 || nn[2] != 0) && dot.applyAsLong(dl, nn) == 0
                    && Long.valueOf(dot.applyAsLong(cross.apply(dl, ds.get(j)), nn)) instanceof Long num && Long.valueOf(dot.applyAsLong(nn, nn)) instanceof Long den
                    && Long.valueOf(gcd.applyAsLong(Math.abs(num), den)) instanceof Long g
                    ? List.of(List.of(num / g, den / g), Arrays.stream(norm.apply(nn)).boxed().toList(), Arrays.stream(norm.apply(ds.get(j))).boxed().toList()) : null)
                .filter(Objects::nonNull).toList() instanceof List<List<List<Long>>> rs
                ? Math.max(1 + rs.stream().collect(Collectors.groupingBy(r -> r.get(0), Collectors.counting())).values().stream().mapToInt(Long::intValue).max().orElse(0),
                    1 + rs.stream().collect(Collectors.groupingBy(r -> r.get(1), Collectors.mapping(r -> r.get(2), Collectors.toSet()))).values().stream().mapToInt(Set::size).max().orElse(0)) : 0).max().getAsInt() : "");
    }
}
