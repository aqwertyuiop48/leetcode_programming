import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String a
            && sc.next() instanceof String b
            && Integer.valueOf(b.length()) instanceof Integer m
            && new long[][]{new long[m + 1]} instanceof long[][] rows
            ? IntStream.rangeClosed(1, a.length()).mapToLong(i -> new long[m + 1] instanceof long[] cur
                && IntStream.rangeClosed(1, m).allMatch(j -> (cur[j] = (cur[j - 1] + (a.charAt(i - 1) == b.charAt(j - 1) ? rows[0][j - 1] + 1 : 0)) % 1_000_000_007L) >= 0)
                && (rows[0] = cur) != null ? cur[m] : 0).sum() % 1_000_000_007L
            : 0);
    }
}
