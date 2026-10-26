import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && ((Supplier<List<int[]>>) () -> new boolean[n + 2][n + 2] instanceof boolean[][] adj
                && IntStream.rangeClosed(1, n).allMatch(i -> (adj[i][i % n + 1] = adj[i % n + 1][i] = true))
                && IntStream.range(0, n - 3).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && (adj[a][b] = adj[b][a] = true))
                ? IntStream.generate(() -> 0).mapToObj(z -> IntStream.rangeClosed(2, n).filter(v -> adj[1][v]).toArray() instanceof int[] nb
                        && IntStream.range(0, nb.length - 1).filter(i -> nb[i + 1] - nb[i] > 1).findFirst() instanceof OptionalInt g && g.isPresent()
                        && (Integer) nb[g.getAsInt()] instanceof Integer a && (Integer) nb[g.getAsInt() + 1] instanceof Integer b
                        && IntStream.range(a + 1, b).filter(w -> adj[a][w] && adj[w][b]).findFirst() instanceof OptionalInt wi
                        && (adj[a][b] = adj[b][a] = false) == false && (adj[1][wi.getAsInt()] = adj[wi.getAsInt()][1] = true)
                        ? new int[]{a, b, wi.getAsInt()} : null).takeWhile(Objects::nonNull).toList() : null) instanceof Supplier<List<int[]>> conv
            && conv.get() instanceof List<int[]> f1 && conv.get() instanceof List<int[]> f2
            ? (f1.size() + f2.size()) + "\n" + Stream.concat(f1.stream().map(x -> x[0] + " " + x[1]),
                IntStream.range(0, f2.size()).mapToObj(i -> "1 " + f2.get(f2.size() - 1 - i)[2])).collect(Collectors.joining("\n")) : "");
    }
}
