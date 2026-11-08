import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long l && Long.valueOf(sc.nextLong()) instanceof Long r && Long.valueOf(sc.nextLong()) instanceof Long k
            && LongStream.iterate(1L, p -> p > 0, p -> p <= r / k ? p * k : -1L).filter(p -> p >= l).mapToObj(Long::toString).collect(Collectors.joining(" ")) instanceof String res
            ? (res.isEmpty() ? "-1" : res) : "");
    }
}
