import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).toList() instanceof List<String> t
            && Integer.valueOf(t.get(0)) instanceof Integer n && t.get(1) instanceof String s
            ? IntStream.range(3, s.length()).filter(i -> i % n == 0 && s.charAt(i - 1) == s.charAt(i - 2) && s.charAt(i - 2) == s.charAt(i - 3)).count() : "");
    }
}
