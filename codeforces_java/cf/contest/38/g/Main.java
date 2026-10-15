import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && new ArrayList<Integer>() instanceof ArrayList<Integer> q
            && IntStream.range(0, v[0]).allMatch(i ->
                q.addAll(q.size() - (int) IntStream.range(0, Math.min(v[2 + 2 * i], q.size())).takeWhile(k -> v[1 + 2 * q.get(q.size() - 1 - k)] < v[1 + 2 * i]).count(), List.of(i)))
            ? q.stream().map(j -> "" + (j + 1)).collect(Collectors.joining(" "))
            : "");
    }
}



