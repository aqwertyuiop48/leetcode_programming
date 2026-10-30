import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(0, n).map(i -> a[i] + (i > 0 && i < n - 1 && a[i] == 0 && a[i - 1] == 1 && a[i + 1] == 1 ? 1 : 0)).sum() : 0);
    }
}
