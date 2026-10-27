import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new StringTokenizer(new String(System.in.readAllBytes()))).map(st -> (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer m && IntStream.range(0, n).mapToObj(i -> st.nextToken()).toArray(String[]::new) instanceof String[] g && new int[n + 1][m + 1] instanceof int[][] p && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (p[i + 1][j + 1] = p[i][j + 1] + p[i + 1][j] - p[i][j] + (g[i].charAt(j) == '#' ? 1 : 0)) >= 0)) && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer k && IntStream.range(0, k).mapToObj(i -> (Integer) "NSWE".indexOf(st.nextToken().charAt(0)) instanceof Integer z && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer d ? new int[] {new int[] {-1, 1, 0, 0}[z] * d, new int[] {0, 0, -1, 1}[z] * d} : null).toArray(int[][]::new) instanceof int[][] cmds && IntStream.range(0, n * m).filter(x -> Character.isLetter(g[x / m].charAt(x % m))).boxed().sorted(Comparator.comparingInt(x -> g[x / m].charAt(x % m))).filter(x -> new int[] {x / m, x % m} instanceof int[] cur && Arrays.stream(cmds).allMatch(c -> (Integer) (cur[0] + c[0]) instanceof Integer nr && (Integer) (cur[1] + c[1]) instanceof Integer nc && nr >= 0 && nr < n && nc >= 0 && nc < m && p[Math.max(nr, cur[0]) + 1][Math.max(nc, cur[1]) + 1] - p[Math.min(nr, cur[0])][Math.max(nc, cur[1]) + 1] - p[Math.max(nr, cur[0]) + 1][Math.min(nc, cur[1])] + p[Math.min(nr, cur[0])][Math.min(nc, cur[1])] == 0 && (cur[0] = nr) >= 0 && (cur[1] = nc) >= 0)).map(x -> String.valueOf(g[x / m].charAt(x % m))).collect(Collectors.joining()) instanceof String res ? res.isEmpty() ? "no solution" : res : "").ifPresent(System.out::println);
    }
}

