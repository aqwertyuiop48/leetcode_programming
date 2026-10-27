import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String a && sc.next() instanceof String b
            && new double[26] instanceof double[] pre && new double[26] instanceof double[] suf
            && IntStream.rangeClosed(1, n).allMatch(i -> (suf[a.charAt(i - 1) - 'A'] += n - i + 1) > 0)
            ? String.format("%.9f", IntStream.rangeClosed(1, n).mapToDouble(j -> (pre[a.charAt(j - 1) - 'A'] += j) > 0 && (suf[a.charAt(j - 1) - 'A'] -= n - j + 1) > -1
                    ? pre[b.charAt(j - 1) - 'A'] * (n - j + 1) + suf[b.charAt(j - 1) - 'A'] * j : 0).sum() / (n * (n + 1.0) * (2.0 * n + 1) / 6)) : "");
    }
}

