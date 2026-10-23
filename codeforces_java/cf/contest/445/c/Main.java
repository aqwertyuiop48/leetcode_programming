import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] v
            ? String.format("%.15f", IntStream.range(0, m).mapToDouble(i -> (v[s.nextInt() - 1] + v[s.nextInt() - 1]) / (double) s.nextInt()).max().orElse(0)) : "");
    }
}
