import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> sc.nextInt() / 50).toArray() instanceof int[] w && Integer.valueOf((int) Arrays.stream(w).filter(x -> x == 1).count()) instanceof Integer A && Integer.valueOf(n - A) instanceof Integer B
            && Long.valueOf(1000000007L) instanceof Long M && new long[52][52] instanceof long[][] C
            && IntStream.range(0, 52).allMatch(i -> (C[i][0] = 1) > 0 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % M) >= 0))
            && new int[A + 1][B + 1][2] instanceof int[][][] dist && new long[A + 1][B + 1][2] instanceof long[][][] ways
            && Arrays.stream(dist).allMatch(r -> Arrays.stream(r).allMatch(c -> (c[0] = -1) < 0 && (c[1] = -1) < 0))
            && (dist[A][B][0] = 0) == 0 && (ways[A][B][0] = 1) == 1 && new ArrayDeque<int[]>(List.of(new int[]{A, B, 0})) instanceof ArrayDeque<int[]> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(s -> Integer.valueOf(s[2] == 0 ? s[0] : A - s[0]) instanceof Integer ca && Integer.valueOf(s[2] == 0 ? s[1] : B - s[1]) instanceof Integer cb
                && IntStream.rangeClosed(0, ca).allMatch(i -> IntStream.rangeClosed(0, cb).filter(j -> i + j >= 1 && 50 * i + 100 * j <= k).allMatch(j ->
                    new int[]{s[2] == 0 ? s[0] - i : s[0] + i, s[2] == 0 ? s[1] - j : s[1] + j, 1 - s[2]} instanceof int[] t
                    && (dist[t[0]][t[1]][t[2]] >= 0 || (dist[t[0]][t[1]][t[2]] = dist[s[0]][s[1]][s[2]] + 1) > 0 && dq.add(t))
                    && (dist[t[0]][t[1]][t[2]] != dist[s[0]][s[1]][s[2]] + 1 || (ways[t[0]][t[1]][t[2]] = (ways[t[0]][t[1]][t[2]] + ways[s[0]][s[1]][s[2]] * C[ca][i] % M * C[cb][j]) % M) >= 0))))
            ? dist[0][0][1] + "\n" + ways[0][0][1] : "");
    }
}
