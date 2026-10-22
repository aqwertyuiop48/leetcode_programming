import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer c
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] x
            ? Math.max(0, IntStream.range(0, n - 1).map(i -> x[i] - x[i + 1] - c).max().orElse(0)) : "");
    }
}
