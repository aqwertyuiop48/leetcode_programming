import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long x0 && Long.valueOf(s.nextLong()) instanceof Long y0 && Long.valueOf(s.nextLong()) instanceof Long x1 && Long.valueOf(s.nextLong()) instanceof Long y1
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> dist
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(s.nextLong()) instanceof Long r && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b
                && LongStream.rangeClosed(a, b).allMatch(c -> dist.put(r * 2000000001L + c, -1) == null || true))
            && dist.containsKey(x0 * 2000000001L + y0) && new ArrayDeque<Long>(List.of(x0 * 2000000001L + y0)) instanceof ArrayDeque<Long> dq
            && dist.put(x0 * 2000000001L + y0, 0) != null
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> IntStream.range(0, 9).allMatch(d -> d == 4 || Long.valueOf(v + (d / 3 - 1) * 2000000001L + (d % 3 - 1)) instanceof Long u
                && (dist.getOrDefault(u, 0) != -1 || dist.put(u, dist.get(v) + 1) != null && dq.add(u) || true))).count() >= 0
            ? dist.getOrDefault(x1 * 2000000001L + y1, -1) : "");
    }
}
