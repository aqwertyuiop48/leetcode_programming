import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Long.valueOf(s.nextLong()) instanceof Long l
            && Long.valueOf(s.nextLong()) instanceof Long v1
            && Long.valueOf(s.nextLong()) instanceof Long v2
            && Long.valueOf(v1 + v2) instanceof Long sp
            && Long.valueOf(2 * l * sp) instanceof Long len
            && Long.valueOf(l * v2) instanceof Long d
            && LongStream.generate(s::nextLong).limit(n).map(a -> (a % (2 * l) == 0 ? 2 * l : a % (2 * l)) * sp).toArray() instanceof long[] fl
            && Stream.concat(Arrays.stream(fl).mapToObj(a -> new long[]{((a - d) % len + len) % len, 1}), Arrays.stream(fl).mapToObj(a -> new long[]{a, -1}))
                .sorted(Comparator.<long[]>comparingLong(e -> e[0]).thenComparingLong(e -> -e[1])).toList() instanceof List<long[]> ev
            && new double[n + 2] instanceof double[] tot
            && new long[]{Arrays.stream(fl).filter(a -> a < d).count(), 0} instanceof long[] st
            && ev.stream().allMatch(e -> (tot[(int) st[0]] += e[0] - st[1]) >= 0 && (st[0] += e[1]) >= 0 && (st[1] = e[0]) >= 0)
            && (tot[(int) st[0]] += len - st[1]) >= 0
            ? Arrays.stream(tot, 0, n + 1).mapToObj(x -> String.format("%.15f", x / len)).collect(Collectors.joining("\n"))
            : "");
    }
}
