import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && w[0] instanceof String s && Integer.valueOf(w[1]) instanceof Integer n
            && s.chars().boxed().collect(Collectors.groupingBy(c -> c, TreeMap::new, Collectors.counting())) instanceof TreeMap<Integer, Long> cnt
            && IntStream.rangeClosed(1, s.length()).filter(k -> cnt.values().stream().mapToLong(v -> (v + k - 1) / k).sum() <= n).findFirst() instanceof OptionalInt ok
            ? (ok.isPresent() ? ok.getAsInt() + "\n" + (cnt.entrySet().stream().map(e -> String.valueOf((char) e.getKey().intValue()).repeat((int) ((e.getValue() + ok.getAsInt() - 1) / ok.getAsInt()))).collect(Collectors.joining()) instanceof String sh
                ? sh + "a".repeat(n - sh.length()) : "") : "-1") : "");
    }
}
