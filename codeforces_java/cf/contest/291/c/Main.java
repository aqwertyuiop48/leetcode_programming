import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToLong(i -> Arrays.stream(s.next().split("\\.")).mapToLong(Long::parseLong).reduce(0, (a, b) -> a * 256 + b)).toArray() instanceof long[] ip
            && IntStream.rangeClosed(1, 31).filter(p -> Arrays.stream(ip).map(x -> x & ((0xFFFFFFFFL << (32 - p)) & 0xFFFFFFFFL)).distinct().count() == k).boxed().findFirst() instanceof Optional<Integer> o
            ? o.isEmpty() ? "-1" : IntStream.of(24, 16, 8, 0).mapToObj(sh -> "" + ((((0xFFFFFFFFL << (32 - o.get())) & 0xFFFFFFFFL) >> sh) & 255)).collect(Collectors.joining(".")) : "");
    }
}

