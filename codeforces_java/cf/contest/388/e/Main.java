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
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] gr
            && (gr[0] = (a, b) -> b == 0 ? a : gr[0].applyAsLong(b, a % b)) != null && gr[0] instanceof LongBinaryOperator gcd
            && ((UnaryOperator<long[]>) a -> Long.valueOf(gcd.applyAsLong(gcd.applyAsLong(Math.abs(a[0]), Math.abs(a[1])), Math.abs(a[2]))
                * (a[0] != 0 ? Long.signum(a[0]) : a[1] != 0 ? Long.signum(a[1]) : Long.signum(a[2]))) instanceof Long g
                ? new long[]{a[0] / g, a[1] / g, a[2] / g} : null) instanceof UnaryOperator<long[]> norm
            && ((LongUnaryOperator) x -> Long.valueOf((x + 0x9E3779B97F4A7C15L ^ ((x + 0x9E3779B97F4A7C15L) >>> 30)) * 0xBF58476D1CE4E5B9L) instanceof Long z1
                && Long.valueOf((z1 ^ (z1 >>> 27)) * 0x94D049BB133111EBL) instanceof Long z2 ? z2 ^ (z2 >>> 31) : 0L) instanceof LongUnaryOperator mix
            && ((Function<long[], Long>) v -> mix.applyAsLong(mix.applyAsLong(mix.applyAsLong(v[0]) + v[1]) + v[2])) instanceof Function<long[], Long> hv
            && ds.stream().map(a -> hv.apply(norm.apply(a))).toList() instanceof List<Long> nd
            ? IntStream.range(0, n).map(i -> IntStream.range(0, n).filter(j -> j != i)
                .mapToObj(j -> cross.apply(ds.get(i), ds.get(j)) instanceof long[] nn
                    && new long[]{ls.get(j)[0] - ls.get(i)[0], ls.get(j)[1] - ls.get(i)[1], ls.get(j)[2] - ls.get(i)[2]} instanceof long[] dl
                    && (nn[0] != 0 || nn[1] != 0 || nn[2] != 0) && dot.applyAsLong(dl, nn) == 0
                    && Math.abs((double) dl[0] * nn[0] + (double) dl[1] * nn[1] + (double) dl[2] * nn[2]) < 1e12
                    && cross.apply(dl, ds.get(j)) instanceof long[] cd
                    && Integer.valueOf(nn[0] != 0 ? 0 : nn[1] != 0 ? 1 : 2) instanceof Integer kk
                    && Long.valueOf(Long.signum(nn[kk])) instanceof Long sg
                    && Long.valueOf(cd[kk] * sg) instanceof Long num && Long.valueOf(nn[kk] * sg) instanceof Long den
                    && Long.valueOf(gcd.applyAsLong(Math.abs(num), den)) instanceof Long g
                    ? new long[]{mix.applyAsLong(mix.applyAsLong(num / g) + den / g), hv.apply(norm.apply(nn)), nd.get(j)} : null)
                .filter(Objects::nonNull).toList() instanceof List<long[]> rs
                ? Math.max(1 + rs.stream().collect(Collectors.groupingBy(r -> r[0], Collectors.counting())).values().stream().mapToInt(Long::intValue).max().orElse(0),
                    1 + rs.stream().collect(Collectors.groupingBy(r -> r[1], Collectors.mapping(r -> r[2], Collectors.toSet()))).values().stream().mapToInt(Set::size).max().orElse(0)) : 0).max().getAsInt() : "");
    }
}

