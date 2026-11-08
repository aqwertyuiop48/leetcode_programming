import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer r && Integer.valueOf(t[1]) instanceof Integer c && Integer.valueOf(t[2]) instanceof Integer n && Integer.valueOf(t[3]) instanceof Integer k
            ? IntStream.rangeClosed(1, r).mapToLong(x1 -> IntStream.rangeClosed(x1, r).mapToLong(x2 -> IntStream.rangeClosed(1, c).mapToLong(y1 -> IntStream.rangeClosed(y1, c)
                .filter(y2 -> IntStream.range(0, n).filter(i -> Integer.parseInt(t[4 + 2 * i]) >= x1 && Integer.parseInt(t[4 + 2 * i]) <= x2 && Integer.parseInt(t[5 + 2 * i]) >= y1 && Integer.parseInt(t[5 + 2 * i]) <= y2).count() >= k).count()).sum()).sum()).sum() : "");
    }
}
