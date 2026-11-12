import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] x
            ? IntStream.range(0, n - 1).filter(i -> s.charAt(i) == 'R' && s.charAt(i + 1) == 'L').map(i -> (x[i + 1] - x[i]) / 2).min().orElse(-1) : "");
    }
}
