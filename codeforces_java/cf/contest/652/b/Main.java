import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).sorted().toArray() instanceof int[] a
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(i % 2 == 0 ? a[i / 2] : a[n - 1 - i / 2])).collect(Collectors.joining(" ")) : "");
    }
}
