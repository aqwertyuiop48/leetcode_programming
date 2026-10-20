import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] c && Integer.valueOf(s.nextInt()) instanceof Integer x && Integer.valueOf(s.nextInt()) instanceof Integer y
            && Integer.valueOf(Arrays.stream(c).sum()) instanceof Integer tot && new int[n + 1] instanceof int[] P
            && IntStream.range(0, n).allMatch(i -> (P[i + 1] = P[i] + c[i]) >= 0)
            ? IntStream.rangeClosed(1, n).filter(k -> P[k - 1] >= x && P[k - 1] <= y && tot - P[k - 1] >= x && tot - P[k - 1] <= y).max().orElse(0) : "");
    }
}
