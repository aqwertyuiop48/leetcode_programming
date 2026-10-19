import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, 5).mapToObj(k -> new double[]{IntStream.range(0, k).mapToDouble(i -> 10 * Math.cos(Math.toRadians(72 * i))).sum(), IntStream.range(0, k).mapToDouble(i -> 10 * Math.sin(Math.toRadians(72 * i))).sum()}).toList() instanceof List<double[]> p
            && Double.valueOf(p.get(2)[0] - p.get(4)[0]) instanceof Double dx
            && ((IntBinaryOperator) (j, w) -> w == 4 ? (j == 0 ? 5 : j == 1 ? 3 : 4 * j) : (j == 0 ? w + 1 : 4 * j + 2 + w)) instanceof IntBinaryOperator id
            ? (4 * n + 1) + "\n" + Stream.concat(IntStream.range(0, 5).mapToObj(w -> p.get(w)),
                IntStream.range(1, n).boxed().flatMap(j -> IntStream.range(0, 4).mapToObj(w -> new double[]{p.get(w)[0] + j * dx, p.get(w)[1]})))
                .map(q -> String.format(Locale.US, "%.12f %.12f", q[0], q[1])).collect(Collectors.joining("\n")) + "\n"
                + IntStream.range(0, n).mapToObj(j -> IntStream.range(0, 5).mapToObj(w -> String.valueOf(id.applyAsInt(j, w))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) + "\n"
                + Stream.of(
                    IntStream.range(0, n).boxed().flatMap(j -> Stream.of(4, 1, 3, 0).map(w -> id.applyAsInt(j, w))),
                    Stream.of(id.applyAsInt(n - 1, 2)),
                    IntStream.range(0, n).map(j -> n - 1 - j).boxed().map(j -> id.applyAsInt(j, 4))).flatMap(x -> x).map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
