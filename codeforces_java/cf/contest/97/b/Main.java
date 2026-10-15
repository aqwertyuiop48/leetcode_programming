import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split("\\s+") instanceof String[] tk
            && Arrays.stream(tk).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && IntStream.range(0, a[0]).mapToObj(i -> new int[]{a[1 + 2 * i], a[2 + 2 * i]})
                .sorted(Comparator.comparingInt((int[] q) -> q[0])).toArray(int[][]::new) instanceof int[][] pt
            && new LinkedHashSet<String>() instanceof LinkedHashSet<String> out
            && IntStream.range(0, a[0]).allMatch(i -> out.add(a[1 + 2 * i] + " " + a[2 + 2 * i]) || true)
            && new AtomicReference<BiPredicate<Integer, Integer>>() instanceof AtomicReference<BiPredicate<Integer, Integer>> h
            && h.getAndSet((lo, hi) -> lo > hi
                || (IntStream.rangeClosed(lo, hi).allMatch(i -> out.add(pt[(lo + hi) / 2][0] + " " + pt[i][1]) || true)
                    && h.get().test(lo, (lo + hi) / 2 - 1)
                    && h.get().test((lo + hi) / 2 + 1, hi))) == null
            && h.get().test(0, a[0] - 1)
            ? out.size() + "\n" + String.join("\n", out)
            : "");
    }
}


