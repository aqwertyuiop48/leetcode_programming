import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.generate(s::nextInt).limit(s.nextInt()).toArray() instanceof int[] a
            && Long.valueOf(Arrays.stream(a).filter(x -> x % 2 == 0).count()) instanceof Long e
            ? IntStream.range(0, a.length).filter(i -> a[i] % 2 == (e == 1 ? 0 : 1)).findFirst().getAsInt() + 1
            : 0));
    }
}

