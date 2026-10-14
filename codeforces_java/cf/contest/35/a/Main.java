import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            ? IntStream.range(0, 3).reduce(v[0], (p, i) -> p == v[1 + 2 * i] ? v[2 + 2 * i] : p == v[2 + 2 * i] ? v[1 + 2 * i] : p)
            : 0);
    }
}

