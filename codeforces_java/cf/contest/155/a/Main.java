import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] a
            ? IntStream.range(1, n).filter(i -> Arrays.stream(a, 0, i).max().getAsInt() < a[i] || Arrays.stream(a, 0, i).min().getAsInt() > a[i]).count()
            : 0);
    }
}
