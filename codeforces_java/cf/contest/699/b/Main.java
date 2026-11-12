import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toArray(String[]::new) instanceof String[] g
            && new int[n] instanceof int[] rc && new int[m] instanceof int[] cc && new int[]{0} instanceof int[] tot
            && IntStream.range(0, n * m).filter(c -> g[c / m].charAt(c % m) == 42 && ++rc[c / m] + ++cc[c % m] + ++tot[0] > 0).count() >= 0
            && IntStream.range(0, n * m).filter(c -> rc[c / m] + cc[c % m] - (g[c / m].charAt(c % m) == '*' ? 1 : 0) == tot[0]).findFirst() instanceof OptionalInt o
            ? (o.isPresent() ? "YES\n" + (o.getAsInt() / m + 1) + " " + (o.getAsInt() % m + 1) : "NO") : "");
    }
}
