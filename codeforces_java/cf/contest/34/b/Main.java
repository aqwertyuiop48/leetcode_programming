import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            ? IntStream.of(v).skip(2).sorted().limit(v[1]).filter(x -> x < 0).map(x -> -x).sum()
            : 0);
    }
}




