import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().map(String::trim).toArray(String[]::new) instanceof String[] ln
            && ((Function<String, int[]>) s -> s.chars().map(c -> c - '0').map(d -> d == 9 ? 6 : d == 5 ? 2 : d).boxed().collect(Collectors.groupingBy(d -> d, Collectors.counting())) instanceof Map<Integer, Long> m
                ? IntStream.range(0, 10).map(d -> m.getOrDefault(d, 0L).intValue()).toArray() : null) instanceof Function<String, int[]> cnt
            && cnt.apply(ln[0]) instanceof int[] need && cnt.apply(ln[1]) instanceof int[] have
            ? IntStream.range(0, 10).filter(d -> need[d] > 0).map(d -> have[d] / need[d]).min().getAsInt() : "");
    }
}
