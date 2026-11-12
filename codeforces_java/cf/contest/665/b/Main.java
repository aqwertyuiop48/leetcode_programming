import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, k).map(i -> sc.nextInt()).toArray() instanceof int[] row && new long[]{0} instanceof long[] tot
            && IntStream.range(0, n * m).filter(o -> Integer.valueOf(sc.nextInt()) instanceof Integer x
                && Integer.valueOf(IntStream.range(0, k).filter(i -> row[i] == x).findFirst().getAsInt()) instanceof Integer idx
                && (tot[0] += idx + 1) > 0
                && IntStream.range(0, idx).map(j -> idx - 1 - j).filter(j -> (row[j + 1] = row[j]) >= 0).count() >= 0
                && (row[0] = x) > 0).count() >= 0
            ? tot[0] : "");
    }
}
