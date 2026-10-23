import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[4 * n] instanceof int[] col && new long[4 * n] instanceof long[] lz && new long[4 * n] instanceof long[] sum && new Object[3] instanceof Object[] ref
            && ((IntPredicate) o -> (sum[o] = sum[2 * o] + sum[2 * o + 1]) >= 0 && (col[o] = col[2 * o] == col[2 * o + 1] ? col[2 * o] : 0) >= 0) instanceof IntPredicate pull
            && ((Predicate<int[]>) a -> (lz[a[0]] == 0 || (lz[2 * a[0]] += lz[a[0]]) >= 0 && (lz[2 * a[0] + 1] += lz[a[0]]) >= 0 && (sum[2 * a[0]] += lz[a[0]] * ((a[1] + a[2]) / 2 - a[1] + 1)) >= 0 && (sum[2 * a[0] + 1] += lz[a[0]] * (a[2] - (a[1] + a[2]) / 2)) >= 0 && (lz[a[0]] = 0) == 0)
                && (col[a[0]] == 0 || (col[2 * a[0]] = col[a[0]]) > 0 && (col[2 * a[0] + 1] = col[a[0]]) > 0)) instanceof Predicate<int[]> push
            && (ref[0] = (Predicate<int[]>) a -> a[1] == a[2] ? (col[a[0]] = a[1]) > 0
                : ((Predicate<int[]>) ref[0]).test(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2}) && ((Predicate<int[]>) ref[0]).test(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2]}) && pull.test(a[0])) != null
            && ((Predicate<int[]>) ref[0]).test(new int[]{1, 1, n})
            && (ref[1] = (Predicate<int[]>) a -> a[3] > a[2] || a[4] < a[1] || (a[3] <= a[1] && a[2] <= a[4] && col[a[0]] != 0
                    ? (Long) (long) Math.abs(a[5] - col[a[0]]) instanceof Long d && (sum[a[0]] += d * (a[2] - a[1] + 1)) >= 0 && (lz[a[0]] += d) >= 0 && (col[a[0]] = a[5]) > 0
                    : push.test(a) && ((Predicate<int[]>) ref[1]).test(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4], a[5]}) && ((Predicate<int[]>) ref[1]).test(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4], a[5]}) && pull.test(a[0]))) != null
            && (ref[2] = (Function<int[], Long>) a -> a[3] > a[2] || a[4] < a[1] ? 0L : a[3] <= a[1] && a[2] <= a[4] ? sum[a[0]]
                : push.test(a) ? ((Function<int[], Long>) ref[2]).apply(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4]}) + ((Function<int[], Long>) ref[2]).apply(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4]}) : 0L) != null
            ? IntStream.range(0, m).mapToObj(i -> Integer.parseInt(tk.nextToken()) == 1
                ? ((Predicate<int[]>) ref[1]).test(new int[]{1, 1, n, Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}) ? "" : ""
                : String.valueOf(((Function<int[], Long>) ref[2]).apply(new int[]{1, 1, n, Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}))).filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
