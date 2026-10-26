import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toList() instanceof List<long[]> p
            ? IntStream.range(0, m - 1).anyMatch(i -> Math.abs(p.get(i + 1)[1] - p.get(i)[1]) > p.get(i + 1)[0] - p.get(i)[0]) ? "IMPOSSIBLE"
                : String.valueOf(LongStream.concat(LongStream.of(p.get(0)[1] + p.get(0)[0] - 1, p.get(m - 1)[1] + n - p.get(m - 1)[0]),
                    LongStream.concat(IntStream.range(0, m).mapToLong(i -> p.get(i)[1]), IntStream.range(0, m - 1).mapToLong(i -> (p.get(i)[1] + p.get(i + 1)[1] + p.get(i + 1)[0] - p.get(i)[0]) / 2))).max().getAsLong()) : "");
    }
}
