import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.generate(s::nextInt).limit(3).toArray() instanceof int[] a
            ? IntStream.rangeClosed(0, 2).filter(k -> k <= IntStream.of(a).min().getAsInt()).map(k -> k + IntStream.of(a).map(x -> (x - k) / 3).sum()).max().getAsInt() : "");
    }
}
