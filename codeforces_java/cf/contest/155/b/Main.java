import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Stream.generate(() -> new int[]{s.nextInt(), s.nextInt()}).limit(n).sorted(Comparator.<int[]>comparingInt(c -> -c[1]).thenComparingInt(c -> -c[0])).toList() instanceof List<int[]> cards
            && new int[]{1} instanceof int[] left
            ? cards.stream().mapToInt(c -> left[0] > 0 && (left[0] += c[1] - 1) > Integer.MIN_VALUE ? c[0] : 0).sum()
            : 0);
    }
}

