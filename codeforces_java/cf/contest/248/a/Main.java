import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[]{0, 0} instanceof int[] open
            && IntStream.range(0, n).allMatch(i -> (open[0] += s.nextInt()) >= 0 && (open[1] += s.nextInt()) >= 0)
            ? Math.min(open[0], n - open[0]) + Math.min(open[1], n - open[1]) : "");
    }
}
