import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            && Long.valueOf((long) ((Math.sqrt(8.0 * n + 1) - 1) / 2)) instanceof Long m0
            && LongStream.rangeClosed(Math.max(1, m0 - 3), m0 + 3).filter(t -> t * (t + 1) / 2 >= n).boxed().findFirst().get() instanceof Long m
            ? n - m * (m - 1) / 2 : "");
    }
}
