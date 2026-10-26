import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n] instanceof int[] x && new int[n] instanceof int[] y && IntStream.range(0, n).allMatch(i -> (x[i] = Integer.parseInt(tk.nextToken())) > 0 && (y[i] = Integer.parseInt(tk.nextToken())) > 0)
            && new int[n][2] instanceof int[][] nb && IntStream.range(0, n).allMatch(i -> (nb[i][0] = -1) < 0 && (nb[i][1] = -1) < 0)
            && IntStream.range(0, 2).allMatch(dim -> IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> dim == 0 ? x[i] : y[i])).mapToInt(Integer::intValue).toArray() instanceof int[] ord
                && IntStream.range(0, n - 1).filter(i -> (dim == 0 ? x[ord[i]] == x[ord[i + 1]] : y[ord[i]] == y[ord[i + 1]]) && (i == 0 || (dim == 0 ? x[ord[i - 1]] != x[ord[i]] : y[ord[i - 1]] != y[ord[i]]) || (nb[ord[i]][dim] < 0)))
                    .allMatch(i -> nb[ord[i]][dim] >= 0 || nb[ord[i + 1]][dim] >= 0 || (nb[ord[i]][dim] = ord[i + 1]) >= 0 && (nb[ord[i + 1]][dim] = ord[i]) >= 0))
            && new int[n] instanceof int[] col && IntStream.range(0, n).allMatch(i -> (col[i] = -1) < 0)
            && IntStream.range(0, n).filter(v -> col[v] < 0).allMatch(s -> (col[s] = 0) == 0 && new ArrayDeque<Integer>(List.of(s)) instanceof ArrayDeque<Integer> q
                && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.range(0, 2).filter(d -> nb[u][d] >= 0 && col[nb[u][d]] < 0).allMatch(d -> (col[nb[u][d]] = 1 - col[u]) >= 0 && q.add(nb[u][d]))))
            ? IntStream.range(0, n).mapToObj(i -> col[i] == 0 ? "b" : "r").collect(Collectors.joining()) : "");
    }
}
