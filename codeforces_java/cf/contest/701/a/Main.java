import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> a[i])).mapToInt(i -> i).toArray() instanceof int[] s
            ? IntStream.range(0, n / 2).mapToObj(i -> (s[i] + 1) + " " + (s[n - 1 - i] + 1)).collect(Collectors.joining("\n")) : "");
    }
}
