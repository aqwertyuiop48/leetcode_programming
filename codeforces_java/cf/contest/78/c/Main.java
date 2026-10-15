import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && t[0] % 2 == 1
            && LongStream.rangeClosed(1, (long) Math.sqrt(t[1]) + 1).anyMatch(i -> t[1] % i == 0 && ((i >= t[2] && i < t[1]) || (t[1] / i >= t[2] && t[1] / i < t[1])))
            ? "Timur" : "Marsel");
    }
}


