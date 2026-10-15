import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.generate(s::nextInt).limit(3).toArray() instanceof int[] v
            && Double.valueOf(v[1] > v[0] + v[2] ? 0.0
                : 1.0 - IntStream.rangeClosed(0, v[2]).mapToDouble(i -> (double) (v[1] - i) / (v[0] + 1 + i)).reduce(1.0, (x, y) -> x * y)) instanceof Double r
            ? r == 0 ? "0" : r == 1 ? "1" : String.format("%.6f", r)
            : ""));

    }
}


