import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).replaceAll("[^-0-9]+", " ").trim().split(" ") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).mapToDouble(i -> Double.parseDouble(t[1 + 2 * i])).toArray() instanceof double[] x
            && IntStream.range(0, n).mapToDouble(i -> Double.parseDouble(t[2 + 2 * i])).toArray() instanceof double[] v
            && ((DoublePredicate) q -> new double[]{Double.NEGATIVE_INFINITY} instanceof double[] mx
                && IntStream.range(0, n).anyMatch(i -> v[i] >= 0
                    ? (mx[0] = Math.max(mx[0], x[i] + v[i] * q)) > Double.POSITIVE_INFINITY
                    : x[i] + v[i] * q <= mx[0])) instanceof DoublePredicate hit
            ? hit.test(1e10)
                ? String.format(Locale.ROOT, "%.10f", Stream.iterate(new double[]{0, 1e10}, b -> hit.test((b[0] + b[1]) / 2) ? new double[]{b[0], (b[0] + b[1]) / 2} : new double[]{(b[0] + b[1]) / 2, b[1]})
                    .limit(101).reduce((p, q) -> q).get()[1])
                : "-1"
            : "");
    }
}



