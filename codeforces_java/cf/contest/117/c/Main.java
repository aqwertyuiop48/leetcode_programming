import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> IntStream.range(0, s.nextInt()).mapToObj(i -> s.next()).toArray(String[]::new)).ifPresent(g ->
            System.out.println(Arrays.stream(g).mapToLong(r -> r.chars().filter(c -> c == '1').count()).toArray() instanceof long[] deg
                ? IntStream.range(0, g.length).boxed().flatMap(u -> IntStream.range(0, g.length)
                        .filter(v -> g[u].charAt(v) == '1' && deg[v] >= deg[u]).mapToObj(v -> new int[]{u, v}))
                    .findFirst()
                    .map(e -> IntStream.range(0, g.length).filter(w -> g[e[1]].charAt(w) == '1' && g[w].charAt(e[0]) == '1')
                        .mapToObj(w -> (e[0] + 1) + " " + (e[1] + 1) + " " + (w + 1)).findFirst().orElse("-1"))
                    .orElse("-1")
                : ""));
    }
}
