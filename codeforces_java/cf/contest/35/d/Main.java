import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && IntStream.range(0, v[0]).map(i -> v[2 + i] * (v[0] - i)).sorted().toArray() instanceof int[] w
            ? IntStream.range(0, v[0]).filter(k -> IntStream.rangeClosed(0, k).map(j -> w[j]).sum() <= v[1]).count()
            : 0);
    }
}

