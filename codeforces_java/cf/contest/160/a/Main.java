import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray() instanceof int[] a
            && Integer.valueOf(Arrays.stream(a).sum()) instanceof Integer total
            ? IntStream.rangeClosed(1, n).filter(k -> Arrays.stream(a, 0, k).sum() * 2 > total).findFirst().getAsInt()
            : 0);
    }
}
