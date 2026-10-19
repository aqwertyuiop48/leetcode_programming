import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray() instanceof int[] a
            && IntStream.rangeClosed(0, n).filter(c -> k + Arrays.stream(a, 0, c).map(x -> x - 1).sum() >= m).findFirst() instanceof OptionalInt r
            ? r.isPresent() ? r.getAsInt() : -1 : "");
    }
}
