import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer lo && (Integer) s.nextInt() instanceof Integer hi
            && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] t
            && IntStream.of(t).allMatch(x -> x >= lo && x <= hi)
            && (IntStream.of(t).anyMatch(x -> x == lo) ? 0 : 1) + (IntStream.of(t).anyMatch(x -> x == hi) ? 0 : 1) <= n - m ? "Correct" : "Incorrect");
    }
}
