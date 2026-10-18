import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer p && new int[n + 1] instanceof int[] nxt && new int[n + 1] instanceof int[] dia && new boolean[n + 1] instanceof boolean[] hasIn && IntStream.range(0, p).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && (nxt[a] = b) > 0 && (dia[a] = s.nextInt()) > 0 && (hasIn[b] = true)) && IntStream.rangeClosed(1, n).filter(t -> !hasIn[t] && nxt[t] != 0).mapToObj(t -> t + " " + nxt[IntStream.iterate(t, v -> nxt[v] != 0, v -> nxt[v]).reduce((x, y) -> y).getAsInt()] + " " + IntStream.iterate(t, v -> nxt[v] != 0, v -> nxt[v]).map(v -> dia[v]).min().getAsInt()).collect(Collectors.toList()) instanceof List<String> res ? res.size() + (res.isEmpty() ? "" : "\n" + String.join("\n", res)) : "").ifPresent(System.out::println);
    }
}
