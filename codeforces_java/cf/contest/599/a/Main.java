import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.generate(s::nextInt).limit(3).toArray() instanceof int[] a
                ? Math.min(Math.min(a[0] + a[1] + a[2], 2 * (a[0] + a[1])), Math.min(2 * (a[0] + a[2]), 2 * (a[1] + a[2]))) : 0);
    }
}
