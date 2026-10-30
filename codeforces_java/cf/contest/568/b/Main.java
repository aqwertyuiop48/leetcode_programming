import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && new int[2][n + 2] instanceof int[][] b
            && (b[0][0] = 1) > 0
            && IntStream.rangeClosed(1, n).filter(r -> (b[r & 1][0] = b[(r - 1) & 1][r - 1]) >= 0
                && IntStream.rangeClosed(1, r).filter(j -> (b[r & 1][j] = (int) ((0L + b[r & 1][j - 1] + b[(r - 1) & 1][j - 1]) % 1000000007L)) >= 0 || true).count() >= 0 || true).count() >= 0
            ? (b[n & 1][n] - b[n & 1][0] + 1000000007) % 1000000007
            : 0);
    }
}
