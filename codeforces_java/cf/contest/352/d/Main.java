import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] p
            && Integer.valueOf(IntStream.range(0, n).map(i -> (int) IntStream.range(i + 1, n).filter(j -> p[j] < p[i]).count()).sum()) instanceof Integer I
            ? String.format(Locale.US, "%.6f", (double) (2 * I - I % 2)) : "");
    }
}
