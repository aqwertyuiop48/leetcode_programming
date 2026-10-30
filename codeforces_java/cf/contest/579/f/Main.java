import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Long) sc.nextLong() instanceof Long n && (Long) sc.nextLong() instanceof Long m && sc.next() instanceof String s
            && new int[s.length()] instanceof int[] a
            && IntStream.range(0, s.length()).filter(i -> (a[i] = i == 0 || s.charAt(i) == s.charAt(i - 1) ? 1 : (i >= 2 && s.charAt(i) == s.charAt(i - 2) && a[i - 1] >= 2 ? a[i - 1] + 1 : 2)) > 0).count() >= 0
            ? IntStream.range(0, s.length()).filter(i -> i == 0 || s.charAt(i) != s.charAt(i - 1)).count() * (n * m - n)
                - IntStream.range(0, s.length()).filter(j -> a[j] >= 2 && (j == s.length() - 1 || a[j + 1] != a[j] + 1)).mapToLong(j -> (long) a[j] * (a[j] - 1) / 2).sum() : 0);
    }
}
