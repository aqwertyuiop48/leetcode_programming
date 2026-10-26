import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Long) s.nextLong() instanceof Long a
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] d && (Long) LongStream.of(d).sum() instanceof Long sum
            ? LongStream.of(d).map(x -> x - (Math.min(x, a - (n - 1)) - Math.max(1, a - (sum - x)) + 1)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
