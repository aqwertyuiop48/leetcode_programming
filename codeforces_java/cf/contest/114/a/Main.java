import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Long) s.nextLong() instanceof Long k && (Long) s.nextLong() instanceof Long l ? (Long) Stream.iterate(k, v -> v <= l, v -> v * k).count() instanceof Long c && Stream.iterate(k, v -> v <= l, v -> v * k).anyMatch(v -> v.equals(l)) ? "YES\n" + (c - 1) : "NO" : "").ifPresent(System.out::println);
    }
}

