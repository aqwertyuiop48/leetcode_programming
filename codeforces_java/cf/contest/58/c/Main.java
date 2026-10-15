import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(s -> Optional.of(Integer.parseInt(s.nextToken())).ifPresent(n ->
            System.out.println(n - IntStream.range(0, n).map(i -> Integer.parseInt(s.nextToken()) - Math.min(i, n - 1 - i)).filter(k -> k >= 1).boxed()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting())).values().stream()
                .mapToInt(Long::intValue).max().orElse(0))));
    }
}

