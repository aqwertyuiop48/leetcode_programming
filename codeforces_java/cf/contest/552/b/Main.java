import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long n
            ? IntStream.range(0, 10).mapToLong(k -> Math.max(0L, n - Long.parseLong("1" + "0".repeat(k)) + 1)).sum() : 0);
    }
}
