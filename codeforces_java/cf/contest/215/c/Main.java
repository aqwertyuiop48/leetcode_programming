import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && (Long) sc.nextLong() instanceof Long n && (Long) sc.nextLong() instanceof Long m && (Long) sc.nextLong() instanceof Long s
            && (Long) ((n - 1) / 2 + 1) instanceof Long na && (Long) ((m - 1) / 2 + 1) instanceof Long nb
            ? LongStream.range(0, na * na).map(t -> (Long) (t / na) instanceof Long a && (Long) (t % na) instanceof Long c
                && (Long) (2 * a + 1) instanceof Long A && (Long) (2 * c + 1) instanceof Long C && (Long) (n - 2 * Math.max(a, c)) instanceof Long W
                && (Long) (s / C) instanceof Long D2 && (Long) (s / A) instanceof Long D4
                ? LongStream.range(0, nb).map(b -> a < c
                    ? (s - A * (2 * b + 1) > 0 && (s - A * (2 * b + 1)) % (C - A) == 0 && (s - A * (2 * b + 1)) / (C - A) % 2 == 1 && (s - A * (2 * b + 1)) / (C - A) <= 2 * b + 1 ? W * (m - 2 * b) : 0L)
                        + (s % C == 0 && D2 % 2 == 1 && D2 > 2 * b + 1 && m - D2 + 1 > 0 ? W * (m - D2 + 1) : 0L)
                    : a > c
                        ? (s - (2 * b + 1) * (A - C) > 0 && (s - (2 * b + 1) * (A - C)) % C == 0 && (s - (2 * b + 1) * (A - C)) / C % 2 == 1 && (s - (2 * b + 1) * (A - C)) / C >= 2 * b + 1 && m - (s - (2 * b + 1) * (A - C)) / C + 1 > 0
                            ? W * (m - (s - (2 * b + 1) * (A - C)) / C + 1) : 0L)
                            + (A * (2 * b + 1) == s ? W * (m - 2 * b) * b : 0L)
                        : (A * (2 * b + 1) == s ? W * (m - 2 * b) * (b + 1) : s % A == 0 && D4 % 2 == 1 && D4 > 2 * b + 1 && m - D4 + 1 > 0 ? W * (m - D4 + 1) : 0L)).sum() : 0L).sum() : 0);
    }
}
