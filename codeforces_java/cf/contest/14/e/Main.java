import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt()} instanceof int[] nt
                && new long[nt[0] + 3][5][2][nt[1] + 1] instanceof long[][][][] dp
                && IntStream.rangeClosed(1, 4).allMatch(y1 -> IntStream.rangeClosed(1, 4).allMatch(y2 -> y2 <= y1 || ++dp[2][y2][1][0] > 0))
                && IntStream.range(2, nt[0]).allMatch(i -> IntStream.rangeClosed(1, 4).allMatch(y -> IntStream.range(0, 2).allMatch(dir ->
                    IntStream.rangeClosed(0, nt[1]).allMatch(h -> IntStream.rangeClosed(1, 4).allMatch(yn ->
                        yn == y || ((yn > y) == (dir == 1)
                            ? (dp[i + 1][yn][dir][h] += dp[i][y][dir][h]) >= 0
                            : dir == 1
                                ? h + 1 > nt[1] || (dp[i + 1][yn][0][h + 1] += dp[i][y][dir][h]) >= 0
                                : (dp[i + 1][yn][1][h] += dp[i][y][dir][h]) >= 0))))))
                ? IntStream.rangeClosed(1, 4).mapToLong(y -> dp[nt[0]][y][0][nt[1]]).sum()
                : 0L));
    }
}





