import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> in
            && in.get(0).trim() instanceof String s && in.get(1).trim() instanceof String t
            && IntStream.range(0, 26).allMatch(c -> s.chars().filter(x -> x == 'a' + c).count() >= t.chars().filter(x -> x == 'a' + c).count())
            ? s.length() == t.length() ? "array"
                : s.chars().boxed().reduce(0, (j, ch) -> j < t.length() && ch == t.charAt(j) ? j + 1 : j) == t.length() ? "automaton" : "both"
            : "need tree");
    }
}
