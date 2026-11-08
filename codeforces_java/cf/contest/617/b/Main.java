import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, n).filter(i -> t[1 + i].equals("1")).toArray() instanceof int[] o
            ? (o.length == 0 ? 0L : IntStream.range(1, o.length).mapToLong(k -> o[k] - o[k - 1]).reduce(1L, (x, y) -> x * y)) : "");
    }
}
