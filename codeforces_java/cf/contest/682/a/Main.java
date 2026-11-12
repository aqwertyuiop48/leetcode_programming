import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long m
            ? IntStream.range(0, 5).mapToLong(r -> (n / 5 + (r > 0 && r <= n % 5 ? 1 : 0)) * (m / 5 + ((5 - r) % 5 > 0 && (5 - r) % 5 <= m % 5 ? 1 : 0))).sum() : "");
    }
}
