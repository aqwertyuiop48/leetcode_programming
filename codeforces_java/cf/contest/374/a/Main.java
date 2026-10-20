import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer i && Integer.valueOf(s.nextInt()) instanceof Integer j
            && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b
            && Stream.of(new int[]{1, 1}, new int[]{1, m}, new int[]{n, 1}, new int[]{n, m})
                .filter(c -> Math.abs(c[0] - i) % a == 0 && Math.abs(c[1] - j) % b == 0
                    && (Math.abs(c[0] - i) / a) % 2 == (Math.abs(c[1] - j) / b) % 2
                    && (c[0] == i && c[1] == j || !(i + a > n && i - a < 1 || j + b > m && j - b < 1)))
                .mapToInt(c -> Math.max(Math.abs(c[0] - i) / a, Math.abs(c[1] - j) / b)).min() instanceof OptionalInt r
            ? r.isPresent() ? String.valueOf(r.getAsInt()) : "Poor Inna and pony!" : "");
    }
}
