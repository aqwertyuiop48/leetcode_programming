import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(Integer.parseInt(s.nextLine().trim())) instanceof Integer n
                && IntStream.range(0, n).mapToObj(i -> s.nextLine().trim()).toList() instanceof List<String> names
                && new long[n] instanceof long[] pts
                && new long[n] instanceof long[] gf
                && new long[n] instanceof long[] ga
                && IntStream.range(0, n * (n - 1) / 2).mapToObj(i -> s.nextLine().trim().split("[\\s:-]+"))
                    .map(p -> new int[]{names.indexOf(p[0]), names.indexOf(p[1]), Integer.parseInt(p[2]), Integer.parseInt(p[3])})
                    .allMatch(q -> (gf[q[0]] += q[2]) >= 0 && (ga[q[0]] += q[3]) >= 0 && (gf[q[1]] += q[3]) >= 0 && (ga[q[1]] += q[2]) >= 0
                        && (q[2] > q[3] ? (pts[q[0]] += 3) >= 0 : q[3] > q[2] ? (pts[q[1]] += 3) >= 0 : (pts[q[0]] += 1) >= 0 && (pts[q[1]] += 1) >= 0))
                && IntStream.range(0, n).boxed()
                    .sorted(Comparator.<Integer>comparingLong(a -> -pts[a]).thenComparingLong(a -> -(gf[a] - ga[a])).thenComparingLong(a -> -gf[a]))
                    .limit(n / 2).map(names::get).sorted().collect(Collectors.joining("\n")) instanceof String out
                ? out
                : ""));
    }
}

