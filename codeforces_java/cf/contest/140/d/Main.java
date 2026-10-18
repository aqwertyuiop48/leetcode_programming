import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[]{0} instanceof int[] acc
            && IntStream.generate(s::nextInt).limit(n).sorted().map(x -> acc[0] += x).takeWhile(t -> t <= 710).toArray() instanceof int[] pre
            ? pre.length + " " + IntStream.of(pre).map(t -> Math.max(0, t - 350)).sum()
            : "");
    }
}
