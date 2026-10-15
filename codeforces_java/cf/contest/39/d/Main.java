import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.range(0, 3).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, 3).map(i -> s.nextInt()).toArray() instanceof int[] b
            && IntStream.range(0, 3).anyMatch(i -> a[i] == b[i]) ? "YES" : "NO"));
    }
}



