import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && s.next() instanceof String r0 && s.next() instanceof String r1 && new int[4 * n][] instanceof int[][] t && new Object[2] instanceof Object[] ref
            && ((BinaryOperator<int[]>) (x, y) -> new int[]{Math.min(400000000, Math.min(x[0] + 1 + y[0], x[1] + 1 + y[2])), Math.min(400000000, Math.min(x[0] + 1 + y[1], x[1] + 1 + y[3])),
                Math.min(400000000, Math.min(x[2] + 1 + y[0], x[3] + 1 + y[2])), Math.min(400000000, Math.min(x[2] + 1 + y[1], x[3] + 1 + y[3]))}) instanceof BinaryOperator<int[]> comb
            && (ref[0] = (Predicate<int[]>) a -> a[1] == a[2]
                ? (t[a[0]] = new int[]{r0.charAt(a[1]) == '.' ? 0 : 400000000, r0.charAt(a[1]) == '.' && r1.charAt(a[1]) == '.' ? 1 : 400000000, r0.charAt(a[1]) == '.' && r1.charAt(a[1]) == '.' ? 1 : 400000000, r1.charAt(a[1]) == '.' ? 0 : 400000000}) != null
                : ((Predicate<int[]>) ref[0]).test(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2}) && ((Predicate<int[]>) ref[0]).test(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2]})
                    && (t[a[0]] = comb.apply(t[2 * a[0]], t[2 * a[0] + 1])) != null) != null
            && ((Predicate<int[]>) ref[0]).test(new int[]{1, 0, n - 1})
            && (ref[1] = (Function<int[], int[]>) a -> a[3] <= a[1] && a[2] <= a[4] ? t[a[0]]
                : a[4] <= (a[1] + a[2]) / 2 ? ((Function<int[], int[]>) ref[1]).apply(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4]})
                : a[3] > (a[1] + a[2]) / 2 ? ((Function<int[], int[]>) ref[1]).apply(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4]})
                : comb.apply(((Function<int[], int[]>) ref[1]).apply(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4]}), ((Function<int[], int[]>) ref[1]).apply(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4]}))) != null
            ? IntStream.range(0, m).mapToObj(i -> (Integer) (s.nextInt() - 1) instanceof Integer p && (Integer) (s.nextInt() - 1) instanceof Integer q
                && (p % n <= q % n ? new int[]{p / n, p % n, q / n, q % n} : new int[]{q / n, q % n, p / n, p % n}) instanceof int[] z
                && (Integer) ((Function<int[], int[]>) ref[1]).apply(new int[]{1, 0, n - 1, z[1], z[3]})[z[0] * 2 + z[2]] instanceof Integer d
                ? String.valueOf(d >= 400000000 ? -1 : d) : "").collect(Collectors.joining("\n")) : "");
    }
}
