import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n && Long.valueOf(it.next()) instanceof Long d && Long.valueOf(it.next()) instanceof Long S
            && IntStream.range(0, n).mapToObj(i -> new long[]{it.next(), it.next(), it.next()}).toList() instanceof List<long[]> rb
            && Long.valueOf(rb.stream().mapToLong(r -> r[0]).sum()) instanceof Long C
            && rb.stream().filter(r -> r[2] >= d && r[1] <= S).toList() instanceof List<long[]> el
            && el.stream().filter(r -> r[0] == 0).mapToLong(r -> r[1]).sorted().toArray() instanceof long[] z
            && new long[]{0, 0} instanceof long[] a
            && Arrays.stream(z).takeWhile(f -> a[1] + f <= S && (a[1] += f) >= 0 && ++a[0] > 0).count() >= 0
            && el.stream().filter(r -> r[0] > 0).min(Comparator.comparingLong(r -> r[1])) instanceof Optional<long[]> root
            ? !root.isPresent() ? a[0] + " " + a[1]
                : el.stream().filter(r -> r != root.get()).mapToLong(r -> r[1]).sorted().toArray() instanceof long[] oth
                    && Long.valueOf(IntStream.rangeClosed(0, oth.length).filter(j -> root.get()[1] + Arrays.stream(oth, 0, j).sum() <= S).max().getAsInt() + 1L) instanceof Long kmax
                    && Long.valueOf(Math.min(n, C + kmax)) instanceof Long totB
                    && Long.valueOf(root.get()[1] + Arrays.stream(oth, 0, (int) (Math.min(kmax, Math.max(1, n - C)) - 1)).sum()) instanceof Long fuelB
                    ? totB > a[0] || totB == a[0] && fuelB < a[1] ? totB + " " + fuelB : a[0] + " " + a[1] : "" : "");
    }
}
