import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] x
            ? IntStream.range(0, 101).map(k -> ((int) Arrays.stream(x).filter(v -> v <= k).count() + k) / (k + 1)).max().getAsInt() : "");
    }
}
