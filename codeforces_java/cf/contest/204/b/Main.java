import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> cs
            && cs.stream().collect(Collectors.groupingBy(c -> c[0], Collectors.counting())) instanceof Map<Integer, Long> fr
            && cs.stream().filter(c -> c[0] != c[1]).collect(Collectors.groupingBy(c -> c[1], Collectors.counting())) instanceof Map<Integer, Long> bk
            && Integer.valueOf((n + 1) / 2) instanceof Integer need
            ? Stream.concat(fr.keySet().stream(), bk.keySet().stream()).distinct()
                .filter(c -> fr.getOrDefault(c, 0L) + bk.getOrDefault(c, 0L) >= need)
                .mapToLong(c -> Math.max(0, need - fr.getOrDefault(c, 0L))).min().stream().boxed().findFirst().map(Object::toString).orElse("-1") : "");
    }
}
