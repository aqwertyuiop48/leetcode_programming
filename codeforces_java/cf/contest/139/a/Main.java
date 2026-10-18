import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.generate(s::nextInt).limit(7).toArray() instanceof int[] d
            && Integer.valueOf((n - 1) % IntStream.of(d).sum() + 1) instanceof Integer r
            && new int[]{0} instanceof int[] acc
            ? IntStream.range(0, 7).filter(i -> (acc[0] += d[i]) >= r).findFirst().getAsInt() + 1
            : -1);
    }
}
