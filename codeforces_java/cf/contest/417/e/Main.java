import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && ((java.util.function.IntFunction<int[]>) k -> k == 1 ? new int[]{1} : k == 2 ? new int[]{3, 4}
                : k % 2 == 0 ? IntStream.concat(IntStream.generate(() -> 1).limit(k - 1), IntStream.of((k - 2) / 2)).toArray()
                : IntStream.concat(IntStream.concat(IntStream.of(2), IntStream.generate(() -> 1).limit(k - 2)), IntStream.of((k + 1) / 2)).toArray()) instanceof java.util.function.IntFunction<int[]> v
            && v.apply(n) instanceof int[] a && v.apply(m) instanceof int[] b
            ? Arrays.stream(a).mapToObj(x -> Arrays.stream(b).mapToObj(y -> String.valueOf(x * y)).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
