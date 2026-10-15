import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()}).ifPresent(v ->
            System.out.println(
                IntStream.range(0, v[4]).map(i -> sc.nextInt()).toArray() instanceof int[] x
                && IntStream.rangeClosed(0, v[4]).map(i -> Arrays.stream(x).limit(i).sum()).toArray() instanceof int[] pre
                && Integer.valueOf(Math.max(v[1], v[3])) instanceof Integer rows
                && new char[rows][v[0] + v[2]] instanceof char[][] g
                && IntStream.range(0, rows).allMatch(i -> IntStream.range(0, v[0] + v[2]).allMatch(j -> (g[i][j] = '.') == '.'))
                && IntStream.range(0, v[0] + v[2]).boxed().flatMap(j -> (j < v[0] ? (v[0] - 1 - j) % 2 == 0 : (j - v[0]) % 2 != 0)
                    ? IntStream.iterate((j < v[0] ? v[1] : v[3]) - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> new int[]{i, j})
                    : IntStream.range(0, j < v[0] ? v[1] : v[3]).mapToObj(i -> new int[]{i, j})).toList() instanceof List<int[]> path
                && IntStream.range(0, path.size()).allMatch(t -> (g[path.get(t)[0]][path.get(t)[1]] = (char) ('a' + (int) IntStream.rangeClosed(1, v[4]).filter(k -> pre[k] <= t).count())) > 0)
                ? "YES\n" + Arrays.stream(g).map(String::new).collect(Collectors.joining("\n"))
                : "")));
    }
}


