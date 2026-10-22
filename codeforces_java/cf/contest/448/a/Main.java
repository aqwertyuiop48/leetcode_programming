import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).toList() instanceof List<Integer> v
            ? (v.get(0) + v.get(1) + v.get(2) + 4) / 5 + (v.get(3) + v.get(4) + v.get(5) + 9) / 10 <= v.get(6) ? "YES" : "NO" : "");
    }
}
