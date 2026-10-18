import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.next()).ifPresent(s -> Optional.of(sc.nextInt()).ifPresent(n -> System.out.print(IntStream.of(0, 1).map(d0 -> Optional.of(IntStream.range(0, s.length()).boxed().reduce(Optional.of(new int[n + 1][2]).filter(dp -> Arrays.stream(dp).allMatch(row -> (row[0] = row[1] = -1000) < 0) && (dp[0][d0] = 0) == 0).get(), (cur, idx) -> Optional.of(new int[n + 1][2]).filter(nx -> Arrays.stream(nx).allMatch(row -> (row[0] = row[1] = -1000) < 0) && IntStream.range(0, (n + 1) * 4).allMatch(z -> cur[z / 4][z / 2 % 2] < -500 || z / 4 + z % 2 > n || ((Boolean) (s.charAt(idx) == 'F' != (z % 2 == 1)) instanceof Boolean f && (Integer) (f ? z / 2 % 2 : 1 - z / 2 % 2) instanceof Integer d2 && (nx[z / 4 + z % 2][d2] = Math.max(nx[z / 4 + z % 2][d2], cur[z / 4][z / 2 % 2] + (f ? (z / 2 % 2 == 0 ? 1 : -1) : 0))) > -2000))).get(), (x, y) -> x)).map(fin -> IntStream.rangeClosed(0, n).filter(j -> (n - j) % 2 == 0).flatMap(j -> IntStream.of(fin[j][0], fin[j][1])).max().orElse(-1000)).get()).max().getAsInt()))));
    }
}
