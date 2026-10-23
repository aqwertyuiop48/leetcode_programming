import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer x
            && new int[]{1} instanceof int[] pos
            ? IntStream.range(0, n).map(i ->
                Integer.valueOf(sc.nextInt()) instanceof Integer l
                && Integer.valueOf(sc.nextInt()) instanceof Integer r
                && Integer.valueOf((l - pos[0]) % x + r - l + 1) instanceof Integer cost
                && (pos[0] = r + 1) > 0
                    ? cost
                    : 0).sum()
            : 0);
    }
}
