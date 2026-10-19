import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> Integer.bitCount(s.nextInt())).collect(Collectors.groupingBy(x -> x, Collectors.counting())).values().stream().mapToLong(c -> c * (c - 1) / 2).sum() : "");
    }
}
