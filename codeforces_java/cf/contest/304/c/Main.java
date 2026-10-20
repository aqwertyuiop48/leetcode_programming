import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            ? n % 2 == 0 ? "-1" : Stream.<IntUnaryOperator>of(i -> i, i -> i, i -> 2 * i % n).map(f -> IntStream.range(0, n).map(f).mapToObj(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
