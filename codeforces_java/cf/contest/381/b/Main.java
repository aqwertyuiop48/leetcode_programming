import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(Arrays.stream(t, 1, n + 1).max().getAsInt()) instanceof Integer mx && new int[mx + 1] instanceof int[] cnt
            && Arrays.stream(t, 1, n + 1).allMatch(v -> ++cnt[v] > 0)
            && IntStream.range(1, mx).filter(v -> cnt[v] >= 2).boxed().toList() instanceof List<Integer> left && IntStream.range(1, mx).filter(v -> cnt[v] >= 1).boxed().toList() instanceof List<Integer> right
            ? (left.size() + right.size() + 1) + "\n" + Stream.of(left.stream(), Stream.of(mx), IntStream.range(1, mx).map(i -> mx - i).filter(v -> cnt[v] >= 1).boxed()).flatMap(x -> x).map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
