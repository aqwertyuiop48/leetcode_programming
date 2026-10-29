import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[n + 2] instanceof int[] p
            && IntStream.iterate(1, i -> i <= n / 2, i -> i + 2).allMatch(i -> (p[i] = i + 1) > 0 && (p[i + 1] = n - i + 1) > 0 && (p[n - i + 1] = n - i) > 0 && (p[n - i] = i) > 0)
            && (n % 2 == 0 || (p[(n + 1) / 2] = (n + 1) / 2) > 0)
            && n % 4 < 2 ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(p[i])).collect(Collectors.joining(" ")) : "-1");
    }
}

