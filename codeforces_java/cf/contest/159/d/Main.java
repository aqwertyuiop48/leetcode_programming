import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n
            && new boolean[n + 1][n + 1] instanceof boolean[][] pal
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(i -> (pal[i][i + len - 1] = s.charAt(i) == s.charAt(i + len - 1) && (len < 3 || pal[i + 1][i + len - 2])) || true))
            && IntStream.range(0, n).mapToLong(j -> IntStream.rangeClosed(0, j).filter(i -> pal[i][j]).count()).toArray() instanceof long[] endAt
            && IntStream.range(0, n).mapToLong(i -> IntStream.range(i, n).filter(j -> pal[i][j]).count()).toArray() instanceof long[] startAt
            ? IntStream.range(0, n - 1).mapToLong(j -> Arrays.stream(endAt, 0, j + 1).sum() * startAt[j + 1]).sum()
            : 0);
    }
}
