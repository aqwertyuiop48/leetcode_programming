import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer k
            ? IntStream.rangeClosed(1, n).mapToObj(i -> i <= k ? 2 * i + " " + (2 * i - 1) : (2 * i - 1) + " " + 2 * i).collect(Collectors.joining(" ")) : "");
    }
}
