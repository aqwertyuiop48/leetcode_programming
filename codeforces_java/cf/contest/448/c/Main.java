import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new AtomicReference<Function<int[], Integer>>() instanceof AtomicReference<Function<int[], Integer>> f
            && f.getAndSet(x -> Integer.valueOf(IntStream.rangeClosed(x[0], x[1]).map(i -> a[i]).min().getAsInt()) instanceof Integer m
                && IntStream.rangeClosed(x[0] - 1, x[1] + 1).filter(i -> i == x[0] - 1 || i == x[1] + 1 || a[i] == m).toArray() instanceof int[] cuts
                ? Math.min(x[1] - x[0] + 1, m - x[2] + IntStream.range(0, cuts.length - 1).filter(k -> cuts[k + 1] - cuts[k] > 1).map(k -> f.get().apply(new int[]{cuts[k] + 1, cuts[k + 1] - 1, m})).sum()) : 0) == null
            ? f.get().apply(new int[]{0, n - 1, 0}) : ""), "", 1 << 29).start();
    }
}
