import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? s.chars().asLongStream().reduce(0L, (acc, c) -> (acc * 2 + c - '0') % 1000000007L)
                * LongStream.range(0, s.length() - 1).reduce(1L, (r, i) -> r * 2 % 1000000007L) % 1000000007L : "");
    }
}
