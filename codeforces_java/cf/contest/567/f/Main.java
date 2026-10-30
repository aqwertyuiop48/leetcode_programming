import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, k).mapToObj(i -> s.nextInt() + " " + s.next() + " " + s.nextInt()).toArray(String[]::new) instanceof String[] c
            && IntStream.range(0, k).map(i -> Integer.parseInt(c[i].split(" ")[0])).toArray() instanceof int[] ca
            && IntStream.range(0, k).mapToObj(i -> c[i].split(" ")[1]).toArray(String[]::new) instanceof String[] co
            && IntStream.range(0, k).map(i -> Integer.parseInt(c[i].split(" ")[2])).toArray() instanceof int[] cb
            && new long[2 * n + 3][2 * n + 3] instanceof long[][] dp
            && new long[1] instanceof long[] ans
            && (dp[1][2 * n] = 1) > 0
            && ((Function<int[], Boolean>) v -> dp[v[0]][v[1]] != 0
                && IntStream.range(0, k).allMatch(i -> (Integer) Integer.compare(
                        v[2] == ca[i] || v[3] == ca[i] ? 1 : ca[i] < v[0] || ca[i] > v[1] ? 0 : 2,
                        v[2] == cb[i] || v[3] == cb[i] ? 1 : cb[i] < v[0] || cb[i] > v[1] ? 0 : 2) instanceof Integer d
                    && (v[2] == ca[i] || v[3] == ca[i] || v[2] == cb[i] || v[3] == cb[i]
                        ? (co[i].equals("<") ? d < 0 : co[i].equals(">") ? d > 0 : co[i].equals("=") ? d == 0 : co[i].equals("<=") ? d <= 0 : d >= 0)
                        : true))
                && (v[4] > v[5] ? (ans[0] += dp[v[0]][v[1]]) >= 0 : (dp[v[4]][v[5]] += dp[v[0]][v[1]]) >= 0)) instanceof Function<int[], Boolean> push
            && IntStream.range(0, 2 * n - 1).filter(x -> (Integer) (2 * n - x) instanceof Integer len
                && IntStream.rangeClosed(1, 2 * n - len + 1).filter(l -> (Integer) (l + len - 1) instanceof Integer r
                    && (push.apply(new int[]{l, r, l, l + 1, l + 2, r})
                        | (len > 2 && push.apply(new int[]{l, r, r - 1, r, l, r - 2}))
                        | (len > 2 && push.apply(new int[]{l, r, l, r, l + 1, r - 1}))) || true).count() >= 0 || true).count() >= 0
            ? ans[0]
            : 0);
    }
}
