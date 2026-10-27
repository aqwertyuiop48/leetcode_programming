import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer p && new int[n + 1] instanceof int[] out && new int[n + 1] instanceof int[] d && new boolean[n + 1] instanceof boolean[] in && IntStream.range(0, p).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && (Integer) s.nextInt() instanceof Integer w && (out[a] = b) > 0 && (d[a] = w) > 0 && (in[b] = true)) && IntStream.rangeClosed(1, n).filter(i -> !in[i] && out[i] != 0).mapToObj(i -> Stream.iterate(i, x -> out[x] != 0, x -> out[x]).mapToInt(x -> x).toArray()).map(path -> path[0] + " " + out[path[path.length - 1]] + " " + IntStream.of(path).map(x -> d[x]).min().getAsInt()).collect(Collectors.toList()) instanceof List<String> L ? L.size() + (L.isEmpty() ? "" : "\n" + String.join("\n", L)) : "").ifPresent(System.out::println);
    }
}

