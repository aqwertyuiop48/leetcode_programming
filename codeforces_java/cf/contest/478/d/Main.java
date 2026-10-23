import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer r
            && (Integer) sc.nextInt() instanceof Integer g
            && (Integer) IntStream.rangeClosed(1, 1000).filter(x -> x * (x + 1) / 2 <= r + g).max().getAsInt() instanceof Integer h
            && new long[][] {new long[r + 1], new long[r + 1]} instanceof long[][] d
            && (d[0][0] = 1) == 1
            && IntStream.rangeClosed(1, h).allMatch(i -> d[1 - (i & 1)] instanceof long[] src && d[i & 1] instanceof long[] dst
                && (Integer) Math.max(0, i * (i + 1) / 2 - g) instanceof Integer lo
                && (Integer) Math.min(r, i * (i + 1) / 2) instanceof Integer hi
                && IntStream.rangeClosed(lo, hi).reduce(0, (u, j) -> (dst[j] = src[j] + (j >= i ? src[j - i] : 0)) < 0 ? 1 : 0) >= 0
                && (i % 16 != 0 && i != h || IntStream.rangeClosed(lo, hi).reduce(0, (u, j) -> (dst[j] %= 1000000007L) < 0 ? 1 : 0) >= 0))
            ? IntStream.rangeClosed(Math.max(0, h * (h + 1) / 2 - g), Math.min(r, h * (h + 1) / 2)).mapToLong(j -> d[h & 1][j]).sum() % 1000000007L : 0);
    }
}
