import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] a
            ? IntStream.range(0, 25).filter(i -> a[i] == 1).map(i -> Math.abs(i / 5 - 2) + Math.abs(i % 5 - 2)).sum() : "");
    }
}
