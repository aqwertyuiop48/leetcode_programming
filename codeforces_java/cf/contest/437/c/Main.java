import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] v
            ? IntStream.range(0, m).map(i -> Math.min(v[s.nextInt() - 1], v[s.nextInt() - 1])).sum() : 0);
    }
}
