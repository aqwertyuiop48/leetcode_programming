import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long p && Long.valueOf(s.nextLong()) instanceof Long d
            ? Stream.concat(Stream.of(p), LongStream.rangeClosed(1, 18).map(k -> p / (long) Math.pow(10, k) * (long) Math.pow(10, k) - 1).boxed())
                .filter(x -> x >= p - d && x >= 0 && x <= p)
                .max(Comparator.<Long>comparingLong(x -> String.valueOf(x).length() - String.valueOf(x).replaceAll("9+$", "").length()).thenComparingLong(x -> x)).get() : "");
    }
}

