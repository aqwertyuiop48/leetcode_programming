import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 4).map(i -> s.nextInt()).toArray() instanceof int[] c
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            ? Math.min(c[3], Math.min(c[2], IntStream.range(0, n).map(i -> Math.min(s.nextInt() * c[0], c[1])).sum()) + Math.min(c[2], IntStream.range(0, m).map(i -> Math.min(s.nextInt() * c[0], c[1])).sum())) : "");
    }
}
