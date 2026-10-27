import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && new int[n + 3][n + 3] instanceof int[][] cnt
            ? IntStream.rangeClosed(1, m).filter(k -> Integer.valueOf(s.nextInt()) instanceof Integer x && Integer.valueOf(s.nextInt()) instanceof Integer y
                && IntStream.range(0, 9).filter(d -> x - d / 3 >= 1 && y - d % 3 >= 1 && x - d / 3 <= n - 2 && y - d % 3 <= n - 2 && ++cnt[x - d / 3][y - d % 3] == 9).count() > 0).findFirst().orElse(-1) : "");
    }
}

