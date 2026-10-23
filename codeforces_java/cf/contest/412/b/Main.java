import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            ? "" + IntStream.range(0, n).map(i -> s.nextInt()).boxed().sorted(Comparator.reverseOrder()).skip(k - 1).findFirst().get() : "");
    }
}
