import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] h
            ? h[0] + 1 + IntStream.range(1, n).map(i -> Math.abs(h[i] - h[i - 1]) + 2).sum() : "");
    }
}
