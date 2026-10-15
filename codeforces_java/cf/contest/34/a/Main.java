import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && IntStream.range(0, v[0]).boxed().min(Comparator.comparingInt(i -> Math.abs(v[i + 1] - v[(i + 1) % v[0] + 1]))).get() instanceof Integer k
            ? (k + 1) + " " + ((k + 1) % v[0] + 1)
            : "");
    }
}



