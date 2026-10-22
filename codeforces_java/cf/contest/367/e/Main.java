import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer x
            && Long.valueOf(1000000007L) instanceof Long M
            ? n > m ? 0 : new long[2][n + 1][n + 1] instanceof long[][][] B && (B[0][0][0] = 1) == 1
                && IntStream.rangeClosed(1, m).allMatch(p -> B[(p - 1) & 1] instanceof long[][] d && B[p & 1] instanceof long[][] nd
                    && IntStream.rangeClosed(0, n).allMatch(i -> IntStream.rangeClosed(0, i).allMatch(j -> (nd[i][j] = ((p != x ? d[i][j] + (j >= 1 ? d[i][j - 1] : 0) : 0) + (i >= 1 && j <= i - 1 ? d[i - 1][j] : 0) + (i >= 1 && j >= 1 ? d[i - 1][j - 1] : 0)) % M) >= 0)))
                ? LongStream.rangeClosed(1, n).reduce(B[m & 1][n][n], (u, v) -> u * v % M) : "" : "");
    }
}
