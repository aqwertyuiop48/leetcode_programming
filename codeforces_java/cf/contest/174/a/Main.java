import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer v
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Double.valueOf((v + Arrays.stream(a).sum()) / (double) n) instanceof Double t
            ? t < Arrays.stream(a).max().getAsInt() ? "-1" : Arrays.stream(a).mapToObj(x -> String.format("%.6f", t - x)).collect(Collectors.joining("\n"))
            : "");
    }
}

