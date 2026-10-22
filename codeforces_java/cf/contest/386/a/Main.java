import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] p
            && IntStream.range(0, n).boxed().max(Comparator.comparingInt(i -> p[i])).get() instanceof Integer w
            ? (w + 1) + " " + IntStream.range(0, n).filter(i -> i != w).map(i -> p[i]).max().getAsInt() : "");
    }
}
