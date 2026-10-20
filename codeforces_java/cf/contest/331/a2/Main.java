import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Arrays.copyOfRange(t, 1, 1 + n) instanceof long[] a
            && new long[n] instanceof long[] pos && IntStream.range(0, n).allMatch(i -> (pos[i] = (i > 0 ? pos[i - 1] : 0) + Math.max(a[i], 0)) >= 0)
            && IntStream.range(0, n).boxed().collect(Collectors.groupingBy(i -> a[i])).values().stream().filter(l -> l.size() > 1)
                .map(l -> new long[]{a[l.get(0)] + a[l.get(l.size() - 1)] + pos[l.get(l.size() - 1) - 1] - pos[l.get(0)], l.get(0), l.get(l.size() - 1)}).max(Comparator.comparingLong(r -> r[0])) instanceof Optional<long[]> best
            && best.isPresent() && best.get() instanceof long[] r
            && IntStream.range(0, n).filter(i -> i < r[1] || i > r[2] || i > r[1] && i < r[2] && a[i] < 0).map(i -> i + 1).boxed().collect(Collectors.toList()) instanceof List<Integer> cut
            ? r[0] + " " + cut.size() + "\n" + cut.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
