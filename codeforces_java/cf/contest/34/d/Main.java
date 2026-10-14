import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && ((IntUnaryOperator) c -> v[c + 2 - (c > v[1] ? 1 : 0)]) instanceof IntUnaryOperator p
            && Stream.concat(Stream.iterate(v[2], x -> x != v[1], x -> p.applyAsInt(x)), Stream.of(v[1])).toList() instanceof List<Integer> path
            && IntStream.range(0, path.size() - 1).boxed().collect(Collectors.toMap(i -> path.get(i + 1), i -> path.get(i))) instanceof Map<Integer, Integer> mp
            ? IntStream.rangeClosed(1, v[0]).filter(c -> c != v[2]).mapToObj(c -> "" + (mp.containsKey(c) ? mp.get(c) : p.applyAsInt(c))).collect(Collectors.joining(" "))
            : "");
    }
}
