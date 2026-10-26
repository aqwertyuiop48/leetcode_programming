import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && IntStream.range(0, n * m).toArray() instanceof int[] par
            ? IntStream.range(0, n * m).anyMatch(idx -> IntStream.of(0, 1).anyMatch(dir -> idx / m + (1 - dir) < n && idx % m + dir < m
                    && g.get(idx / m).charAt(idx % m) == g.get(idx / m + 1 - dir).charAt(idx % m + dir)
                    && IntStream.iterate(idx, y -> par[y] = par[par[y]]).filter(y -> par[y] == y).findFirst().getAsInt()
                        == IntStream.iterate(idx + (1 - dir) * m + dir, y -> par[y] = par[par[y]]).filter(y -> par[y] == y).findFirst().getAsInt()
                    || idx / m + (1 - dir) < n && idx % m + dir < m && g.get(idx / m).charAt(idx % m) == g.get(idx / m + 1 - dir).charAt(idx % m + dir)
                        && (par[IntStream.iterate(idx, y -> par[y] = par[par[y]]).filter(y -> par[y] == y).findFirst().getAsInt()]
                            = IntStream.iterate(idx + (1 - dir) * m + dir, y -> par[y] = par[par[y]]).filter(y -> par[y] == y).findFirst().getAsInt()) < 0)) ? "Yes" : "No"
            : "");
    }
}
