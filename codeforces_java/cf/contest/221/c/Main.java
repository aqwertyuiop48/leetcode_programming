import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && a.clone() instanceof int[] b && Arrays.stream(b).sorted().toArray() instanceof int[] c
            ? IntStream.range(0, n).filter(i -> a[i] != c[i]).count() <= 2 ? "YES" : "NO" : "");
    }
}
