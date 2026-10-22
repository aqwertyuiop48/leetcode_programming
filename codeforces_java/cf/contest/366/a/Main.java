import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            ? IntStream.rangeClosed(1, 4).mapToObj(i -> new int[]{i, Math.min(it.next(), it.next()), Math.min(it.next(), it.next())}).filter(r -> r[1] + r[2] <= n).findFirst().map(r -> r[0] + " " + r[1] + " " + (n - r[1])).orElse("-1") : "");
    }
}
