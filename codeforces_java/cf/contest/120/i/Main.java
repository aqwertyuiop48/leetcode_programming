import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of((new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out)).ifPresent(out ->
        Optional.of(new Scanner((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in)).next()).ifPresent(str ->
            out.println(str.chars().map(c -> c - '0').toArray() instanceof int[] a
                && Integer.valueOf(a.length) instanceof Integer k
                && Integer.valueOf(k / 2) instanceof Integer n
                && new int[]{63, 6, 91, 79, 102, 109, 125, 7, 127, 111} instanceof int[] M
                && ((ToIntBiFunction<int[], int[]>) (arr, rd) -> rd[0] < n
                    ? Integer.bitCount(M[rd[1]]) - 7
                    : Integer.bitCount(M[arr[rd[0] - n]] & M[rd[1]]) - Integer.bitCount(M[arr[rd[0] - n]])) instanceof ToIntBiFunction<int[], int[]> del
                && new int[k + 1] instanceof int[] us
                && (us[0] = 7 * n) >= 0
                && IntStream.range(0, k).allMatch(r -> (us[r + 1] = us[r] + del.applyAsInt(a, new int[]{r, a[r]})) > -1000000000)
                && Integer.valueOf(us[k]) instanceof Integer L
                && IntStream.iterate(k - 1, i -> i >= 0, i -> i - 1).boxed()
                    .filter(p -> IntStream.rangeClosed(a[p] + 1, 9).anyMatch(d -> us[p] + del.applyAsInt(a, new int[]{p, d}) > L))
                    .findFirst() instanceof Optional<Integer> po
                ? po.map(p -> (Integer) IntStream.rangeClosed(a[p] + 1, 9).filter(d -> us[p] + del.applyAsInt(a, new int[]{p, d}) > L).findFirst().getAsInt() instanceof Integer dd
                    && Arrays.copyOf(a, k) instanceof int[] T
                    && (T[p] = dd) >= 0
                    && new int[]{us[p] + del.applyAsInt(a, new int[]{p, dd})} instanceof int[] u
                    && IntStream.range(p + 1, k).allMatch(r ->
                        (Integer) IntStream.rangeClosed(0, 9).filter(d -> u[0] + del.applyAsInt(T, new int[]{r, d}) > L).findFirst().getAsInt() instanceof Integer d
                        && (u[0] += del.applyAsInt(T, new int[]{r, d})) > -1000000000
                        && (T[r] = d) >= 0)
                    ? Arrays.stream(T).mapToObj(String::valueOf).collect(Collectors.joining()) : "").orElse("-1")
                : "")));
    }
}
