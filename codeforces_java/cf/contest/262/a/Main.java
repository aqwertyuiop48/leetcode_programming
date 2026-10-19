import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            ? IntStream.range(0, n).filter(i -> it.next().chars().filter(c -> c == '4' || c == '7').count() <= k).count() : "");
    }
}
