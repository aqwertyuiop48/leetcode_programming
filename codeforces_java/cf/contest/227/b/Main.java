import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new int[n + 1] instanceof int[] pos && IntStream.rangeClosed(1, n).allMatch(i -> (pos[it.next()] = i) > 0)
            && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> pos[it.next()]).toArray() instanceof long[] ps
            ? Arrays.stream(ps).sum() + " " + Arrays.stream(ps).map(p -> n - p + 1).sum() : "");
    }
}

