import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            ? IntStream.rangeClosed(v[1], 100).map(d -> d * IntStream.range(0, v[0]).map(i -> v[2 + i] / d).sum()).max().orElse(0)
            : 0);
    }
}
