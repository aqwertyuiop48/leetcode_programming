import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer h && Integer.valueOf(sc.nextInt()) instanceof Integer w && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, 2 * h - 1).mapToObj(i -> i % 2 == 0 && w == 1 ? "" : sc.next()).toList() instanceof List<String> ln && IntStream.range(0, h).mapToObj(i -> ln.get(2 * i)).toList() instanceof List<String> hz
            && IntStream.range(0, h - 1).mapToObj(i -> ln.get(2 * i + 1)).toList() instanceof List<String> vz
            && new int[h][w] instanceof int[][] c
            ? k == 1 ? Stream.concat(hz.stream(), vz.stream()).mapToLong(z -> z.chars().filter(ch -> ch == 'E').count()).sum() * 2 >= (long) h * (w - 1) + (long) (h - 1) * w
                    ? "YES\n" + IntStream.range(0, h).mapToObj(i -> "1 ".repeat(w).trim()).collect(Collectors.joining("\n")) : "NO"
                : IntStream.range(0, h).allMatch(i -> IntStream.range(1, w).allMatch(j -> (c[i][j] = hz.get(i).charAt(j - 1) == 'E' ? c[i][j - 1] : 1 - c[i][j - 1]) >= 0)
                    && (i == 0 || IntStream.range(0, w).filter(j -> (vz.get(i - 1).charAt(j) == 'E') == (c[i - 1][j] == c[i][j])).count() * 2 >= w || IntStream.range(0, w).allMatch(j -> (c[i][j] = 1 - c[i][j]) >= 0)))
                    ? "YES\n" + Arrays.stream(c).map(r -> Arrays.stream(r).mapToObj(v -> "" + (v + 1)).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "" : "");
    }
}
