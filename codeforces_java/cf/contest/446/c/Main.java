import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && new long[n + 8] instanceof long[] F && (F[1] = 1) > 0 && IntStream.range(2, n + 8).allMatch(i -> (F[i] = (F[i - 1] + F[i - 2]) % 1000000007L) >= 0)
            && new long[4 * n] instanceof long[] sum && new long[4 * n] instanceof long[] la && new long[4 * n] instanceof long[] lb && new Object[3] instanceof Object[] ref
            && ((ToLongFunction<long[]>) q -> q[2] == 1 ? q[0] : (q[0] * F[(int) q[2] - 2] + q[1] * F[(int) q[2] - 1]) % 1000000007L) instanceof ToLongFunction<long[]> term
            && ((Predicate<long[]>) q -> (la[(int) q[0]] = (la[(int) q[0]] + q[1]) % 1000000007L) >= 0 && (lb[(int) q[0]] = (lb[(int) q[0]] + q[2]) % 1000000007L) >= 0
                && (sum[(int) q[0]] = (sum[(int) q[0]] + term.applyAsLong(new long[]{q[1], q[2], q[3] + 2}) - q[2] + 1000000007L) % 1000000007L) >= 0) instanceof Predicate<long[]> apply
            && ((Predicate<int[]>) o -> (la[o[0]] == 0 && lb[o[0]] == 0 || (apply.test(new long[]{2 * o[0], la[o[0]], lb[o[0]], (o[1] + o[2]) / 2 - o[1] + 1})
                && apply.test(new long[]{2 * o[0] + 1, term.applyAsLong(new long[]{la[o[0]], lb[o[0]], (o[1] + o[2]) / 2 - o[1] + 2}), term.applyAsLong(new long[]{la[o[0]], lb[o[0]], (o[1] + o[2]) / 2 - o[1] + 3}), o[2] - (o[1] + o[2]) / 2})
                && (la[o[0]] = 0) == 0 && (lb[o[0]] = 0) == 0))) instanceof Predicate<int[]> push
            && (ref[0] = (Predicate<int[]>) o -> o[1] == o[2] ? (sum[o[0]] = a[o[1] - 1] % 1000000007L) >= 0
                : ((Predicate<int[]>) ref[0]).test(new int[]{2 * o[0], o[1], (o[1] + o[2]) / 2}) && ((Predicate<int[]>) ref[0]).test(new int[]{2 * o[0] + 1, (o[1] + o[2]) / 2 + 1, o[2]}) && (sum[o[0]] = (sum[2 * o[0]] + sum[2 * o[0] + 1]) % 1000000007L) >= 0) != null
            && ((Predicate<int[]>) ref[0]).test(new int[]{1, 1, n})
            && (ref[1] = (Predicate<int[]>) o -> o[3] > o[2] || o[4] < o[1] || (o[3] <= o[1] && o[2] <= o[4]
                    ? apply.test(new long[]{o[0], F[o[1] - o[3] + 1], F[o[1] - o[3] + 2], o[2] - o[1] + 1})
                    : push.test(o) && ((Predicate<int[]>) ref[1]).test(new int[]{2 * o[0], o[1], (o[1] + o[2]) / 2, o[3], o[4]}) && ((Predicate<int[]>) ref[1]).test(new int[]{2 * o[0] + 1, (o[1] + o[2]) / 2 + 1, o[2], o[3], o[4]})
                        && (sum[o[0]] = (sum[2 * o[0]] + sum[2 * o[0] + 1]) % 1000000007L) >= 0)) != null
            && (ref[2] = (Function<int[], Long>) o -> o[3] > o[2] || o[4] < o[1] ? 0L : o[3] <= o[1] && o[2] <= o[4] ? sum[o[0]]
                : push.test(o) ? (((Function<int[], Long>) ref[2]).apply(new int[]{2 * o[0], o[1], (o[1] + o[2]) / 2, o[3], o[4]}) + ((Function<int[], Long>) ref[2]).apply(new int[]{2 * o[0] + 1, (o[1] + o[2]) / 2 + 1, o[2], o[3], o[4]})) % 1000000007L : 0L) != null
            ? IntStream.range(0, m).mapToObj(i -> Integer.parseInt(tk.nextToken()) == 1
                ? ((Predicate<int[]>) ref[1]).test(new int[]{1, 1, n, Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}) ? "" : ""
                : String.valueOf(((Function<int[], Long>) ref[2]).apply(new int[]{1, 1, n, Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}))).filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
