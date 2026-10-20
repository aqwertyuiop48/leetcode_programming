import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Arrays.copyOfRange(t, 1, t.length) instanceof int[] a
            && IntStream.iterate(30, v -> v >= 0, v -> v - 1).mapToObj(v -> Arrays.stream(a).filter(x -> (x >> v & 1) == 1).toArray() instanceof int[] c
                && c.length > 0 && (Arrays.stream(c).reduce(-1, (x, y) -> x & y) & ((1 << v) - 1)) == 0 ? c : null).filter(Objects::nonNull).findFirst().orElse(a) instanceof int[] r
            ? r.length + "\n" + Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
