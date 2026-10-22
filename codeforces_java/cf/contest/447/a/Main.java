import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer p && Integer.valueOf(it.next()) instanceof Integer n && new boolean[p] instanceof boolean[] seen
            ? IntStream.rangeClosed(1, n).filter(i -> Integer.valueOf(it.next() % p) instanceof Integer r && (seen[r] || !(seen[r] = true))).findFirst().orElse(-1) : "");
    }
}
