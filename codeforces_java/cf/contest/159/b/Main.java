import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.nextInt() + " " + s.nextInt()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) instanceof Map<String, Long> mk
            && IntStream.range(0, m).mapToObj(i -> s.nextInt() + " " + s.nextInt()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) instanceof Map<String, Long> cp
            && ((Function<Map<String, Long>, Map<String, Long>>) mp -> mp.entrySet().stream().collect(Collectors.groupingBy(e -> e.getKey().split(" ")[1], Collectors.summingLong(Map.Entry::getValue)))) instanceof Function<Map<String, Long>, Map<String, Long>> byDiam
            && byDiam.apply(mk) instanceof Map<String, Long> dm
            && byDiam.apply(cp) instanceof Map<String, Long> dc
            ? dm.entrySet().stream().mapToLong(e -> Math.min(e.getValue(), dc.getOrDefault(e.getKey(), 0L))).sum() + " "
                + mk.entrySet().stream().mapToLong(e -> Math.min(e.getValue(), cp.getOrDefault(e.getKey(), 0L))).sum()
            : "");
    }
}
