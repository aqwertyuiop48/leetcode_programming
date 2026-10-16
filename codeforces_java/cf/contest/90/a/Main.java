import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.range(0, 3).map(i -> s.nextInt()).toArray() instanceof int[] c
            ? IntStream.range(0, 3).map(i -> c[i] > 0 ? ((c[i] + 1) / 2 - 1) * 3 + i + 30 : 0).max().getAsInt()
            : 0));
    }
}



