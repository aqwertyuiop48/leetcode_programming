import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            ? IntStream.range(1, w.length).mapToObj(i -> w[i].substring(4) instanceof String y
                && Long.valueOf(IntStream.range(0, y.length()).mapToLong(k -> 1L).reduce(1L, (a, b) -> a * 10)) instanceof Long m
                && Long.valueOf(1989 + LongStream.range(1, y.length()).map(k -> IntStream.range(0, (int) k).mapToLong(z -> 1L).reduce(1L, (a, b) -> a * 10)).sum()) instanceof Long st
                && Long.valueOf(st - st % m + Long.parseLong(y)) instanceof Long c
                ? String.valueOf(c >= st ? c : c + m) : "").collect(Collectors.joining("\n"))
            : "");
    }
}
