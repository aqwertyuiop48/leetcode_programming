import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] v
            && new long[4 * n] instanceof long[] sum && new int[4 * n] instanceof int[] mx && new Object[4] instanceof Object[] ref
            && ((IntPredicate) o -> (sum[o] = sum[2 * o] + sum[2 * o + 1]) >= 0 && (mx[o] = Math.max(mx[2 * o], mx[2 * o + 1])) >= 0) instanceof IntPredicate pull
            && (ref[0] = (Predicate<int[]>) a -> a[1] == a[2] ? (sum[a[0]] = mx[a[0]] = v[a[1]]) >= 0
                : ((Predicate<int[]>) ref[0]).test(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2}) && ((Predicate<int[]>) ref[0]).test(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2]}) && pull.test(a[0])) != null
            && ((Predicate<int[]>) ref[0]).test(new int[]{1, 0, n - 1})
            && (ref[1] = (Predicate<int[]>) a -> a[3] > a[2] || a[4] < a[1] || mx[a[0]] < a[5] ? true : a[1] == a[2] ? (sum[a[0]] = mx[a[0]] = (int) (sum[a[0]] % a[5])) >= 0
                : ((Predicate<int[]>) ref[1]).test(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4], a[5]}) && ((Predicate<int[]>) ref[1]).test(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4], a[5]}) && pull.test(a[0])) != null
            && (ref[2] = (Predicate<int[]>) a -> a[1] == a[2] ? (sum[a[0]] = mx[a[0]] = a[4]) >= 0
                : (a[3] <= (a[1] + a[2]) / 2 ? ((Predicate<int[]>) ref[2]).test(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4]}) : ((Predicate<int[]>) ref[2]).test(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4]})) && pull.test(a[0])) != null
            && (ref[3] = (Function<int[], Long>) a -> a[3] > a[2] || a[4] < a[1] ? 0L : a[3] <= a[1] && a[2] <= a[4] ? sum[a[0]]
                : ((Function<int[], Long>) ref[3]).apply(new int[]{2 * a[0], a[1], (a[1] + a[2]) / 2, a[3], a[4]}) + ((Function<int[], Long>) ref[3]).apply(new int[]{2 * a[0] + 1, (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4]})) != null
            ? IntStream.range(0, m).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer t
                ? t == 1 ? String.valueOf(((Function<int[], Long>) ref[3]).apply(new int[]{1, 0, n - 1, Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken()) - 1}))
                : t == 2 ? ((Predicate<int[]>) ref[1]).test(new int[]{1, 0, n - 1, Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken())}) ? "" : ""
                : ((Predicate<int[]>) ref[2]).test(new int[]{1, 0, n - 1, Integer.parseInt(tk.nextToken()) - 1, Integer.parseInt(tk.nextToken())}) ? "" : "" : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
