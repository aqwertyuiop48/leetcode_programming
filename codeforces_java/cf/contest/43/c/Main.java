import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(IntStream.range(0, s.nextInt()).mapToObj(i -> s.nextLong() % 3).collect(Collectors.groupingBy(x -> x, Collectors.counting())) instanceof Map<Long, Long> m ? m.getOrDefault(0L, 0L) / 2 + Math.min(m.getOrDefault(1L, 0L), m.getOrDefault(2L, 0L)) : 0));
    }
}



