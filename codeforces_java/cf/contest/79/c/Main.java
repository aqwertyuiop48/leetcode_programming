import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> L
            && L.get(0).trim() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && L.subList(2, 2 + Integer.parseInt(L.get(1).trim())) instanceof List<String> W
            && new int[n + 1] instanceof int[] e
            && (e[n] = n) >= 0
            && IntStream.range(0, n).map(i -> n - 1 - i).allMatch(i -> (e[i] = Math.min(e[i + 1], W.stream().filter(w -> s.startsWith(w.trim(), i)).mapToInt(w -> i + w.trim().length() - 1).min().orElse(n))) >= 0)
            && IntStream.range(0, n).boxed().max(Comparator.comparingInt((Integer i) -> e[i] - i).thenComparingInt(i -> e[i] > i ? i : -i)) instanceof Optional<Integer> b
            ? (e[b.get()] - b.get()) + " " + b.get() : "");
    }
}




