import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next() instanceof String t
            && Integer.valueOf(t.length()) instanceof Integer n
            && new int[n + 1] instanceof int[] P
            && IntStream.rangeClosed(1, n).allMatch(j -> (P[j] = P[j - 1] + ("AEIOUaeiou".indexOf(t.charAt(j - 1)) >= 0 ? -1 : 2)) > Integer.MIN_VALUE)
            && new int[]{0} instanceof int[] mn
            && IntStream.rangeClosed(0, n).filter(j -> j == 0 || P[j] < mn[0] ? (mn[0] = P[j]) > Integer.MIN_VALUE : false).toArray() instanceof int[] rec
            && Arrays.stream(rec).map(r -> -P[r]).toArray() instanceof int[] neg
            && Integer.valueOf(IntStream.rangeClosed(1, n).map(j -> Integer.valueOf(Arrays.binarySearch(neg, -P[j])) instanceof Integer idx
                ? j - rec[idx >= 0 ? idx : -(idx + 1)] : 0).max().getAsInt()) instanceof Integer best
            ? best == 0 ? "No solution"
                : best + " " + IntStream.rangeClosed(best, n).filter(j -> P[j - best] <= P[j]).count()
            : "");
    }
}
